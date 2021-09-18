package com.wjl.lblog.model.vo;

import lombok.Data;

import java.util.Date;

/**
 * @author: wjl
 * @date: 2021/9/14 15:41
 * @version: v1.0
 */
@Data
public class ArticleVo {

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
    private String image;

    /**
     * 正文
     */
    private String content;

    /**
     * 分类
     */
    private String category;

}
