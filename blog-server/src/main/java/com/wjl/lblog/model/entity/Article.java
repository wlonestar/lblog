package com.wjl.lblog.model.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;
import lombok.ToString;

import java.util.Date;

/**
 * 文章
 *
 * @author: wjl
 * @date: 2021/9/13 20:46
 * @version: v1.0
 */
@ToString
@Data
@TableName(value = "article")
public class Article {

    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    /**
     * 更新时间
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
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
