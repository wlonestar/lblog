package com.wjl.lblog.service.impl;

import com.querydsl.core.QueryResults;
import com.querydsl.core.Tuple;
import com.wjl.lblog.component.QueryComponent;
import com.wjl.lblog.model.dto.CategoryDto;
import com.wjl.lblog.model.vo.ArticleTitleVo;
import com.wjl.lblog.model.entity.Category;
import com.wjl.lblog.model.entity.QArticle;
import com.wjl.lblog.model.entity.QCategory;
import com.wjl.lblog.model.vo.CategoryArticleVo;
import com.wjl.lblog.repository.CategoryRepository;
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
 * @date: 2021/9/14 15:12
 * @version: v1.0
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private QueryComponent queryComponent;

    @Autowired
    private CategoryRepository categoryRepository;

    QArticle qArticle = QArticle.article;

    @Override
    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    @Override
    public Page<Category> findByPage(Pageable pageable) {
        return categoryRepository.findAll(pageable);
    }

    @Override
    public CategoryArticleVo findCategoryById(Long id, Pageable pageable) {
        Category category = categoryRepository.findCategoryById(id);
        if (!Objects.isNull(category)) {
            CategoryArticleVo categoryArticleVo = new CategoryArticleVo();
            BeanUtils.copyProperties(category, categoryArticleVo);
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
            List<ArticleTitleVo> articleTitleVos = new ArrayList<>();
            for (Tuple tuple : tuples) {
                ArticleTitleVo articleTitleVo = new ArticleTitleVo();
                articleTitleVo.setId(tuple.get(qArticle.id));
                articleTitleVo.setArticleTime(tuple.get(qArticle.createTime));
                articleTitleVo.setTitle(tuple.get(qArticle.title));
                articleTitleVos.add(articleTitleVo);
            }
            categoryArticleVo.setArticles(new PageImpl<>(articleTitleVos, pageable, queryResults.getTotal()));
            return categoryArticleVo;
        }
        return null;
    }

    @Override
    public CategoryDto findCategoryDtoById(Long id) {
        Category category = categoryRepository.findCategoryById(id);
        if (!Objects.isNull(category)) {
            return new CategoryDto(category.getId(), category.getName());
        }
        return null;
    }

    @Override
    public Category findById(Long id) {
        Category category = categoryRepository.findCategoryById(id);
        if (!Objects.isNull(category)) {
            return category;
        }
        return null;
    }

    @Override
    public Category findByName(String name) {
        Category category = categoryRepository.findCategoryByName(name);
        if (!Objects.isNull(category)) {
            return category;
        }
        return null;
    }

    @Override
    public boolean add(Category category) {
        if (!Objects.isNull(category)) {
            Category category1 = new Category();
            BeanUtils.copyProperties(category, category1,
                    "id", "createTime", "updateTime", "number");
            categoryRepository.save(category);
            return true;
        }
        return false;
    }

    @Override
    public boolean update(Long id, Category category) {
        Category category1 = categoryRepository.findCategoryById(id);
        if (!Objects.isNull(category1) && !Objects.isNull(category)) {
            BeanUtils.copyProperties(category, category1,
                    "id", "createTime", "updateTime", "number");
            categoryRepository.save(category1);
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteById(Long id) {
        Category category = categoryRepository.findCategoryById(id);
        if (!Objects.isNull(category)) {
            categoryRepository.deleteById(id);
            return true;
        }
        return false;
    }

}
