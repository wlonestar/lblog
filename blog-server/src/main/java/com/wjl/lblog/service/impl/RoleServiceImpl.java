package com.wjl.lblog.service.impl;

import com.wjl.lblog.model.dto.RolePermissionDto;
import com.wjl.lblog.model.entity.Role;
import com.wjl.lblog.model.entity.RolePermission;
import com.wjl.lblog.repository.PermissionRepository;
import com.wjl.lblog.repository.RolePermissionRepository;
import com.wjl.lblog.repository.RoleRepository;
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
    private RoleRepository roleRepository;

    @Resource
    private PermissionRepository permissionRepository;

    @Resource
    private RolePermissionRepository rolePermissionRepository;

    @Override
    public List<Role> findAllRoles() {
        return roleRepository.findAll();
    }

    @Override
    public Role findRoleById(Long rid) {
        return roleRepository.findRoleById(rid);
    }

    @Override
    public Role findRoleByRoleName(String role) {
        return roleRepository.findRoleByRole(role);
    }

    @Override
    public String addRole(Role role) {
        if (!Objects.isNull(role)) {
            roleRepository.save(role);
            return role.getRole();
        }
        return null;
    }

    @Override
    public boolean addRolePermission(RolePermissionDto rolePermissionDto) {
        if (!Objects.isNull(rolePermissionDto)) {
            RolePermission rolePermission = new RolePermission();
            String role = rolePermissionDto.getRole();
            rolePermission.setRid(roleRepository.findRoleByRole(role).getId());
            String permission = rolePermissionDto.getPermission();
            rolePermission.setPid(permissionRepository.findPermissionByPermission(permission).getId());
            rolePermissionRepository.save(rolePermission);
            return true;
        }
        return false;
    }

}
