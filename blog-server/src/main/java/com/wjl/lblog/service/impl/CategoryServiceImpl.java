package com.wjl.lblog.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wjl.lblog.model.dto.CategoryDto;
import com.wjl.lblog.model.entity.Category;
import com.wjl.lblog.model.vo.ArticleTitleVo;
import com.wjl.lblog.model.vo.CategoryArticleVo;
import com.wjl.lblog.repository.ArticleMapper;
import com.wjl.lblog.repository.CategoryMapper;
import com.wjl.lblog.service.intf.CategoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 * @author: wjl
 * @date: 2021/9/14 15:12
 * @version: v1.0
 */
@Slf4j
@Service
public class CategoryServiceImpl
        extends ServiceImpl<CategoryMapper, Category>
        implements CategoryService {

    @Resource
    private CategoryMapper categoryMapper;

    @Resource
    private ArticleMapper articleMapper;

    @Override
    public IPage<Category> selectCategoryByPage(Page<Category> page) {
        return categoryMapper.selectCategoryByPage(page);
    }

    @Override
    public List<Category> selectCategoryAll() {
        return categoryMapper.selectCategoryAll();
    }

    @Override
    public Category selectCategoryById(Long id) {
        Category category = categoryMapper.selectCategoryById(id);
        if (!Objects.isNull(category)) {
            return category;
        }
        return null;
    }

    @Override
    public Category selectCategoryByName(String name) {
        Category category = categoryMapper.selectCategoryByName(name);
        if (!Objects.isNull(category)) {
            return category;
        }
        return null;
    }

    @Override
    public CategoryArticleVo selectArticleByCategoryId(Long id, Page<ArticleTitleVo> page) {
        Category category = categoryMapper.selectCategoryById(id);
        if (!Objects.isNull(category)) {
            return getByCategory(category, page);
        }
        return null;
    }

    @Override
    public CategoryArticleVo selectArticleByCategoryName(String name, Page<ArticleTitleVo> page) {
        Category category = categoryMapper.selectCategoryByName(name);
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
            int i = categoryMapper.insert(category);
            return i == 1;
        }
        return false;
    }

    @Override
    public boolean updateCategory(Long id, CategoryDto categoryDto) {
        if (!Objects.isNull(categoryDto)) {
            Category category = categoryMapper.selectCategoryById(id);
            BeanUtils.copyProperties(categoryDto, category);
            category.setUpdateTime(new Date());
            int i = categoryMapper.updateById(category);
            return i == 1;
        }
        return false;
    }


    private CategoryArticleVo getByCategory(Category category, Page<ArticleTitleVo> page) {
        CategoryArticleVo categoryArticleVo = new CategoryArticleVo();
        BeanUtils.copyProperties(category, categoryArticleVo);
        categoryArticleVo.setArticles(articleMapper.selectTitleByPage(page));
        return categoryArticleVo;
    }

}
