package com.wjl.lblog.service.intf;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wjl.lblog.model.entity.Role;
import com.wjl.lblog.model.entity.RolePermission;

import java.util.List;

/**
 * @author: wjl
 * @date: 2021/12/8 20:38
 * @version: v1.0
 */
public interface RolePermissionService extends IService<RolePermission> {

    List<RolePermission> findAllByRole(Role role);

}
