package com.wjl.lblog.model.vo;

import com.baomidou.mybatisplus.core.metadata.IPage;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author: wjl
 * @date: 2021/10/10 18:11
 * @version: v1.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CategoryArticleVo {

    private Long id;
    private Date createTime;
    private String name;
    IPage<ArticleSummaryVo> articles;

}
