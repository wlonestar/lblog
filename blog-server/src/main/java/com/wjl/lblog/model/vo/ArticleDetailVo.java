package com.wjl.lblog.model.vo;

import com.wjl.lblog.model.entity.Category;
import com.wjl.lblog.model.entity.Tag;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @author: wjl
 * @date: 2021/9/14 15:41
 * @version: v1.0
 */
@Data
public class ArticleDetailVo {

    private Long id;

    private Date createTime;

    private Date updateTime;

    private String title;

    private String summary;

    private String cover;

    private String content;

    private Category category;

    private List<Tag> tags;

}
