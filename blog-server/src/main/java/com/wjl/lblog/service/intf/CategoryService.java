package com.wjl.lblog.service.intf;

import com.wjl.lblog.model.entity.Category;
import com.wjl.lblog.model.vo.CategoryVo;
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
     * 分页查询
     */
    Page<CategoryVo> findAllByPage(Pageable pageable);

    /**
     * 查询所有
     */
    List<CategoryVo> findAll();

    /**
     * 根据 id 查询
     */
    CategoryVo findById(Long id);

    /**
     * 根据名称查询
     */
    Category findByName(String categoryName);

    /**
     * 增加
     */
    CategoryVo add(CategoryVo categoryVo);

    /**
     * 更新
     */
    CategoryVo update(Long id, CategoryVo categoryVo);

    /**
     * 根据 id 删除
     */
    Long deleteById(Long id);

    /**
     * 删除所有
     */
    void deleteAll();

}
