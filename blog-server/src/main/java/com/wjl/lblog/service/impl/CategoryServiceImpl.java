package com.wjl.lblog.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wjl.lblog.model.entity.Category;
import com.wjl.lblog.model.vo.ArticleSummaryVo;
import com.wjl.lblog.model.vo.CategoryArticleVo;
import com.wjl.lblog.repository.ArticleMapper;
import com.wjl.lblog.repository.CategoryMapper;
import com.wjl.lblog.service.intf.CategoryService;
import lombok.extern.slf4j.Slf4j;
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
    public IPage<Category> selectByPage(Page<Category> page) {
        return categoryMapper.selectPage(page, null);
    }

    @Override
    public List<Category> selectAll() {
        return categoryMapper.selectList(null);
    }

    @Override
    public Category selectById(Long id) {
        var category = categoryMapper.selectById(id);
        if (!Objects.isNull(category)) {
            return category;
        } else {
            return null;
        }
    }

    @Override
    public Category selectByName(String name) {
        var wrapper = new LambdaQueryWrapper<Category>();
        wrapper.eq(Category::getName, name);
        var category = categoryMapper.selectOne(wrapper);
        if (!Objects.isNull(category)) {
            return category;
        } else {
            return null;
        }
    }

    @Override
    public CategoryArticleVo selectByCategoryId(Long id, Page<ArticleSummaryVo> page) {
        var category = categoryMapper.selectById(id);
        if (!Objects.isNull(category)) {
            return getByCategory(category, page);
        } else {
            return null;
        }
    }

    @Override
    public CategoryArticleVo selectByCategoryName(String name, Page<ArticleSummaryVo> page) {
        var category = selectByName(name);
        if (!Objects.isNull(category)) {
            return getByCategory(category, page);
        } else {
            return null;
        }
    }

    @Override
    public boolean add(String category) {
        if (!Objects.isNull(category)) {
            var newCategory = new Category();
            newCategory.setName(category);
            var res = categoryMapper.insert(newCategory);
            return res == 1;
        } else {
            return false;
        }
    }

    @Override
    public boolean updateById(Long id, String category) {
        var newCategory = selectById(id);
        if (!Objects.isNull(newCategory)) {
            if (!Objects.isNull(category)) {
                newCategory.setName(category);
                newCategory.setModifyTime(new Date());
                var res = categoryMapper.updateById(newCategory);
                return res == 1;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    private CategoryArticleVo getByCategory(Category category, Page<ArticleSummaryVo> page) {
        var pages = articleMapper.selectSummaryByPageAndCid(category.getId(), page);
        return CategoryArticleVo.builder()
                .id(category.getId())
                .createTime(category.getCreateTime())
                .name(category.getName())
                .articles(pages).build();
    }

}
