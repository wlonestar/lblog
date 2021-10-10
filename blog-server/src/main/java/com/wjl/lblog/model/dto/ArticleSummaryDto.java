package com.wjl.lblog.model.dto;

import lombok.Data;

import java.util.Date;

/**
 * @author: wjl
 * @date: 2021/10/10 16:28
 * @version: v1.0
 */
@Data
public class ArticleSummaryDto {

    private Long id;

    private Date createTime;

    private Date updateTime;

    private String title;

    private String summary;

    private String image;

    private Long categoryId;

    private String categoryName;

}
