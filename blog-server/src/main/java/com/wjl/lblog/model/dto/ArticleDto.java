package com.wjl.lblog.model.dto;

import lombok.*;

import java.util.List;

/**
 * @author: wjl
 * @date: 2021/12/9 10:08
 * @version: v1.0
 */
@Data
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ArticleDto {

    private String title;
    private String summary;
    private String image;
    private String content;
    private String category;
    private List<String> tags;

}
