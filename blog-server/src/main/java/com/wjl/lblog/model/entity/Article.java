package com.wjl.lblog.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
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
@Getter
@Setter
@ToString
@Entity
@Table(name = "article")
@JsonIgnoreProperties({"handler", "hibernateLazyInitializer"})
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
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
    @Column(name = "cover")
    private String cover;

    /**
     * 正文
     */
    @Column(name = "content")
    private String content;

    /**
     * 所属分类 id
     */
    @Column(name="category_id")
    private Long categoryId;

}
