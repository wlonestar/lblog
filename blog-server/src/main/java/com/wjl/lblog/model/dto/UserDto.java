package com.wjl.lblog.model.dto;

import lombok.*;

/**
 * @author: wjl
 * @time: 2022/4/27 15:16
 * @version: 1.0
 */
@Data
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    private String username;
    private String password;
    private String avatar;
    private Integer age;
    private Integer gender;
    private String location;
    private String signature;
    private String profile;

}
