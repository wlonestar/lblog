package com.wjl.lblog.service.impl;

import com.querydsl.core.QueryResults;
import com.querydsl.core.Tuple;
import com.wjl.lblog.component.QueryComponent;
import com.wjl.lblog.model.dto.*;
import com.wjl.lblog.model.entity.*;
import com.wjl.lblog.model.vo.*;
import com.wjl.lblog.repository.*;
import com.wjl.lblog.service.intf.*;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * @author: wjl
 * @date: 2021/9/13 21:58
 * @version: v1.0
 */
@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private QueryComponent queryComponent;

    @Autowired
    private ArticleRepository articleRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private TagRepository tagRepository;

    @Autowired
    private ArticleTagRepository articleTagRepository;

    @Autowired
    private TagService tagService;

    @Autowired
    private CategoryService categoryService;

    QArticle qArticle = QArticle.article;

    QCategory qCategory = QCategory.category;

    @Override
    public List<ArticleSummaryVo> findAllSummary() {
        List<Article> articles = articleRepository.findAll();
        List<ArticleSummaryVo> articleSummaryVos = new ArrayList<>();
        for (Article article : articles) {
            ArticleSummaryVo articleSummaryVo = new ArticleSummaryVo();
            BeanUtils.copyProperties(article, articleSummaryVo, "content", "categoryId");
            // category
            CategoryDto categoryDto = categoryService.findCategoryDtoById(article.getCategoryId());
            articleSummaryVo.setCategory(categoryDto.getName());
            articleSummaryVo.setCategoryId(categoryDto.getId());
            // add to list
            articleSummaryVos.add(articleSummaryVo);
        }
        return articleSummaryVos;
    }

    @Override
    public List<ArticleDetailVo> findAllDetail() {
        List<Article> articles = articleRepository.findAll();
        List<ArticleDetailVo> articleDetailVos = new ArrayList<>();
        for (Article article : articles) {
            ArticleDetailVo articleDetailVo = new ArticleDetailVo();
            BeanUtils.copyProperties(article, articleDetailVo, "categoryId");
            // category
            CategoryDto categoryDto = categoryService.findCategoryDtoById(article.getCategoryId());
            articleDetailVo.setCategory(categoryDto);
            // tag
            List<TagDto> tags = tagService.findTagsByArticleId(article.getId());
            articleDetailVo.setTags(tags);
            // add to list
            articleDetailVos.add(articleDetailVo);
        }
        return articleDetailVos;
    }

    @Override
    public List<ArticleTitleVo> findAllTitle() {
        List<Article> articles = articleRepository.findAll();
        List<ArticleTitleVo> articleTitleVos = new ArrayList<>();
        for (Article article : articles) {
            ArticleTitleVo articleTitleVo = new ArticleTitleVo(article.getId(),
                    article.getCreateTime(), article.getTitle());
            articleTitleVos.add(articleTitleVo);
        }
        return articleTitleVos;
    }

    @Override
    public Page<ArticleSummaryVo> findSummaryByPage(Pageable pageable) {
        QueryResults<Tuple> queryResults = queryComponent.queryFactory()
                .select(
                        qArticle.id,
                        qArticle.createTime,
                        qArticle.updateTime,
                        qArticle.title,
                        qArticle.summary,
                        qArticle.cover,
                        qCategory.id,
                        qCategory.name
                )
                .from(qArticle, qCategory)
                .where(qArticle.categoryId.eq(qCategory.id))
                .orderBy(qArticle.createTime.desc())
                .offset(pageable.getOffset())
                .limit(pageable.getPageSize())
                .fetchResults();
        List<Tuple> tuples = queryResults.getResults();
        List<ArticleSummaryVo> articleSummaryVos = new ArrayList<>();
        for (Tuple tuple : tuples) {
            ArticleSummaryVo articleSummaryVo = new ArticleSummaryVo();
            articleSummaryVo.setId(tuple.get(qArticle.id));
            articleSummaryVo.setCreateTime(tuple.get(qArticle.createTime));
            articleSummaryVo.setUpdateTime(tuple.get(qArticle.updateTime));
            articleSummaryVo.setTitle(tuple.get(qArticle.title));
            articleSummaryVo.setSummary(tuple.get(qArticle.summary));
            articleSummaryVo.setCover(tuple.get(qArticle.cover));
            articleSummaryVo.setCategoryId(tuple.get(qCategory.id));
            articleSummaryVo.setCategory(tuple.get(qCategory.name));
            articleSummaryVos.add(articleSummaryVo);
        }
        return new PageImpl<>(articleSummaryVos, pageable, queryResults.getTotal());
    }

    @Override
    public ArticleDetailVo getById(Long id) {
        ArticleDetailVo articleDetailVo = new ArticleDetailVo();
        Article article = articleRepository.findArticleById(id);
        if (!Objects.isNull(article)) {
            BeanUtils.copyProperties(article, articleDetailVo, "categoryId");
            CategoryDto categoryDto = categoryService.findCategoryDtoById(article.getCategoryId());
            articleDetailVo.setCategory(categoryDto);
            List<TagDto> tagDtos = tagService.findTagsByArticleId(article.getId());
            articleDetailVo.setTags(tagDtos);
            return articleDetailVo;
        } else {
            return null;
        }
    }

    @Override
    public ArticleDetailVo getByTitle(String title) {
        Article article = articleRepository.findArticleByTitle(title);
        if (!Objects.isNull(article)) {
            return getById(article.getId());
        } else {
            return null;
        }
    }

    @Override
    public Article findById(Long id) {
        Article article = articleRepository.findArticleById(id);
        if (!Objects.isNull(article)) {
            return article;
        }
        return null;
    }

    @Override
    public Article findByTitle(String title) {
        Article article = articleRepository.findArticleByTitle(title);
        if (!Objects.isNull(article)) {
            return article;
        }
        return null;
    }

    @Override
    public boolean add(ArticleDto articleDto) {
        if (!Objects.isNull(articleDto)) {
            Article article = new Article();
            BeanUtils.copyProperties(articleDto, article, "categoryName", "tagName");
            // category
            String categoryName = articleDto.getCategory();
            if (!Objects.isNull(categoryName)) {
                Category category = categoryRepository.findCategoryByName(categoryName);
                if (Objects.isNull(category)) {
                    Category category1 = new Category();
                    category1.setName(categoryName);
                    category1.setNumber(1);
                    categoryRepository.save(category1);
                    Category category2 = categoryRepository.findCategoryByName(categoryName);
                    article.setCategoryId(category2.getId());
                } else {
                    category.setNumber(category.getNumber() + 1);
                    article.setCategoryId(category.getId());
                }
                articleRepository.save(article);
                // tag
                // 去重
                List<String> tags = articleDto.getTags();
                Set<String> set = new HashSet<>(tags);
                tags.clear();
                tags.addAll(set);
                for (String tagName : tags) {
                    ArticleTag articleTag = new ArticleTag();
                    articleTag.setAid(articleRepository.findArticleByTitle(article.getTitle()).getId());
                    if (!Objects.isNull(tagName)) {
                        Tag tag = tagRepository.findTagByName(tagName);
                        if (Objects.isNull(tag)) {
                            Tag tag1 = new Tag();
                            tag1.setName(tagName);
                            tag1.setNumber(1);
                            tagRepository.save(tag1);
                            Tag tag2 = tagRepository.findTagByName(tagName);
                            articleTag.setTid(tag2.getId());
                            articleTagRepository.save(articleTag);
                        } else {
                            tag.setNumber(tag.getNumber() + 1);
                            articleTag.setTid(tag.getId());
                            articleTagRepository.save(articleTag);
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    // TODO
    @Override
    public boolean update(Long id, ArticleDto articleDto) {
        Article article = articleRepository.findArticleById(id);
        if (!Objects.isNull(article)) {
            BeanUtils.copyProperties(articleDto, article, "categoryName", "tagName");
            articleRepository.save(article);
        }
        return false;
    }

    @Override
    public boolean deleteById(Long id) {
        Article article = articleRepository.findArticleById(id);
        if (!Objects.isNull(article)) {
            articleRepository.deleteById(id);
            return true;
        }
        return false;
    }

}
