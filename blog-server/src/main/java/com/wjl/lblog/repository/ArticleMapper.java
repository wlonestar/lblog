package com.wjl.lblog.repository;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wjl.lblog.model.entity.Article;
import com.wjl.lblog.model.vo.ArticleDetailVo;
import com.wjl.lblog.model.vo.ArticleSummaryVo;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author: wjl
 * @date: 2021/9/13 21:09
 * @version: v1.0
 */
@Repository
public interface ArticleMapper extends BaseMapper<Article> {

    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "createTime", column = "create_time"),
            @Result(property = "title", column = "title"),
            @Result(property = "summary", column = "summary"),
            @Result(property = "image", column = "image"),
            @Result(property = "content", column = "content"),
            @Result(property = "category", column = "name"),
    })
    @Select("select a.id, a.create_time, a.title, a.summary, a.image, a.content, c.name " +
            "from article as a, category as c " +
            "where a.category_id = c.id order by a.create_time DESC")
    IPage<ArticleDetailVo> selectDetailByPage(Page<?> page);

    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "createTime", column = "create_time"),
            @Result(property = "title", column = "title"),
            @Result(property = "summary", column = "summary"),
            @Result(property = "image", column = "image"),
            @Result(property = "content", column = "content"),
            @Result(property = "category", column = "name"),
    })
    @Select("select a.id, a.create_time, a.title, a.summary, a.image, a.content, c.name " +
            "from article as a, category as c " +
            "where a.category_id = c.id order by a.create_time DESC")
    List<ArticleDetailVo> selectDetailAll();

    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "createTime", column = "create_time"),
            @Result(property = "title", column = "title"),
            @Result(property = "summary", column = "summary"),
            @Result(property = "image", column = "image"),
            @Result(property = "content", column = "content"),
            @Result(property = "category", column = "name"),
    })
    @Select("select a.id, a.create_time, a.title, a.summary, a.image, a.content, c.name " +
            "from article as a, category as c " +
            "where a.category_id = c.id and a.id = #{id}")
    ArticleDetailVo selectDetailById(@Param("id") Long id);

    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "createTime", column = "create_time"),
            @Result(property = "title", column = "title"),
            @Result(property = "summary", column = "summary"),
            @Result(property = "image", column = "image"),
            @Result(property = "content", column = "content"),
            @Result(property = "category", column = "name"),
    })
    @Select("select a.id, a.create_time, a.title, a.summary, a.image, a.content, c.name " +
            "from article as a, category as c " +
            "where a.category_id = c.id and a.title = #{title}")
    ArticleDetailVo selectDetailByTitle(@Param("title") String title);

    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "createTime", column = "create_time"),
            @Result(property = "title", column = "title"),
            @Result(property = "summary", column = "summary"),
            @Result(property = "image", column = "image"),
            @Result(property = "category", column = "name"),
    })
    @Select("select a.id, a.create_time, a.title, a.summary, a.image, c.name " +
            "from article as a, category as c " +
            "where a.category_id = c.id order by a.create_time desc")
    IPage<ArticleSummaryVo> selectSummaryByPage(Page<?> page);

    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "createTime", column = "create_time"),
            @Result(property = "title", column = "title"),
            @Result(property = "summary", column = "summary"),
            @Result(property = "image", column = "image"),
            @Result(property = "category", column = "name"),
    })
    @Select("select a.id, a.create_time, a.title, a.summary, a.image, c.name " +
            "from article as a, category as c " +
            "where a.category_id = c.id and c.id = #{cid} order by a.create_time desc")
    IPage<ArticleSummaryVo> selectSummaryByPageAndCid(@Param("cid") Long cid, Page<?> page);

    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "createTime", column = "create_time"),
            @Result(property = "title", column = "title"),
            @Result(property = "summary", column = "summary"),
            @Result(property = "image", column = "image"),
            @Result(property = "category", column = "name"),
    })
    @Select("select a.id, a.create_time, a.title, a.summary, a.image, c.name " +
            "from article as a, category as c " +
            "where a.category_id = c.id order by a.create_time desc")
    List<ArticleSummaryVo> selectSummaryAll();

    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "createTime", column = "create_time"),
            @Result(property = "title", column = "title"),
            @Result(property = "summary", column = "summary"),
            @Result(property = "image", column = "image"),
            @Result(property = "category", column = "name"),
    })
    @Select("select a.id, a.create_time, a.title, a.summary, a.image, c.name " +
            "from article as a, category as c " +
            "where a.category_id = c.id and c.id = #{cid} order by a.create_time desc")
    List<ArticleSummaryVo> selectSummaryAllByCid(@Param("cid") Long cid);

    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "createTime", column = "create_time"),
            @Result(property = "title", column = "title"),
            @Result(property = "summary", column = "summary"),
            @Result(property = "image", column = "image"),
            @Result(property = "category", column = "name"),
    })
    @Select("select a.id, a.create_time, a.title, a.summary, a.image, c.name " +
            "from article as a, category as c " +
            "where a.category_id = c.id and a.id = #{id}")
    ArticleSummaryVo selectSummaryById(@Param("id") Long id);

}
