package com.wjl.lblog.service.intf;

import com.wjl.lblog.model.entity.Permission;

import java.util.List;

/**
 * @author: wjl
 * @date: 2021/12/8 20:37
 * @version: v1.0
 */
public interface PermissionService {

    List<Permission> findAllPermission();

    Permission findPermissionById(Long pid);

    Permission findPermissionByPermission(String permission);

    String addPermission(Permission permission);

}
