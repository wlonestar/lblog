package com.wjl.lblog.model.vo;

import lombok.*;

/**
 * @author: wjl
 * @time: 2022/4/27 15:33
 * @version: 1.0
 */
@Data
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class UserVo {

    private String username;
    private String avatar;
    private Integer age;
    private Integer gender;
    private String location;
    private String signature;
    private String profile;

}
