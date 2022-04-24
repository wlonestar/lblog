package com.wjl.lblog.model.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.util.Date;

/**
 * 图片
 *
 * @author: wjl
 * @date: 2021/9/18 22:28
 * @version: v1.0
 */
@Data
@TableName(value = "image")
public class Image {

    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 上传时间
     */
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    /**
     * 名称
     */
    private String name;

    /**
     * 路径
     */
    private String url;

}
