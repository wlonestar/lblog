package com.wjl.lblog.service.impl;

import com.google.common.collect.Lists;
import com.querydsl.core.QueryResults;
import com.querydsl.core.Tuple;
import com.querydsl.core.types.Projections;
import com.wjl.lblog.component.QueryComponent;
import com.wjl.lblog.model.dto.ArticleSummaryDto;
import com.wjl.lblog.model.entity.Article;
import com.wjl.lblog.model.dto.ArticleDto;
import com.wjl.lblog.model.entity.Category;
import com.wjl.lblog.model.entity.QArticle;
import com.wjl.lblog.model.entity.QCategory;
import com.wjl.lblog.repository.ArticleRepository;
import com.wjl.lblog.repository.CategoryRepository;
import com.wjl.lblog.service.intf.ArticleService;
import com.wjl.lblog.service.intf.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

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
    private QueryComponent queryComponent;

    @Autowired
    private ArticleRepository articleRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private CategoryService categoryService;

    QArticle qArticle = QArticle.article;

    QCategory qCategory = QCategory.category;

    /**
     * 分页查询
     *
     * @param pageable pageable
     */
    @Override
    public Page<ArticleSummaryDto> findAllByPage(Pageable pageable) {
        QueryResults<Tuple> queryResults = queryComponent.queryFactory()
                .select(
                        qArticle.id,
                        qArticle.createTime,
                        qArticle.updateTime,
                        qArticle.title,
                        qArticle.summary,
                        qArticle.image,
                        qCategory.id.as("categoryId"),
                        qCategory.name.as("categoryName")
                )
                .from(qArticle, qCategory)
                .where(qArticle.categoryId.eq(qCategory.id))
                .orderBy(qArticle.createTime.desc())
                .offset(pageable.getOffset())
                .limit(pageable.getPageSize())
                .fetchResults();
        List<Tuple> tuples = queryResults.getResults();
        List<ArticleSummaryDto> articleSummaryDtos = this.tupleToArticleSummaryDto(tuples);
        return new PageImpl<>(articleSummaryDtos, pageable, queryResults.getTotal());
    }

    /**
     * 查询所有
     */
    @Override
    public List<ArticleSummaryDto> findAllArticleSummary() {
        return queryComponent.queryFactory()
                .select(
                        Projections.bean(
                                ArticleSummaryDto.class,
                                qArticle.id,
                                qArticle.createTime,
                                qArticle.updateTime,
                                qArticle.title,
                                qArticle.summary,
                                qArticle.image,
                                qCategory.id.as("categoryId"),
                                qCategory.name.as("categoryName")
                        )
                )
                .from(qArticle, qCategory)
                .where(qArticle.categoryId.eq(qCategory.id))
                .orderBy(qArticle.createTime.desc())
                .fetch();
    }

    /**
     * 根据 id 查询
     *
     * @param id id
     */
    @Override
    public ArticleDto findById(Long id) {
        return queryComponent.queryFactory()
                .select(
                        Projections.bean(
                                ArticleDto.class,
                                qArticle.id,
                                qArticle.createTime,
                                qArticle.updateTime,
                                qArticle.title,
                                qArticle.summary,
                                qArticle.image,
                                qArticle.content,
                                qCategory.id.as("categoryId"),
                                qCategory.name.as("categoryName")
                        )
                )
                .from(qArticle, qCategory)
                .where(
                        qArticle.id.eq(id)
                                .and(qArticle.categoryId.eq(qCategory.id))
                )
                .orderBy(qArticle.createTime.desc())
                .fetchOne();
    }

    /**
     * 根据标题查询
     *
     * @param title title
     */
    @Override
    public ArticleDto findByTitle(String title) {
        return queryComponent.queryFactory()
                .select(
                        Projections.bean(
                                ArticleDto.class,
                                qArticle.id,
                                qArticle.createTime,
                                qArticle.updateTime,
                                qArticle.title,
                                qArticle.summary,
                                qArticle.image,
                                qArticle.content,
                                qCategory.id.as("categoryId"),
                                qCategory.name.as("categoryName")
                        )
                )
                .from(qArticle, qCategory)
                .where(
                        qArticle.title.eq(title)
                                .and(qArticle.categoryId.eq(qCategory.id))
                )
                .orderBy(qArticle.createTime.desc())
                .fetchOne();
    }

    /**
     * 增加
     *
     * @param articleDto articleDto
     */
    @Override
    public ArticleDto add(ArticleDto articleDto) {
        Article article = new Article();
        article.setTitle(articleDto.getTitle());
        article.setSummary(articleDto.getSummary());
        article.setImage(articleDto.getImage());
        article.setContent(articleDto.getContent());
        Category category = categoryRepository.findCategoryByName(articleDto.getCategoryName());
        if (!Objects.isNull(category)) {
            article.setCategoryId(article.getCategoryId());
            articleRepository.save(article);
            return articleDto;
        } else {
            return null;
        }
    }

    /**
     * 更新
     *
     * @param id id
     * @param articleDto articleDto
     */
    @Override
    public ArticleDto update(Long id, ArticleDto articleDto) {
        Article article = articleRepository.findById(id).orElseThrow();
        Category category = categoryRepository.findCategoryByName(articleDto.getCategoryName());
        if (!Objects.isNull(article)) {
            queryComponent.queryFactory()
                    .update(qArticle)
                    .where(qArticle.id.eq(id))
                    .set(qArticle.title, articleDto.getTitle())
                    .set(qArticle.summary, articleDto.getSummary())
                    .set(qArticle.image, articleDto.getImage())
                    .set(qArticle.content, articleDto.getContent())
                    .set(qArticle.categoryId, category.getId())
                    .execute();
            return articleDto;
        } else {
            return null;
        }
    }

    /**
     * 根据 id 删除
     *
     * @param id
     */
    @Override
    public Article deleteById(Long id) {
        Article article = articleRepository.findById(id).orElseThrow();
        if (!Objects.isNull(article)) {
            articleRepository.deleteById(id);
            Category category = categoryRepository.findCategoryById(article.getCategoryId());
            categoryService.update(category.getId(), category);
            return article;
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

    private List<ArticleSummaryDto> tupleToArticleSummaryDto(List<Tuple> tuples) {
        List<ArticleSummaryDto> articleSummaryDtos = Lists.newArrayList();
        for (Tuple tuple : tuples) {
            ArticleSummaryDto articleSummaryDto = new ArticleSummaryDto();
            articleSummaryDto.setId(tuple.get(qArticle.id));
            articleSummaryDto.setCreateTime(tuple.get(qArticle.createTime));
            articleSummaryDto.setUpdateTime(tuple.get(qArticle.updateTime));
            articleSummaryDto.setTitle(tuple.get(qArticle.title));
            articleSummaryDto.setSummary(tuple.get(qArticle.summary));
            articleSummaryDto.setImage(tuple.get(qArticle.image));
            articleSummaryDto.setCategoryId(tuple.get(qCategory.id));
            articleSummaryDto.setCategoryName(tuple.get(qCategory.name));
            articleSummaryDtos.add(articleSummaryDto);
        }
        return articleSummaryDtos;
    }

}
