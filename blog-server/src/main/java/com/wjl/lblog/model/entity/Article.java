package com.wjl.lblog.model.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

/**
 * 文章
 *
 * @author: wjl
 * @date: 2021/9/13 20:46
 * @version: v1.0
 */
@Data
@Entity
@Table(name = "article")
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "article_id")
    private Long id;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    @Temporal(TemporalType.TIMESTAMP)
    @CreationTimestamp
    private Date createTime;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    @Temporal(TemporalType.TIMESTAMP)
    @UpdateTimestamp
    private Date updateTime;

    /**
     * 标题
     */
    @Column(name = "title")
    private String title;

    /**
     * 摘要
     */
    @Column(name = "summary")
    private String summary;

    /**
     * 题图
     */
    @Column(name = "image")
    private String image;

    /**
     * 正文
     */
    @Column(name = "content")
    private String content;

    @ManyToOne(optional = false)
    @JoinColumn(name="category_id")
    private Category category;

}
