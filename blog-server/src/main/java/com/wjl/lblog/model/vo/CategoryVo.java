package com.wjl.lblog.model.vo;

import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @author: wjl
 * @date: 2021/9/14 15:42
 * @version: v1.0
 */
@Data
public class CategoryVo {

    private Long id;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 分类名称
     */
    private String name;

    /**
     * 分类说明
     */
    private String description;

    /**
     * 分类下文章数量
     */
    private Integer number = 0;

    /**
     * 分类下文章列表
     * 一种分类下文章不止一篇
     */
    private List<ArticleVo> articleList;

}
