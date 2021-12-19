package com.wjl.lblog.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author: wjl
 * @date: 2021/12/9 9:51
 * @version: v1.0
 */
@AllArgsConstructor
@Data
public class CategoryDto {

    private String name;

    private String description;

    private Integer number;

}
