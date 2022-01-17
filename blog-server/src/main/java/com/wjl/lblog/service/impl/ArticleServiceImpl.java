package com.wjl.lblog.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.conditions.update.LambdaUpdateChainWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wjl.lblog.model.dto.ArticleDto;
import com.wjl.lblog.model.entity.Article;
import com.wjl.lblog.model.entity.Category;
import com.wjl.lblog.model.vo.ArticleDetailVo;
import com.wjl.lblog.model.vo.ArticleSummaryVo;
import com.wjl.lblog.model.vo.ArticleTitleVo;
import com.wjl.lblog.repository.ArticleRepository;
import com.wjl.lblog.repository.CategoryRepository;
import com.wjl.lblog.service.intf.ArticleService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 * @author: wjl
 * @date: 2021/9/13 21:58
 * @version: v1.0
 */
@Service
public class ArticleServiceImpl
        extends ServiceImpl<ArticleRepository, Article>
        implements ArticleService {

    @Resource
    private ArticleRepository articleRepository;

    @Resource
    private CategoryRepository categoryRepository;


    @Override
    public IPage<ArticleDetailVo> selectDetailByPage(Page<ArticleDetailVo> page) {
        return articleRepository.selectDetailByPage(page);
    }

    @Override
    public IPage<ArticleSummaryVo> selectSummaryByPage(Page<ArticleSummaryVo> page) {
        return articleRepository.selectSummaryByPage(page);
    }

    @Override
    public IPage<ArticleTitleVo> selectTitleByPage(Page<ArticleTitleVo> page) {
        return articleRepository.selectTitleByPage(page);
    }


    @Override
    public List<ArticleDetailVo> selectDetailAll() {
        return articleRepository.selectDetailAll();
    }

    @Override
    public List<ArticleSummaryVo> selectSummaryAll() {
        return articleRepository.selectSummaryAll();
    }

    @Override
    public List<ArticleTitleVo> selectTitleAll() {
        return articleRepository.selectTitleByAll();
    }


    @Override
    public ArticleDetailVo selectDetailById(Long id) {
        ArticleDetailVo articleDetailVo = articleRepository.selectDetailById(id);
        if (!Objects.isNull(articleDetailVo)) {
            return articleDetailVo;
        }
        return null;
    }

    @Override
    public ArticleSummaryVo selectSummaryById(Long id) {
        ArticleSummaryVo articleSummaryVo = articleRepository.selectSummaryById(id);
        if (!Objects.isNull(articleSummaryVo)) {
            return articleSummaryVo;
        }
        return null;
    }

    @Override
    public ArticleTitleVo selectTitleById(Long id) {
        ArticleTitleVo articleTitleVo = articleRepository.selectTitleById(id);
        if (!Objects.isNull(articleTitleVo)) {
            return articleTitleVo;
        }
        return null;
    }


    @Override
    public ArticleDetailVo selectDetailByTitle(String title) {
        ArticleDetailVo articleDetailVo = articleRepository.selectDetailByTitle(title);
        if (!Objects.isNull(articleDetailVo)) {
            return articleDetailVo;
        }
        return null;
    }

    @Override
    public ArticleSummaryVo selectSummaryByTitle(String title) {
        ArticleSummaryVo articleSummaryVo = articleRepository.selectSummaryByTitle(title);
        if (!Objects.isNull(articleSummaryVo)) {
            return articleSummaryVo;
        }
        return null;
    }

    @Override
    public ArticleTitleVo selectTitleByTitle(String title) {
        ArticleTitleVo articleTitleVo = articleRepository.selectTitleByTitle(title);
        if (!Objects.isNull(articleTitleVo)) {
            return articleTitleVo;
        }
        return null;
    }



    @Override
    public boolean addArticle(ArticleDto articleDto) {
        Article article = new Article();
        if (!Objects.isNull(articleDto)) {
            processCategory(article, articleDto);
            articleRepository.insert(article);
            return true;
        }
        return false;
    }

    @Override
    public boolean updateArticle(Long id, ArticleDto articleDto) {
        Article article = articleRepository.selectById(id);
        if (!Objects.isNull(article)) {
            processCategory(article, articleDto);
            article.setUpdateTime(new Date());
            articleRepository.updateById(article);
            return true;
        }
        return false;
    }

    private void processCategory(Article article, ArticleDto articleDto) {
        BeanUtils.copyProperties(articleDto, article, "category");
        Category category = categoryRepository.selectCategoryByName(articleDto.getCategory());
        if (Objects.isNull(category)) {
            Category category1 = new Category();
            category1.setName(articleDto.getCategory());
            category1.setNumber(1);
            categoryRepository.insert(category1);
            article.setCategoryId(categoryRepository.selectCategoryByName(category1.getName()).getId());
        } else {
            category.setNumber(category.getNumber() + 1);
            categoryRepository.updateById(category);
            article.setCategoryId(category.getId());
        }
    }

}
