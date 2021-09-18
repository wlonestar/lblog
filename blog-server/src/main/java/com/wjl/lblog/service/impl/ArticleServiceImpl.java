package com.wjl.lblog.service.impl;

import com.wjl.lblog.model.entity.Article;
import com.wjl.lblog.model.entity.Category;
import com.wjl.lblog.model.vo.ArticleVo;
import com.wjl.lblog.repository.ArticleRepository;
import com.wjl.lblog.repository.CategoryRepository;
import com.wjl.lblog.service.intf.ArticleService;
import com.wjl.lblog.service.intf.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author: wjl
 * @date: 2021/9/13 21:58
 * @version: v1.0
 */
@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleRepository articleRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private CategoryService categoryService;

    /**
     * 分页查询
     *
     * @param pageable
     */
    @Override
    public Page<ArticleVo> findAllByPage(Pageable pageable) {
        Page<Article> articlePage = articleRepository.findAll(pageable);
        List<Article> articleList = articlePage.getContent();
        List<ArticleVo> articleVoList = new ArrayList<>();
        for (Article article : articleList) {
            ArticleVo articleVo = new ArticleVo();
            copyFromArticleToArticleVo(article, articleVo);
            articleVoList.add(articleVo);
        }
        return new PageImpl<>(articleVoList);
    }

    /**
     * 查询所有
     */
    @Override
    public List<ArticleVo> findAll() {
        List<Article> articles = articleRepository.findAll();
        List<ArticleVo> articleVos = new ArrayList<>();
        for (Article article : articles) {
            ArticleVo articleVo = new ArticleVo();
            copyFromArticleToArticleVo(article, articleVo);
            articleVos.add(articleVo);
        }
        return articleVos;
    }

    /**
     * 根据 id 查询
     *
     * @param id
     */
    @Override
    public ArticleVo findById(Long id) {
        Article article = articleRepository.findById(id).orElseThrow();
        ArticleVo articleVo = new ArticleVo();
        if (!Objects.isNull(article)) {
            copyFromArticleToArticleVo(article, articleVo);
        }
        return articleVo;
    }

    /**
     * 增加
     *
     * @param articleVo
     */
    @Override
    public ArticleVo add(ArticleVo articleVo) {
        // category
        String categoryName = articleVo.getCategory();
        Category category = categoryService.findByName(categoryName);
        categoryRepository.save(category);
        Article article = new Article();
        copyFromArticleVoToArticle(articleVo, article);
        // category
        article.setCategory(category);
        category.setNumber(category.getNumber() + 1);
        categoryRepository.save(category);
        articleRepository.save(article);
        return articleVo;
    }

    /**
     * 更新
     *
     * @param id
     * @param articleVo
     */
    @Override
    public ArticleVo update(Long id, ArticleVo articleVo) {
        // category
        String categoryName = articleVo.getCategory();
        Category category = categoryService.findByName(categoryName);
        categoryRepository.save(category);
        Article article = articleRepository.findById(id).orElseThrow();
        if (!Objects.equals(article, null)) {
            copyFromArticleVoToArticle(articleVo, article);
            // category
            article.setCategory(category);
            category.setNumber(category.getArticleList().size());
            categoryRepository.save(category);
            articleRepository.save(article);
            return articleVo;
        }
        return null;
    }

    /**
     * 根据 id 删除
     *
     * @param id
     */
    @Override
    public Long deleteById(Long id) {
        Article article = articleRepository.findById(id).orElseThrow();
        if (!Objects.isNull(article)) {
            articleRepository.deleteById(id);
            // category
            Category category = article.getCategory();
            category.setNumber(category.getArticleList().size());
            categoryRepository.save(category);
            return id;
        }
        return null;
    }

    /**
     * 删除所有
     */
    @Override
    public void deleteAll() {
        articleRepository.deleteAll();
    }

    public static void copyFromArticleToArticleVo(Article article, ArticleVo articleVo) {
        articleVo.setId(article.getId());
        articleVo.setCreateTime(article.getCreateTime());
        articleVo.setUpdateTime(article.getUpdateTime());
        articleVo.setTitle(article.getTitle());
        articleVo.setImage(article.getImage());
        articleVo.setSummary(article.getSummary());
        articleVo.setContent(article.getContent());
        articleVo.setCategory(article.getCategory().getName());
    }

    public static void copyFromArticleVoToArticle(ArticleVo articleVo, Article article) {
        article.setTitle(articleVo.getTitle());
        article.setImage(articleVo.getImage());
        article.setSummary(articleVo.getSummary());
        article.setContent(articleVo.getContent());
    }

}