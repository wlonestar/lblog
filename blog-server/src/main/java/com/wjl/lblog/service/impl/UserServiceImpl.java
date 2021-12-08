package com.wjl.lblog.service.impl;

import cn.dev33.satoken.secure.SaBase64Util;
import com.wjl.lblog.model.entity.User;
import com.wjl.lblog.repository.UserRepository;
import com.wjl.lblog.service.intf.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

/**
 * @author: wjl
 * @date: 2021/9/15 16:44
 * @version: v1.0
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    /**
     * 通过用户名查找用户
     *
     * @param username
     */
    @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    /**
     * 通过 id 查找用户
     *
     * @param id
     */
    @Override
    public User findById(Long id) {
        User user = userRepository.findById(id).orElseThrow();
        if (!Objects.isNull(user)) {
            return user;
        }
        return null;
    }

    /**
     * 添加用户
     *
     * @param user
     */
    @Override
    public User add(User user) {
        String encode = SaBase64Util.encode(user.getPassword());
        user.setPassword(encode);
        return userRepository.save(user);
    }

    /**
     * 更新密码
     *
     * @param user
     */
    @Override
    public User update(Long id, User user) {
        User user1 = userRepository.findById(id).orElseThrow();
        if (!Objects.isNull(user1)) {
            user1.setUsername(user.getUsername());
            user1.setPassword(SaBase64Util.encode(user.getPassword()));
//            user1.setTitle(user.getTitle());
//            user1.setSubtitle(user.getSubtitle());
            user1.setAvatar(user.getAvatar());
            return userRepository.save(user1);
        }
        return null;
    }

}
