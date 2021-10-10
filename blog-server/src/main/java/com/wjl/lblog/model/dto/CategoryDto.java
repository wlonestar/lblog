package com.wjl.lblog.model.dto;

import lombok.Data;
import org.springframework.data.domain.Page;

import java.util.Date;
import java.util.List;

/**
 * @author: wjl
 * @date: 2021/9/14 15:42
 * @version: v1.0
 */
@Data
public class CategoryDto {

    private Long id;

    private Date createTime;

    private Date updateTime;

    private String name;

    private String description;

    private Integer number = 0;

    private Long articleId;

    private Date articleTime;

    private String articleTitle;

}
