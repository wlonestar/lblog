package com.wjl.lblog.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author: wjl
 * @date: 2021/9/27 10:50
 * @version: v1.0
 */
@Getter
@Setter
@Entity
@Table(name = "link")
@JsonIgnoreProperties({"handler", "hibernateLazyInitializer"})
public class Link {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "slogan")
    private String slogan;

    @Column(name = "image")
    private String image;

    @Column(name = "url")
    private String url;

}
