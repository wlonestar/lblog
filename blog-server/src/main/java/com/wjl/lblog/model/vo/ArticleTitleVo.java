package com.wjl.lblog.model.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author: wjl
 * @date: 2021/10/10 16:58
 * @version: v1.0
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ArticleTitleVo {

    private Long id;
    private Date createTime;
    private String title;

}
