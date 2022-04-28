package com.wjl.lblog.model.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.wjl.lblog.common.constants.GlobalConstants;
import lombok.*;

/**
 * 用户
 *
 * @author: wjl
 * @date: 2021/9/15 15:59
 * @version: v1.0
 */
@Data
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@TableName(value = "user")
public class User {

    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * token
     */
    private String token;

    /**
     * 头像
     */
    @NonNull
    @Builder.Default
    private String avatar = GlobalConstants.AVATAR;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 性别
     */
    private Integer gender;

    /**
     * 地址
     */
    private String location;

    /**
     * 个性签名
     */
    private String signature;

    /**
     * 简介
     */
    private String profile;

}
