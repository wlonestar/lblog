package com.wjl.lblog.model.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.*;

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
@TableName(value = "role_permission")
public class RolePermission {

    @TableId(type = IdType.AUTO)
    private Long id;

    private Long rid;

    private Long pid;

}
