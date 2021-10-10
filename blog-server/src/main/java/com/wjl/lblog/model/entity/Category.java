package com.wjl.lblog.model.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

/**
 * 分类
 *
 * @author: wjl
 * @date: 2021/9/13 20:54
 * @version: v1.0
 */
@Getter
@Setter
@ToString
@Entity
@Table(name = "category")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id")
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
     * 分类名称
     */
    @Column(name = "category_name")
    private String name;

    /**
     * 分类说明
     */
    @Column(name = "category_desc")
    private String description;

    /**
     * 分类下文章数量
     */
    @Column(name = "category_number")
    private Integer number = 0;

}
