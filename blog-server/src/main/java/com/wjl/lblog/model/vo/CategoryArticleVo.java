package com.wjl.lblog.model.vo;

import com.baomidou.mybatisplus.core.metadata.IPage;
import lombok.Data;

import java.util.Date;

/**
 * @author: wjl
 * @date: 2021/10/10 18:11
 * @version: v1.0
 */
@Data
public class CategoryArticleVo {

    private Long id;
    private Date createTime;
    private Date updateTime;
    private String name;
    private String description;
    private Integer number = 0;
    IPage<ArticleTitleVo> articles;

}
