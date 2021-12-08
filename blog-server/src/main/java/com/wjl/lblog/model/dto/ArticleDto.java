package com.wjl.lblog.model.dto;

import lombok.Data;

/**
 * @author: wjl
 * @date: 2021/12/8 20:09
 * @version: v1.0
 */
@Data
public class ArticleDto {

    private Long id;

    private Long categoryId;

    private Long tagId;

}
