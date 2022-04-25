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
@TableName(value = "role")
public class Role {

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
     * 角色
     */
    private String role;

}
