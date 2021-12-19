package com.wjl.lblog.model.dto;

import lombok.Data;

import java.util.List;

/**
 * @author: wjl
 * @date: 2021/12/9 10:08
 * @version: v1.0
 */
@Data
public class ArticleDto {

    private String title;
    private String summary;
    private String cover;
    private String content;
    private String category;

}
