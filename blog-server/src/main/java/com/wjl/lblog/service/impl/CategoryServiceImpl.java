package com.wjl.lblog.service.impl;

import com.wjl.lblog.model.entity.Article;
import com.wjl.lblog.model.entity.Category;
import com.wjl.lblog.model.vo.ArticleVo;
import com.wjl.lblog.model.vo.CategoryVo;
import com.wjl.lblog.repository.CategoryRepository;
import com.wjl.lblog.service.intf.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static com.wjl.lblog.service.impl.ArticleServiceImpl.copyFromArticleToArticleVo;

/**
 * @author: wjl
 * @date: 2021/9/14 15:12
 * @version: v1.0
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    /**
     * 分页查询
     *
     * @param pageable
     */
    @Override
    public Page<CategoryVo> findAllByPage(Pageable pageable) {
        Page<Category> categoryPage = categoryRepository.findAll(pageable);
        List<Category> categoryList = categoryPage.getContent();
        List<CategoryVo> categoryVoList = new ArrayList<>();
        for (Category category : categoryList) {
            CategoryVo categoryVo = new CategoryVo();
            copyFromCategoryToCategoryVo(category, categoryVo);
            categoryVoList.add(categoryVo);
        }
        return new PageImpl<>(categoryVoList);
//        return categoryRepository.findAll(pageable);
    }

    /**
     * 查询所有
     */
    @Override
    public List<CategoryVo> findAll() {
        List<Category> categories = categoryRepository.findAll();
        List<CategoryVo> categoryVos = new ArrayList<>();
        for (Category category : categories) {
            CategoryVo categoryVo = new CategoryVo();
            copyFromCategoryToCategoryVo(category, categoryVo);
            categoryVos.add(categoryVo);
        }
        return categoryVos;
//        return categoryRepository.findAll();
    }

    /**
     * 根据 id 查询
     *
     * @param id
     */
    @Override
    public CategoryVo findById(Long id) {
        Category category = categoryRepository.findById(id).orElseThrow();
        CategoryVo categoryVo = new CategoryVo();
        if (!Objects.isNull(category)) {
            copyFromCategoryToCategoryVo(category, categoryVo);
        }
        return categoryVo;
    }

    /**
     * 根据名称查询
     *
     * @param categoryName
     */
    @Override
    public Category findByName(String categoryName) {
        Category category = categoryRepository.findCategoryByName(categoryName);
        if (!Objects.isNull(category)) {
            return category;
        } else {
            Category category1 = new Category();
            category1.setName(categoryName);
            categoryRepository.save(category1);
            return category1;
        }
    }

    /**
     * 增加
     *
     * @param categoryVo
     */
    @Override
    public CategoryVo add(CategoryVo categoryVo) {
        Category category = new Category();
        category.setName(categoryVo.getName());
        category.setDescription(categoryVo.getDescription());
        categoryRepository.save(category);
        return categoryVo;
    }

    /**
     * 更新
     *
     * @param id
     * @param categoryVo
     */
    @Override
    public CategoryVo update(Long id, CategoryVo categoryVo) {
        Category category = categoryRepository.findById(id).orElseThrow();
        if (!Objects.isNull(category)) {
            category.setName(categoryVo.getName());
            category.setDescription(categoryVo.getDescription());
            categoryRepository.save(category);
            return categoryVo;
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
        Category category = categoryRepository.findById(id).orElseThrow();
        if (!Objects.isNull(category)) {
            if (category.getNumber() == 0) {
                categoryRepository.deleteById(id);
                return id;
            }
        }
        return null;
    }

    /**
     * 删除所有
     */
    @Override
    public void deleteAll() {

    }

    public static void copyFromCategoryToCategoryVo(Category category, CategoryVo categoryVo) {
        categoryVo.setId(category.getId());
        categoryVo.setCreateTime(category.getCreateTime());
        categoryVo.setUpdateTime(category.getUpdateTime());
        categoryVo.setName(category.getName());
        categoryVo.setDescription(category.getDescription());
        categoryVo.setNumber(category.getNumber());
        List<Article> articleList = category.getArticleList();
        List<ArticleVo> articleVoList = new ArrayList<>();
        for (Article article : articleList) {
            ArticleVo articleVo = new ArticleVo();
            copyFromArticleToArticleVo(article, articleVo);
            articleVoList.add(articleVo);
        }
        categoryVo.setArticleList(articleVoList);
    }

}
