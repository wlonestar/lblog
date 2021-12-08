package com.wjl.lblog.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.querydsl.core.QueryResults;
import com.querydsl.core.Tuple;
import com.querydsl.core.types.Projections;
import com.wjl.lblog.component.QueryComponent;
import com.wjl.lblog.model.dto.ArticleDto;
import com.wjl.lblog.model.entity.*;
import com.wjl.lblog.model.vo.ArticleSummaryVo;
import com.wjl.lblog.model.vo.ArticleDetailVo;
import com.wjl.lblog.model.vo.ArticleTitleVo;
import com.wjl.lblog.repository.ArticleRepository;
import com.wjl.lblog.repository.ArticleTagRepository;
import com.wjl.lblog.repository.CategoryRepository;
import com.wjl.lblog.repository.TagRepository;
import com.wjl.lblog.service.intf.ArticleService;
import com.wjl.lblog.service.intf.CategoryService;
import org.springframework.beans.BeanUtils;
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
    private CategoryService categoryService;

    QArticle qArticle = QArticle.article;

    QCategory qCategory = QCategory.category;

    /**
     * 分页查询
     *
     * @param pageable pageable
     */
    @Deprecated
    @Override
    public Page<ArticleSummaryVo> findAllByPage(Pageable pageable) {
        QueryResults<Tuple> queryResults = queryComponent.queryFactory()
                .select(
                        qArticle.id,
                        qArticle.createTime,
                        qArticle.updateTime,
                        qArticle.title,
                        qArticle.summary,
                        qArticle.cover,
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
        List<ArticleSummaryVo> articleSummaryDtos = this.tupleToArticleSummaryDto(tuples);
        return new PageImpl<>(articleSummaryDtos, pageable, queryResults.getTotal());
    }

    @Override
    public Page<ArticleDetailVo> findArticleDetailsByPage(Pageable pageable) {
        return null;
    }

    @Override
    public Page<ArticleTitleVo> findArticleTitlesByPage(Pageable pageable) {
        return null;
    }

    /**
     * 查询所有
     */
    @Override
    public List<ArticleSummaryVo> findAllArticleSummary() {
//        return queryComponent.queryFactory()
//                .select(
//                        Projections.bean(
//                                ArticleSummaryDto.class,
//                                qArticle.id,
//                                qArticle.createTime,
//                                qArticle.updateTime,
//                                qArticle.title,
//                                qArticle.summary,
//                                qArticle.image,
//                                qCategory.id.as("categoryId"),
//                                qCategory.name.as("categoryName")
//                        )
//                )
//                .from(qArticle, qCategory)
//                .where(qArticle.categoryId.eq(qCategory.id))
//                .orderBy(qArticle.createTime.desc())
//                .fetch();
        return null;
    }

    @Override
    public List<ArticleDetailVo> findArticleDetails() {
        return null;
    }

    @Override
    public List<ArticleTitleVo> findArticleTitles() {
        return null;
    }

    @Override
    public List<Article> findArticles() {
        return null;
    }

    @Override
    public List<ArticleDto> findAllArticleDtoByArticleId(Long aid) {
        return null;
    }

    @Override
    public List<ArticleDto> findAllArticleDtoByTagId(Long tid) {
        return null;
    }

    /**
     * 根据 id 查询
     *
     * @param id id
     */
    @Override
    public ArticleDetailVo findById(Long id) {
        Article article = findArticleById(id);
        if (!Objects.isNull(article)) {
            ArticleSummaryVo articleSummaryVo = findArticleSummaryById(id);
            ArticleDetailVo articleDetailVo = new ArticleDetailVo();
            BeanUtils.copyProperties(articleSummaryVo, articleDetailVo);
            articleDetailVo.setContent(article.getContent());
            return articleDetailVo;
        }
        return null;
    }

    @Override
    public ArticleSummaryVo findArticleSummaryById(Long id) {
        Article article = findArticleById(id);
        if (!Objects.isNull(article)) {
            Category category = categoryRepository.findCategoryById(article.getCategoryId());
            if (!Objects.isNull(category)) {
                List<ArticleTag> articleTags = articleTagRepository.findArticleTagsByAid(id);
                List<Tag> tags = new ArrayList<>();
                for (ArticleTag articleTag : articleTags) {
                    Tag tag = tagRepository.findTagById(articleTag.getTid());
                    if (!Objects.isNull(tag)) {
                        tags.add(tag);
                    }
                }
                ArticleSummaryVo articleSummaryVo = new ArticleSummaryVo();
                BeanUtils.copyProperties(article, articleSummaryVo, "category_id", "content");
                articleSummaryVo.setCategory(category);
                articleSummaryVo.setTags(tags);
                return articleSummaryVo;
            }
        }
        return null;
    }

    @Override
    public ArticleTitleVo findArticleTitleById(Long id) {
        if (!Objects.isNull(findArticleById(id))) {
            return queryComponent.queryFactory()
                    .select(
                            Projections.bean(
                                    ArticleTitleVo.class,
                                    qArticle.id,
                                    qArticle.createTime.as("articleTime"),
                                    qArticle.title
                            )
                    )
                    .from(qArticle)
                    .where(qArticle.id.eq(id))
                    .fetchOne();
        }
        return null;
    }

    @Override
    public Article findArticleById(Long id) {
        Article article = articleRepository.findArticleById(id);
        if (!Objects.isNull(article)) {
            return article;
        }
        return null;
    }

    /**
     * 根据标题查询
     *
     * @param title title
     */
    @Override
    public ArticleDetailVo findByTitle(String title) {
//        return queryComponent.queryFactory()
//                .select(
//                        Projections.bean(
//                                ArticleDto.class,
//                                qArticle.id,
//                                qArticle.createTime,
//                                qArticle.updateTime,
//                                qArticle.title,
//                                qArticle.summary,
//                                qArticle.image,
//                                qArticle.content,
//                                qCategory.id.as("categoryId"),
//                                qCategory.name.as("categoryName")
//                        )
//                )
//                .from(qArticle, qCategory)
//                .where(
//                        qArticle.title.eq(title)
//                                .and(qArticle.categoryId.eq(qCategory.id))
//                )
//                .orderBy(qArticle.createTime.desc())
//                .fetchOne();
        return null;
    }

    /**
     * 增加
     *
     * @param articleDetailVo articleDto
     */
    @Override
    public ArticleDetailVo add(ArticleDetailVo articleDetailVo) {
        Article article = new Article();
        article.setTitle(articleDetailVo.getTitle());
        article.setSummary(articleDetailVo.getSummary());
//        article.setImage(articleDto.getImage());
        article.setContent(articleDetailVo.getContent());
//        Category category = categoryRepository.findCategoryByName(articleDetailVo.getCategoryName());
//        if (!Objects.isNull(category)) {
//            article.setCategoryId(article.getCategoryId());
//            articleRepository.save(article);
//            return articleDetailVo;
//        } else {
//            return null;
//        }
        return null;
    }

    /**
     * 更新
     *
     * @param id id
     * @param articleDetailVo articleDto
     */
    @Override
    public ArticleDetailVo update(Long id, ArticleDetailVo articleDetailVo) {
        Article article = articleRepository.findById(id).orElseThrow();
//        Category category = categoryRepository.findCategoryByName(articleDetailVo.getCategoryName());
        if (!Objects.isNull(article)) {
//            queryComponent.queryFactory()
//                    .update(qArticle)
//                    .where(qArticle.id.eq(id))
//                    .set(qArticle.title, articleDto.getTitle())
//                    .set(qArticle.summary, articleDto.getSummary())
//                    .set(qArticle.image, articleDto.getImage())
//                    .set(qArticle.content, articleDto.getContent())
//                    .set(qArticle.categoryId, category.getId())
//                    .execute();
            return articleDetailVo;
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

    @Deprecated
    private List<ArticleSummaryVo> tupleToArticleSummaryDto(List<Tuple> tuples) {
//        List<ArticleSummaryDto> articleSummaryDtos = Lists.newArrayList();
        for (Tuple tuple : tuples) {
            ArticleSummaryVo articleSummaryVo = new ArticleSummaryVo();
            articleSummaryVo.setId(tuple.get(qArticle.id));
            articleSummaryVo.setCreateTime(tuple.get(qArticle.createTime));
            articleSummaryVo.setUpdateTime(tuple.get(qArticle.updateTime));
            articleSummaryVo.setTitle(tuple.get(qArticle.title));
            articleSummaryVo.setSummary(tuple.get(qArticle.summary));
//            articleSummaryDto.setImage(tuple.get(qArticle.image));
//            articleSummaryDto.setCategoryId(tuple.get(qCategory.id));
//            articleSummaryDto.setCategoryName(tuple.get(qCategory.name));
//            articleSummaryDtos.add(articleSummaryDto);
        }
//        return articleSummaryDtos;
        return null;
    }

}
