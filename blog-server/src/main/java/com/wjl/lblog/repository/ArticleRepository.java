package com.wjl.lblog.repository;

import com.wjl.lblog.model.entity.Article;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author: wjl
 * @date: 2021/9/13 21:09
 * @version: v1.0
 */
@Repository
public interface ArticleRepository extends JpaRepository<Article, Long> {

    Page<Article> findAll(Pageable pageable);

    Article findArticleById(Long id);

    Article findArticleByTitle(String title);

}
