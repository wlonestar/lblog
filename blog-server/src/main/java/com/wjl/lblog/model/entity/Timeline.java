package com.wjl.lblog.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

/**
 * 时间线
 *
 * @author: wjl
 * @date: 2021/9/16 14:55
 * @version: v1.0
 */
@Getter
@Setter
@Entity
@Table(name = "timeline")
@JsonIgnoreProperties({"handler", "hibernateLazyInitializer"})
public class Timeline {

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
     * 正文
     */
    @Column(name = "content")
    private String content;

}
