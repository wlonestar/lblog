package com.wjl.lblog.service.intf;

import com.wjl.lblog.model.dto.CategoryDto;
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

    List<Category> findAll();

    Page<Category> findByPage(Pageable pageable);


    CategoryArticleVo findCategoryById(Long id, Pageable pageable);

    CategoryDto findCategoryDtoById(Long id);

    Category findById(Long id);

    Category findByName(String name);


    boolean add(Category category);

    boolean update(Long id, Category category);


    boolean deleteById(Long id);

}
