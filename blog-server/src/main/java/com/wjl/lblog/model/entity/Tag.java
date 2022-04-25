<<<<<<<< HEAD:blog-server/src/main/java/com/wjl/lblog/model/entity/Tag.java
package com.wjl.lblog.model.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.*;

import java.util.Date;

/**
 * 标签
 *
 * @author: wjl
 * @time: 2022/4/24 19:29
 * @version: 1.0
 */
@Data
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@TableName(value = "tag")
public class Tag {

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
    private Date modifyTime;

    /**
     * 标签名称
     */
    private String name;

}
========
package com.wjl.lblog.model.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.*;

import java.util.Date;

/**
 * @author: wjl
 * @date: 2021/12/8 18:53
 * @version: v1.0
 */
@Data
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@TableName(value = "permission")
public class Permission {

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
    private Date modifyTime;

    /**
     * 权限
     */
    private String permission;

}
>>>>>>>> 1a74263 (fix: add tag entity, remove number field):blog-server/src/main/java/com/wjl/lblog/model/entity/Permission.java
