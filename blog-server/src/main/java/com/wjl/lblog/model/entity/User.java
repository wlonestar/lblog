package com.wjl.lblog.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * 用户
 *
 * @author: wjl
 * @date: 2021/9/15 15:59
 * @version: v1.0
 */
@Getter
@Setter
@Entity
@Table(name = "user")
@JsonIgnoreProperties({"handler", "hibernateLazyInitializer"})
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    /**
     * 用户名
     */
    @Column(name = "username")
    private String username;

    /**
     * 密码
     */
    @Column(name = "password")
    private String password;

    /**
     * token
     */
    @Column(name = "token")
    private String token;

    /**
     * 头像
     */
    @Column(name = "avatar")
    private String avatar;

    /**
     * 年龄
     */
    @Column(name = "age")
    private Integer age;

    /**
     * 性别
     */
    @Column(name = "gender")
    private Boolean gender;

    /**
     * 地址
     */
    @Column(name = "location")
    private String location;

    /**
     * 个性签名
     */
    @Column(name = "signature")
    private String signature;

    /**
     * 简介
     */
    @Lob
    @Column(name = "profile")
    private String profile;

}
