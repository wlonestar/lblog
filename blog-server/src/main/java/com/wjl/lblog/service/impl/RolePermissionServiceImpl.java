package com.wjl.lblog.service.impl;

import com.wjl.lblog.model.entity.Role;
import com.wjl.lblog.model.entity.RolePermission;
import com.wjl.lblog.repository.RolePermissionRepository;
import com.wjl.lblog.service.intf.RolePermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: wjl
 * @date: 2021/12/8 20:54
 * @version: v1.0
 */
@Service
public class RolePermissionServiceImpl implements RolePermissionService {

    @Autowired
    private RolePermissionRepository rolePermissionRepository;

    @Override
    public List<RolePermission> findAllByRole(Role role) {
        return rolePermissionRepository.findAllByRid(role.getId());
    }

}
