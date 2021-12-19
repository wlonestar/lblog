package com.wjl.lblog.service.impl;

import com.wjl.lblog.model.entity.User;
import com.wjl.lblog.model.entity.UserRole;
import com.wjl.lblog.repository.UserRoleRepository;
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
    private UserRoleRepository userRoleRepository;

    @Override
    public List<UserRole> findAll() {
        return userRoleRepository.findAll();
    }

    @Override
    public List<UserRole> findRolesByUser(User user) {
        return userRoleRepository.findAllByUid(user.getId());
    }

    @Override
    public UserRole addUserRole(UserRole userRole) {
        return userRoleRepository.save(userRole);
    }

}
