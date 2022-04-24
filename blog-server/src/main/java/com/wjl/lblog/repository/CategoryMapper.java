package com.wjl.lblog.repository;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wjl.lblog.model.entity.Category;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author: wjl
 * @date: 2021/9/13 22:47
 * @version: v1.0
 */
@Repository
public interface CategoryMapper extends BaseMapper<Category> {

    @ResultType(Category.class)
    @Select("select * from category order by category.create_time desc")
    IPage<Category> selectCategoryByPage(Page<?> page);

    @ResultType(Category.class)
    @Select("select * from category order by category.create_time desc")
    List<Category> selectCategoryAll();

    @ResultType(Category.class)
    @Select("select * from category where id=#{id}")
    Category selectCategoryById(@Param("id") Long id);

    @ResultType(Category.class)
    @Select("select * from category where name=#{name}")
    Category selectCategoryByName(@Param("name") String name);

}
