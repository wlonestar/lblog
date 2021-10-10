package com.wjl.lblog.model.dto;

import com.wjl.lblog.model.dto.ArticleTitleDto;
import lombok.Data;
import org.springframework.data.domain.Page;

import java.util.Date;

/**
 * @author: wjl
 * @date: 2021/10/10 18:11
 * @version: v1.0
 */
@Data
public class CategoryArticleDto {

    private Long id;

    private Date createTime;

    private Date updateTime;

    private String name;

    private String description;

    private Integer number = 0;

    Page<ArticleTitleDto> articles;

}
