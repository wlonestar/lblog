package com.wjl.lblog.service.impl;

import com.querydsl.core.QueryResults;
import com.querydsl.core.Tuple;
import com.wjl.lblog.component.QueryComponent;
import com.wjl.lblog.model.vo.ArticleTitleVo;
import com.wjl.lblog.model.entity.Category;
import com.wjl.lblog.model.entity.QArticle;
import com.wjl.lblog.model.entity.QCategory;
import com.wjl.lblog.model.vo.CategoryArticleVo;
import com.wjl.lblog.repository.CategoryRepository;
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
 * @date: 2021/9/14 15:12
 * @version: v1.0
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private QueryComponent queryComponent;

    @Autowired
    private CategoryRepository categoryRepository;

    QCategory qCategory = QCategory.category;

    QArticle qArticle = QArticle.article;

    /**
     * 分页查询分类实体
     *
     * @param pageable pageable
     */
    @Override
    public Page<Category> findAllCategoryByPage(Pageable pageable) {
        return categoryRepository.findAll(pageable);
    }

    /**
     * 分页查询某分类下文章
     *
     * @param id id
     * @param pageable pageable
     */
    @Override
    public CategoryArticleVo findOneCategoryAndArticleById(Long id, Pageable pageable) {
        CategoryArticleVo categoryArticleVo = new CategoryArticleVo();
        Category category = findCategoryById(id);
        // query articles by category id
        QueryResults<Tuple> queryResults = queryComponent.queryFactory()
                .select(
                        qArticle.id,
                        qArticle.createTime,
                        qArticle.title
                )
                .from(qArticle)
                .where(qArticle.categoryId.eq(id))
                .orderBy(qArticle.createTime.desc())
                .offset(pageable.getOffset())
                .limit(pageable.getPageSize())
                .fetchResults();
        List<Tuple> tuples = queryResults.getResults();
        List<ArticleTitleVo> articleTitleVos = this.tupleToArticleTitleDto(tuples);
        Page<ArticleTitleVo> articleTitleDtoPage = new PageImpl<>(articleTitleVos, pageable, queryResults.getTotal());
        // category to categoryArticleDto
        categoryArticleVo.setId(category.getId());
        categoryArticleVo.setCreateTime(category.getCreateTime());
        categoryArticleVo.setUpdateTime(category.getUpdateTime());
        categoryArticleVo.setName(category.getName());
        categoryArticleVo.setDescription(category.getDescription());
        categoryArticleVo.setNumber(category.getNumber());
        categoryArticleVo.setArticles(articleTitleDtoPage);
        return categoryArticleVo;
    }

    /**
     * 查询所有分类
     */
    @Override
    public List<Category> findAllCategory() {
        return categoryRepository.findAll();
    }

    /**
     * 根据 id 查询分类实体
     *
     * @param id id
     */
    @Override
    public Category findCategoryById(Long id) {
        return categoryRepository.findById(id).orElseThrow();
    }

    /**
     * 根据分类名查询分类实体
     *
     * @param name name
     */
    @Override
    public Category findCategoryByName(String name) {
        return categoryRepository.findCategoryByName(name);
    }

    /**
     * 增加
     *
     * @param category category
     */
    @Override
    public Category add(Category category) {
        if (!Objects.isNull(category)) {
            return categoryRepository.save(category);
        } else {
            return null;
        }
    }

    /**
     * 更新
     *
     * @param id id
     * @param category category
     */
    @Override
    public Category update(Long id, Category category) {
        Category category1 = categoryRepository.findById(id).orElseThrow();
        if (!Objects.isNull(category1)) {
            queryComponent.queryFactory()
                    .update(qCategory)
                    .where(qCategory.id.eq(id))
                    .set(qCategory.name, category.getName())
                    .set(qCategory.description, category.getDescription())
                    .execute();
            return category;
        } else {
            return null;
        }
    }

    /**
     * 根据 id 删除
     *
     * @param id id
     */
    @Override
    public Category deleteById(Long id) {
        Category category = categoryRepository.findById(id).orElseThrow();
        if (!Objects.isNull(category)) {
            categoryRepository.deleteById(id);
        }
        return null;
    }

    /**
     * 删除所有
     */
    @Override
    public void deleteAll() {
        categoryRepository.deleteAll();
    }

    private List<ArticleTitleVo> tupleToArticleTitleDto(List<Tuple> tuples) {
//        List<ArticleTitleDto> articleTitleDtos = Lists.newArrayList();
        for (Tuple tuple : tuples) {
            ArticleTitleVo articleTitleVo = new ArticleTitleVo();
//            articleTitleVo.setArticleId(tuple.get(qArticle.id));
            articleTitleVo.setArticleTime(tuple.get(qArticle.createTime));
//            articleTitleVo.setArticleTitle(tuple.get(qArticle.title));
//            articleTitleDtos.add(articleTitleDto);
        }
//        return articleTitleDtos;
        return null;
    }

}
