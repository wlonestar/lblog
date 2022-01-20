package com.wjl.lblog.component;

import cn.dev33.satoken.stp.StpInterface;
import com.wjl.lblog.model.entity.*;
import com.wjl.lblog.service.intf.*;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author: wjl
 * @date: 2021/12/8 16:52
 * @version: v1.0
 */
@Component
public class StpInterfaceImpl implements StpInterface {

    @Resource
    private UserService userService;

    @Resource
    private RoleService roleService;

    @Resource
    private PermissionService permissionService;

    @Resource
    private UserRoleService userRoleService;

    @Resource
    private RolePermissionService rolePermissionService;

    /**
     * 返回指定账号id所拥有的权限码集合
     *
     * @param loginId   账号id
     * @param loginType 账号类型
     * @return 该账号id具有的权限码集合
     */
    @Override
    public List<String> getPermissionList(Object loginId, String loginType) {
        User user = userService.findByUsername(loginId.toString());
        List<UserRole> userRoles = userRoleService.findRolesByUser(user);
        Set<String> permissions = new HashSet<>();
        for (UserRole userRole : userRoles) {
            Role role = roleService.findRoleById(userRole.getRid());
            List<RolePermission> rolePermissions = rolePermissionService.findAllByRole(role);
            for (RolePermission rolePermission : rolePermissions) {
                Permission permission = permissionService.fnidPermissionById(rolePermission.getPid());
                permissions.add(permission.getPermission());
            }
        }
        return new ArrayList<>(permissions);
    }

    /**
     * 返回指定账号id所拥有的角色标识集合
     *
     * @param loginId   账号id
     * @param loginType 账号类型
     * @return 该账号id具有的角色标识集合
     */
    @Override
    public List<String> getRoleList(Object loginId, String loginType) {
        List<UserRole> userRoles = userRoleService.findRolesByUser(userService.findByUsername(loginId.toString()));
        List<String> roles = new ArrayList<>();
        for (UserRole userRole : userRoles) {
            roles.add(roleService.findRoleById(userRole.getRid()).getRole());
        }
        return roles;
    }

}
