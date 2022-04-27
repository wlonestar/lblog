package com.wjl.lblog.service.intf;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.wjl.lblog.model.entity.Category;
import com.wjl.lblog.model.vo.ArticleSummaryVo;
import com.wjl.lblog.model.vo.CategoryArticleVo;

import java.util.List;

/**
 * @author: wjl
 * @date: 2021/9/14 15:12
 * @version: v1.0
 */
public interface CategoryService extends IService<Category> {

    IPage<Category> selectByPage(Page<Category> page);

    List<Category> selectAll();

    List<String> selectAllName();

    Category selectById(Long id);

    Category selectByName(String name);

    CategoryArticleVo selectByCategoryId(Long id, Page<ArticleSummaryVo> page);

    CategoryArticleVo selectByCategoryName(String name, Page<ArticleSummaryVo> page);

    boolean add(String category);

}
