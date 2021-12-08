package com.wjl.lblog.service.intf;

import com.wjl.lblog.model.entity.Category;
import com.wjl.lblog.model.vo.CategoryArticleVo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @author: wjl
 * @date: 2021/9/14 15:12
 * @version: v1.0
 */
public interface CategoryService {

    /**
     * 分页查询分类实体
     */
    Page<Category> findAllCategoryByPage(Pageable pageable);

    /**
     * 分页查询某分类下文章
     */
    CategoryArticleVo findOneCategoryAndArticleById(Long id, Pageable pageable);

    /**
     * 查询所有分类实体
     */
    List<Category> findAllCategory();

    /**
     * 根据 id 查询分类实体
     */
    Category findCategoryById(Long id);

    /**
     * 根据分类名查询分类实体
     */
    Category findCategoryByName(String name);

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    /**
     * 增加
     */
    Category add(Category category);

    /**
     * 更新
     */
    Category update(Long id, Category category);

    /**
     * 根据 id 删除
     */
    Category deleteById(Long id);

    /**
     * 删除所有
     */
    void deleteAll();

}
