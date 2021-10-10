package com.wjl.lblog.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author: wjl
 * @date: 2021/9/14 15:41
 * @version: v1.0
 */
@Data
public class ArticleDto {

    private Long id;

    private Date createTime;

    private Date updateTime;

    private String title;

    private String summary;

    private String image;

    private String content;

    private Long categoryId;

    private String categoryName;

}
