package com.wjl.lblog.model.dto;

import lombok.Data;

import java.util.Date;

/**
 * @author: wjl
 * @date: 2021/10/10 16:58
 * @version: v1.0
 */
@Data
public class ArticleTitleDto {

    private Long articleId;

    private Date articleTime;

    private String articleTitle;

}
