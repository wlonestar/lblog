package com.wjl.lblog.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

/**
 * 图片
 *
 * @author: wjl
 * @date: 2021/9/18 22:28
 * @version: v1.0
 */
@Getter
@Setter
@Entity
@Table(name = "image")
@JsonIgnoreProperties({"handler", "hibernateLazyInitializer"})
public class Image {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "article_id")
    private Long id;

    /**
     * 上传时间
     */
    @Column(name = "create_time")
    @Temporal(TemporalType.TIMESTAMP)
    @CreationTimestamp
    private Date createTime;

    /**
     * 名称
     */
    @Column(name = "name")
    private String name;

    /**
     * 路径
     */
    @Column(name = "url")
    private String url;

}
