package com.wjl.lblog.model.dto;

import lombok.Data;

/**
 * @author: wjl
 * @date: 2021/12/8 20:23
 * @version: v1.0
 */
@Data
public class UserRegisterDto {

    private String username;

    private String password;

    private String repeatPassword;

}
