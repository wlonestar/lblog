package com.wjl.lblog.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.wjl.lblog.model.dto.RolePermissionDto;
import com.wjl.lblog.model.entity.Role;
import com.wjl.lblog.model.entity.RolePermission;
import com.wjl.lblog.repository.RolePermissionMapper;
import com.wjl.lblog.repository.RoleMapper;
import com.wjl.lblog.service.intf.PermissionService;
import com.wjl.lblog.service.intf.RoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Objects;

/**
 * @author: wjl
 * @date: 2021/12/8 20:46
 * @version: v1.0
 */
@Service
public class RoleServiceImpl implements RoleService {

    @Resource
    private RoleMapper roleMapper;

    @Resource
    private PermissionService permissionService;

    @Resource
    private RolePermissionMapper rolePermissionMapper;

    @Override
    public List<Role> findAllRoles() {
        var wrapper = new LambdaQueryWrapper<Role>();
        return roleMapper.selectList(wrapper);
    }

    @Override
    public Role findRoleById(Long rid) {
        var wrapper = new LambdaQueryWrapper<Role>();
        wrapper.eq(Role::getId, rid);
        return roleMapper.selectOne(wrapper);
    }

    @Override
    public Role findRoleByRoleName(String role) {
        var wrapper = new LambdaQueryWrapper<Role>();
        wrapper.eq(Role::getRole, role);
        return roleMapper.selectOne(wrapper);
    }

    @Override
    public boolean addRole(Role role) {
        if (!Objects.isNull(role)) {
            var res = roleMapper.insert(role);
            return res == 1;
        }
        return false;
    }

    @Override
    public boolean addRolePermission(RolePermissionDto rolePermissionDto) {
        if (!Objects.isNull(rolePermissionDto)) {
            RolePermission rolePermission = new RolePermission();
            String role = rolePermissionDto.getRole();
            rolePermission.setRid(findRoleByRoleName(role).getId());
            String permission = rolePermissionDto.getPermission();
            rolePermission.setPid(permissionService.findPermissionByPermission(permission).getId());
            rolePermissionMapper.insert(rolePermission);
            return true;
        }
        return false;
    }

}
