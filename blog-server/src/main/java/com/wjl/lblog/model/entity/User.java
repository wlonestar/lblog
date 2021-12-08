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
    @Column(name = "satoken")
    private String satoken;

    /**
     * 网站标题
     */
    @Column(name = "title")
    private String title;

    /**
     * 网站slogan
     */
    @Column(name = "subtitle")
    private String subtitle;

    /**
     * 头像
     */
    @Column(name = "avatar")
    private String avatar;

}
