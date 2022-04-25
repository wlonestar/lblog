package com.wjl.lblog.model.vo;

import com.baomidou.mybatisplus.core.metadata.IPage;
import lombok.*;

import java.util.Date;

/**
 * @author: wjl
 * @time: 2022/4/24 19:52
 * @version: 1.0
 */
@Data
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TagArticleVo {

    private Long id;
    private Date createTime;
    private String name;
    IPage<ArticleSummaryVo> articles;

}
