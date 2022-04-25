package com.wjl.lblog.model.vo;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

/**
 * @author: wjl
 * @date: 2021/10/10 16:28
 * @version: v1.0
 */
@Data
@ToString
public class ArticleSummaryVo {

    private Long id;
    private Date createTime;
    private String title;
    private String summary;
    private String image;
    private String category;

}
