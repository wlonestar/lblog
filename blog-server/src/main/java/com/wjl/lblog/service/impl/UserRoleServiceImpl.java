package com.wjl.lblog.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.wjl.lblog.model.entity.User;
import com.wjl.lblog.model.entity.UserRole;
import com.wjl.lblog.repository.UserRoleMapper;
import com.wjl.lblog.service.intf.UserRoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: wjl
 * @date: 2021/12/8 20:43
 * @version: v1.0
 */
@Service
public class UserRoleServiceImpl implements UserRoleService {

    @Resource
    private UserRoleMapper userRoleMapper;

    @Override
    public List<UserRole> findAll() {
        var wrapper = new LambdaQueryWrapper<UserRole>();
        return userRoleMapper.selectList(wrapper);
    }

    @Override
    public List<UserRole> findRolesByUser(User user) {
        var wrapper = new LambdaQueryWrapper<UserRole>();
        wrapper.eq(UserRole::getUid, user.getId());
        return userRoleMapper.selectList(wrapper);
    }

    @Override
    public boolean addUserRole(UserRole userRole) {
        var res = userRoleMapper.insert(userRole);
        return res == 1;
    }

}
