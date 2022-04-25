package com.wjl.lblog.model.vo;

import lombok.Data;
import lombok.ToString;

import java.util.Date;
import java.util.List;

/**
 * @author: wjl
 * @date: 2021/9/14 15:41
 * @version: v1.0
 */
@Data
@ToString
public class ArticleDetailVo {

    private Long id;
    private Date createTime;
    private String title;
    private String summary;
    private String cover;
    private String content;
    private String category;
    private List<String> tags;

}
