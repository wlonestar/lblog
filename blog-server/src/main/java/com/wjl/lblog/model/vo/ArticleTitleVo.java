package com.wjl.lblog.model.vo;

import lombok.Data;

import java.util.Date;

/**
 * @author: wjl
 * @date: 2021/10/10 16:58
 * @version: v1.0
 */
@Data
public class ArticleTitleVo {

    private Long id;

    private Date articleTime;

    private String title;

}
