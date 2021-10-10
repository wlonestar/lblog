package com.wjl.lblog.repository;

import com.wjl.lblog.model.entity.Article;
import com.wjl.lblog.model.entity.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author: wjl
 * @date: 2021/9/13 22:47
 * @version: v1.0
 */
@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

    Category findCategoryByName(String categoryName);

    Category findCategoryById(Long id);

}
