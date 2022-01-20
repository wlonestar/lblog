package com.wjl.lblog.model.vo;

import lombok.Data;

import java.util.Date;

/**
 * @author: wjl
 * @date: 2021/9/14 15:41
 * @version: v1.0
 */
@Data
public class ArticleDetailVo {

    private Long id;
    private Date createTime;
    private Date updateTime;
    private String title;
    private String summary;
    private String cover;
    private String content;
    private Long categoryId;
    private String category;

}
