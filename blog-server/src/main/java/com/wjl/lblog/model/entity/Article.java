package com.wjl.lblog.model.entity;

import lombok.Data;

import java.util.Date;

/**
 * 文章
 *
 * @author: wjl
 * @date: 2021/9/13 20:46
 * @version: v1.0
 */
@Data
public class Article {

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
     * 标题
     */
    private String title;

    /**
     * 摘要
     */
    private String summary;

    /**
     * 题图
     */
    private String cover;

    /**
     * 正文
     */
    private String content;

    /**
     * 所属分类 id
     */
    private Long categoryId;

}
