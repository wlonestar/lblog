package com.wjl.lblog.model.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

/**
 * 留言
 *
 * @author: wjl
 * @date: 2021/9/13 22:48
 * @version: v1.0
 */
@Getter
@Setter
@Entity
@Table(name = "comment")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "comment_id")
    private Long id;

    /**
     * 创建时间
     */
    @Temporal(TemporalType.TIMESTAMP)
    @CreationTimestamp
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 头像
     */
    @Column(name = "avatar")
    private String avatar;

    /**
     * 昵称
     */
    @Column(name = "nickname")
    private String nickname;

    /**
     * 个人网站
     */
    @Column(name = "site")
    private String site;

    /**
     * 邮箱
     */
    @Column(name = "email")
    private String email;

    /**
     * 留言正文
     */
    @Column(name = "content")
    private String content;

}
