package com.wjl.lblog.service.intf;

import com.wjl.lblog.model.dto.RolePermissionDto;
import com.wjl.lblog.model.entity.Role;

import java.util.List;

/**
 * @author: wjl
 * @date: 2021/12/8 20:38
 * @version: v1.0
 */
public interface RoleService {

    List<Role> findAllRoles();

    Role findRoleById(Long rid);

    Role findRoleByRoleName(String role);

    String addRole(Role role);

    boolean addRolePermission(RolePermissionDto rolePermissionDto);

}
