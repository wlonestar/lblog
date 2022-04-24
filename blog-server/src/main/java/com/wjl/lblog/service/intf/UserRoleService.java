package com.wjl.lblog.service.intf;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wjl.lblog.model.entity.User;
import com.wjl.lblog.model.entity.UserRole;

import java.util.List;

/**
 * @author: wjl
 * @date: 2021/12/8 20:38
 * @version: v1.0
 */
public interface UserRoleService extends IService<UserRole> {

    List<UserRole> findAll();

    List<UserRole> findRolesByUser(User user);

    boolean addUserRole(UserRole userRole);

}
