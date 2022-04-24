package com.wjl.lblog.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wjl.lblog.model.dto.ArticleDto;
import com.wjl.lblog.model.entity.Article;
import com.wjl.lblog.model.entity.Category;
import com.wjl.lblog.model.vo.ArticleDetailVo;
import com.wjl.lblog.model.vo.ArticleSummaryVo;
import com.wjl.lblog.model.vo.ArticleTitleVo;
import com.wjl.lblog.repository.ArticleMapper;
import com.wjl.lblog.repository.CategoryMapper;
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
        extends ServiceImpl<ArticleMapper, Article>
        implements ArticleService {

    @Resource
    private ArticleMapper articleMapper;

    @Resource
    private CategoryMapper categoryMapper;

    @Override
    public IPage<ArticleDetailVo> selectDetailByPage(Page<ArticleDetailVo> page) {
        return articleMapper.selectDetailByPage(page);
    }

    @Override
    public IPage<ArticleSummaryVo> selectSummaryByPage(Page<ArticleSummaryVo> page) {
        return articleMapper.selectSummaryByPage(page);
    }

    @Override
    public IPage<ArticleTitleVo> selectTitleByPage(Page<ArticleTitleVo> page) {
        return articleMapper.selectTitleByPage(page);
    }

    @Override
    public List<ArticleDetailVo> selectDetailAll() {
        return articleMapper.selectDetailAll();
    }

    @Override
    public List<ArticleSummaryVo> selectSummaryAll() {
        return articleMapper.selectSummaryAll();
    }

    @Override
    public List<ArticleTitleVo> selectTitleAll() {
        return articleMapper.selectTitleByAll();
    }

    @Override
    public ArticleDetailVo selectDetailById(Long id) {
        ArticleDetailVo articleDetailVo = articleMapper.selectDetailById(id);
        if (!Objects.isNull(articleDetailVo)) {
            return articleDetailVo;
        }
        return null;
    }

    @Override
    public ArticleSummaryVo selectSummaryById(Long id) {
        ArticleSummaryVo articleSummaryVo = articleMapper.selectSummaryById(id);
        if (!Objects.isNull(articleSummaryVo)) {
            return articleSummaryVo;
        }
        return null;
    }

    @Override
    public ArticleTitleVo selectTitleById(Long id) {
        ArticleTitleVo articleTitleVo = articleMapper.selectTitleById(id);
        if (!Objects.isNull(articleTitleVo)) {
            return articleTitleVo;
        }
        return null;
    }

    @Override
    public ArticleDetailVo selectDetailByTitle(String title) {
        ArticleDetailVo articleDetailVo = articleMapper.selectDetailByTitle(title);
        if (!Objects.isNull(articleDetailVo)) {
            return articleDetailVo;
        }
        return null;
    }

    @Override
    public ArticleSummaryVo selectSummaryByTitle(String title) {
        ArticleSummaryVo articleSummaryVo = articleMapper.selectSummaryByTitle(title);
        if (!Objects.isNull(articleSummaryVo)) {
            return articleSummaryVo;
        }
        return null;
    }

    @Override
    public ArticleTitleVo selectTitleByTitle(String title) {
        ArticleTitleVo articleTitleVo = articleMapper.selectTitleByTitle(title);
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
            articleMapper.insert(article);
            return true;
        }
        return false;
    }

    @Override
    public boolean updateArticle(Long id, ArticleDto articleDto) {
        Article article = articleMapper.selectById(id);
        if (!Objects.isNull(article)) {
            processCategory(article, articleDto);
            article.setUpdateTime(new Date());
            articleMapper.updateById(article);
            return true;
        }
        return false;
    }

    private void processCategory(Article article, ArticleDto articleDto) {
        BeanUtils.copyProperties(articleDto, article, "category");
        Category category = categoryMapper.selectCategoryByName(articleDto.getCategory());
        if (Objects.isNull(category)) {
            Category category1 = new Category();
            category1.setName(articleDto.getCategory());
            category1.setNumber(1);
            categoryMapper.insert(category1);
            article.setCategoryId(categoryMapper.selectCategoryByName(category1.getName()).getId());
        } else {
            category.setNumber(category.getNumber() + 1);
            categoryMapper.updateById(category);
            article.setCategoryId(category.getId());
        }
    }

}
