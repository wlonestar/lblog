package com.wjl.lblog.model.dto;

import lombok.*;

/**
 * @author: wjl
 * @time: 2022/4/27 14:58
 * @version: 1.0
 */
@Data
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TimelineDto {

    private String title;
    private String content;

}
