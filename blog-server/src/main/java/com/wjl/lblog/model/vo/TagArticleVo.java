package com.wjl.lblog.model.vo;

import lombok.Data;
import org.springframework.data.domain.Page;

import java.util.Date;

/**
 * @author: wjl
 * @date: 2021/12/8 20:21
 * @version: v1.0
 */
@Data
public class TagArticleVo {

    private Long id;

    private Date createTime;

    private Date updateTime;

    private String name;

    private Integer number = 0;

    Page<ArticleTitleVo> articles;

}
