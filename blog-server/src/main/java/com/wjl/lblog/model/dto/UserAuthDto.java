package com.wjl.lblog.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: wjl
 * @date: 2021/12/8 20:22
 * @version: v1.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserAuthDto {

    private String username;
    private String password;

}
