package com.wjl.lblog.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wjl.lblog.model.entity.Permission;
import com.wjl.lblog.repository.PermissionMapper;
import com.wjl.lblog.service.intf.PermissionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Objects;

/**
 * @author: wjl
 * @date: 2021/12/8 20:52
 * @version: v1.0
 */
@Service
public class PermissionServiceImpl extends ServiceImpl<PermissionMapper, Permission>
        implements PermissionService {

    @Resource
    private PermissionMapper permissionMapper;

    @Override
    public List<Permission> findAllPermission() {
        var wrapper = new LambdaQueryWrapper<Permission>();
        return permissionMapper.selectList(wrapper);
    }

    @Override
    public Permission findPermissionById(Long pid) {
        var wrapper = new LambdaQueryWrapper<Permission>();
        wrapper.eq(Permission::getId, pid);
        return permissionMapper.selectOne(wrapper);
    }

    @Override
    public Permission findPermissionByPermission(String permission) {
        var wrapper = new LambdaQueryWrapper<Permission>();
        wrapper.eq(Permission::getPermission, permission);
        return permissionMapper.selectOne(wrapper);
    }

    @Override
    public String addPermission(Permission permission) {
        if (!Objects.isNull(permission)) {
            permissionMapper.insert(permission);
            return permission.getPermission();
        }
        return null;
    }

}
