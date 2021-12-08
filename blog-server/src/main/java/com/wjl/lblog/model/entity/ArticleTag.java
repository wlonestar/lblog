package com.wjl.lblog.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

/**
 * @author: wjl
 * @date: 2021/12/8 18:52
 * @version: v1.0
 */
@Getter
@Setter
@ToString
@Entity
@Table(name = "article_tag")
@JsonIgnoreProperties({"handler", "hibernateLazyInitializer"})
public class ArticleTag {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "aid")
    private Long aid;

    @Column(name = "tid")
    private Long tid;

}
