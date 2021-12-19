package com.wjl.lblog.repository;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wjl.lblog.model.entity.Article;
import com.wjl.lblog.model.vo.ArticleDetailVo;
import com.wjl.lblog.model.vo.ArticleSummaryVo;
import com.wjl.lblog.model.vo.ArticleTitleVo;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author: wjl
 * @date: 2021/9/13 21:09
 * @version: v1.0
 */
@Repository
public interface ArticleRepository extends BaseMapper<Article> {

    @ResultType(ArticleDetailVo.class)
    @Select("select a.id, a.create_time, a.update_time, a.title, a.summary, a.cover, a.content, a.category_id, c.name " +
            "from article as a, category as c " +
            "where a.category_id = c.id order by a.create_time desc")
    IPage<ArticleDetailVo> selectDetailByPage(Page<?> page);

    @ResultType(ArticleSummaryVo.class)
    @Select("select a.id, a.create_time, a.update_time, a.title, a.summary, a.cover, a.category_id, c.name " +
            "from article as a, category as c " +
            "where a.category_id = c.id order by a.create_time desc")
    IPage<ArticleSummaryVo> selectSummaryByPage(Page<?> page);

    @ResultType(ArticleTitleVo.class)
    @Select("select id, create_time, title from article order by create_time desc")
    IPage<ArticleTitleVo> selectTitleByPage(Page<?> page);


    @ResultType(ArticleDetailVo.class)
    @Select("select a.id, a.create_time, a.update_time, a.title, a.summary, a.cover, a.content, a.category_id, c.name " +
            "from article as a, category as c " +
            "where a.category_id = c.id order by a.create_time desc")
    List<ArticleDetailVo> selectDetailAll();

    @ResultType(ArticleSummaryVo.class)
    @Select("select a.id, a.create_time, a.update_time, a.title, a.summary, a.cover, a.category_id, c.name " +
            "from article as a, category as c " +
            "where a.category_id = c.id order by a.create_time desc")
    List<ArticleSummaryVo> selectSummaryAll();

    @ResultType(ArticleTitleVo.class)
    @Select("select id, create_time, title from article order by create_time desc")
    List<ArticleTitleVo> selectTitleByAll();


    @ResultType(ArticleDetailVo.class)
    @Select("select a.id, a.create_time, a.update_time, a.title, a.summary, a.cover, a.content, a.category_id, c.name " +
            "from article as a, category as c " +
            "where a.category_id = c.id and a.id = #{id}")
    ArticleDetailVo selectDetailById(@Param("id") Long id);

    @ResultType(ArticleSummaryVo.class)
    @Select("select a.id, a.create_time, a.update_time, a.title, a.summary, a.cover, a.category_id, c.name " +
            "from article as a, category as c " +
            "where a.category_id = c.id and a.id = #{id}")
    ArticleSummaryVo selectSummaryById(@Param("id") Long id);

    @ResultType(ArticleTitleVo.class)
    @Select("select id, create_time, title from article where id = #{id}")
    ArticleTitleVo selectTitleById(@Param("id") Long id);


    @ResultType(ArticleDetailVo.class)
    @Select("select a.id, a.create_time, a.update_time, a.title, a.summary, a.cover, a.content, a.category_id, c.name " +
            "from article as a, category as c " +
            "where a.category_id = c.id and a.title = #{title}")
    ArticleDetailVo selectDetailByTitle(@Param("title") String title);

    @ResultType(ArticleSummaryVo.class)
    @Select("select a.id, a.create_time, a.update_time, a.title, a.summary, a.cover, a.category_id, c.name " +
            "from article as a, category as c " +
            "where a.category_id = c.id and a.title = #{title}")
    ArticleSummaryVo selectSummaryByTitle(@Param("title") String title);

    @ResultType(ArticleTitleVo.class)
    @Select("select id, create_time, title from article where title = #{title}")
    ArticleTitleVo selectTitleByTitle(@Param("title") String title);


    @Insert("insert into article(title, cover, content, summary, category_id)" +
            "values(#{title}, #{cover}, #{content}, #{summary}, #{categoryId})")
    boolean addArticle(Article article);

    @ResultType(Article.class)
    @Update("update article" +
            "set title=#{article.title}, cover=#{article.cover}, content=#{article.content}, " +
            "summary=#{article.summary}, category_id=#{article.categoryId}" +
            "where id=#{id}")
    boolean updateArticle(@Param("id") Long id, @Param("article") Article article);

}
