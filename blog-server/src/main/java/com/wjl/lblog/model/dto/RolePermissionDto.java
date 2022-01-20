package com.wjl.lblog.model.dto;

import lombok.Data;

/**
 * @author: wjl
 * @date: 2021/12/8 20:46
 * @version: v1.0
 */
@Data
public class RolePermissionDto {

    private Long id;
    private String role;
    private String permission;

}
