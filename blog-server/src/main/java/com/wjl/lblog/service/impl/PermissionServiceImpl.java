package com.wjl.lblog.service.impl;

import com.wjl.lblog.model.entity.Permission;
import com.wjl.lblog.repository.PermissionRepository;
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
public class PermissionServiceImpl implements PermissionService {

    @Resource
    private PermissionRepository permissionRepository;

    @Override
    public List<Permission> findAllPermission() {
        return permissionRepository.findAll();
    }

    @Override
    public Permission fnidPermissionById(Long pid) {
        return permissionRepository.findPermissionById(pid);
    }

    @Override
    public String addPermission(Permission permission) {
        if (!Objects.isNull(permission)) {
            permissionRepository.save(permission);
            return permission.getPermission();
        }
        return null;
    }

}
