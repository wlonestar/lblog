package com.wjl.lblog.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.wjl.lblog.common.constants.GlobalConstants;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

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
@JsonIgnoreProperties({"handler", "hibernateLazyInitializer"})
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    /**
     * 创建时间
     */
    @Temporal(TemporalType.TIMESTAMP)
    @CreationTimestamp
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    @Temporal(TemporalType.TIMESTAMP)
    @UpdateTimestamp
    private Date updateTime;

    /**
     * 留言正文
     */
    @Column(name = "content")
    private String content;

    /**
     * 昵称
     */
    @Column(name = "username")
    private String username;

    /**
     * 头像
     */
    @Column(name = "avatar")
    private String avatar = GlobalConstants.AVATAR;

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

}
