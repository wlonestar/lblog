package com.wjl.lblog.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.wjl.lblog.model.entity.Role;
import com.wjl.lblog.model.entity.RolePermission;
import com.wjl.lblog.repository.RolePermissionMapper;
import com.wjl.lblog.service.intf.RolePermissionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: wjl
 * @date: 2021/12/8 20:54
 * @version: v1.0
 */
@Service
public class RolePermissionServiceImpl implements RolePermissionService {

    @Resource
    private RolePermissionMapper rolePermissionMapper;

    @Override
    public List<RolePermission> findAllByRole(Role role) {
        var wrapper = new LambdaQueryWrapper<RolePermission>();
        wrapper.eq(RolePermission::getRid, role.getId());
        return rolePermissionMapper.selectList(wrapper);
    }

}
