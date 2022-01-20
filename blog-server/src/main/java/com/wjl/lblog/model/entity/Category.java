package com.wjl.lblog.model.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * 分类
 *
 * @author: wjl
 * @date: 2021/9/13 20:54
 * @version: v1.0
 */
@Data
@TableName(value = "category")
public class Category {

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

}
