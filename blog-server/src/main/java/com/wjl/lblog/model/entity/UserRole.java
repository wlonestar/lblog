package com.wjl.lblog.model.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

/**
 * @author: wjl
 * @date: 2021/12/8 18:52
 * @version: v1.0
 */
@Data
@TableName(value = "user_role")
public class UserRole {

    @TableId(type = IdType.AUTO)
    private Long id;

    private Long uid;

    private Long rid;

}
