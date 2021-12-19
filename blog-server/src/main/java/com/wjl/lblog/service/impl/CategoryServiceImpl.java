package com.wjl.lblog.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wjl.lblog.model.dto.CategoryDto;
import com.wjl.lblog.model.entity.Category;
import com.wjl.lblog.model.vo.ArticleTitleVo;
import com.wjl.lblog.model.vo.CategoryArticleVo;
import com.wjl.lblog.repository.ArticleRepository;
import com.wjl.lblog.repository.CategoryRepository;
import com.wjl.lblog.service.intf.CategoryService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Objects;

/**
 * @author: wjl
 * @date: 2021/9/14 15:12
 * @version: v1.0
 */
@Service
public class CategoryServiceImpl
        extends ServiceImpl<CategoryRepository, Category>
        implements CategoryService {

    @Resource
    private CategoryRepository categoryRepository;

    @Resource
    private ArticleRepository articleRepository;

    @Override
    public IPage<Category> selectCategoryByPage(Page<Category> page) {
        return categoryRepository.selectCategoryByPage(page);
    }

    @Override
    public List<Category> selectCategoryAll() {
        return categoryRepository.selectCategoryAll();
    }

    @Override
    public Category selectCategoryById(Long id) {
        Category category = categoryRepository.selectCategoryById(id);
        if (!Objects.isNull(category)) {
            return category;
        }
        return null;
    }

    @Override
    public Category selectCategoryByName(String name) {
        Category category = categoryRepository.selectCategoryByName(name);
        if (!Objects.isNull(category)) {
            return category;
        }
        return null;
    }

    @Override
    public CategoryArticleVo selectArticleByCategoryId(Long id, Page<ArticleTitleVo> page) {
        Category category = categoryRepository.selectCategoryById(id);
        if (!Objects.isNull(category)) {
            return getByCategory(category, page);
        }
        return null;
    }

    @Override
    public CategoryArticleVo selectArticleByCategoryName(String name, Page<ArticleTitleVo> page) {
        Category category = categoryRepository.selectCategoryByName(name);
        if (!Objects.isNull(category)) {
            return getByCategory(category, page);
        }
        return null;
    }

    @Override
    public boolean addCategory(CategoryDto categoryDto) {
        if (!Objects.isNull(categoryDto)) {
            Category category = new Category();
            BeanUtils.copyProperties(categoryDto, category);
            return categoryRepository.addCategory(category);
        }
        return false;
    }

    @Override
    public boolean updateCategory(Long id, CategoryDto categoryDto) {
        if (!Objects.isNull(categoryDto)) {
            Category category = new Category();
            BeanUtils.copyProperties(categoryDto, category);
            return categoryRepository.updateCategory(id, category);
        }
        return false;
    }


    private CategoryArticleVo getByCategory(Category category, Page<ArticleTitleVo> page) {
        CategoryArticleVo categoryArticleVo = new CategoryArticleVo();
        BeanUtils.copyProperties(category, categoryArticleVo);
        categoryArticleVo.setArticles(articleRepository.selectTitleByPage(page));
        return categoryArticleVo;
    }





}
