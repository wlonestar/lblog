package com.wjl.lblog.service.intf;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.wjl.lblog.model.dto.CategoryDto;
import com.wjl.lblog.model.entity.Category;
import com.wjl.lblog.model.vo.ArticleTitleVo;
import com.wjl.lblog.model.vo.CategoryArticleVo;

import java.util.List;

/**
 * @author: wjl
 * @date: 2021/9/14 15:12
 * @version: v1.0
 */
public interface CategoryService extends IService<Category> {

    IPage<Category> selectCategoryByPage(Page<Category> page);

    List<Category> selectCategoryAll();

    Category selectCategoryById(Long id);

    Category selectCategoryByName(String name);

    CategoryArticleVo selectArticleByCategoryId(Long id, Page<ArticleTitleVo> page);

    CategoryArticleVo selectArticleByCategoryName(String name, Page<ArticleTitleVo> page);

    boolean addCategory(CategoryDto category);

    boolean updateCategory(Long id, CategoryDto category);

}
