package com.wjl.lblog.model.vo;

import com.wjl.lblog.model.dto.CategoryDto;
import com.wjl.lblog.model.dto.TagDto;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @author: wjl
 * @date: 2021/10/10 16:28
 * @version: v1.0
 */
@Data
public class ArticleSummaryVo {

    private Long id;
    private Date createTime;
    private Date updateTime;
    private String title;
    private String summary;
    private String cover;
    private Long categoryId;
    private String category;

}
