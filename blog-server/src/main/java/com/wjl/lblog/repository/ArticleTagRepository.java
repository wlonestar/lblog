package com.wjl.lblog.repository;

import com.wjl.lblog.model.entity.ArticleTag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author: wjl
 * @date: 2021/12/8 20:28
 * @version: v1.0
 */
@Repository
public interface ArticleTagRepository extends JpaRepository<ArticleTag, Long> {

    List<ArticleTag> findArticleTagsByAid(Long aid);

    ArticleTag findArticleTagByTid(Long tid);

}
