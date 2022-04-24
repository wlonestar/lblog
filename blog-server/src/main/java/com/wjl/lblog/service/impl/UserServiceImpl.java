package com.wjl.lblog.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.wjl.lblog.model.entity.User;
import com.wjl.lblog.repository.UserMapper;
import com.wjl.lblog.service.intf.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author: wjl
 * @date: 2021/9/15 16:44
 * @version: v1.0
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> findAll() {
        var wrapper = new LambdaQueryWrapper<User>();
        return userMapper.selectList(wrapper);
    }

    @Override
    public List<String> findAllUsername() {
        List<User> users = findAll();
        List<String> usernames = new ArrayList<>();
        for (User user : users) {
            String username = user.getUsername();
            usernames.add(username);
        }
        return usernames;
    }

    @Override
    public User findById(Long id) {
        User user = userMapper.selectById(id);
        if (!Objects.isNull(user)) {
            return user;
        }
        return null;
    }

    @Override
    public User findByUsername(String username) {
        var wrapper = new LambdaQueryWrapper<User>();
        wrapper.eq(User::getUsername, username);
        User user = userMapper.selectOne(wrapper);
        if (!Objects.isNull(user)) {
            return user;
        }
        return null;
    }

    @Override
    public User findByUsernameAndPassword(String username, String password) {
        var wrapper = new LambdaQueryWrapper<User>();
        wrapper.eq(User::getUsername, username).eq(User::getPassword, password);
        User user = userMapper.selectOne(wrapper);
        if (!Objects.isNull(user)) {
            return user;
        }
        return null;
    }

    @Override
    public boolean addUser(User user) {
        if (!Objects.isNull(user)) {
            User user1 = new User();
            BeanUtils.copyProperties(user, user1, "id", "token");
            var res = userMapper.insert(user1);
            return res == 1;
        }
        return false;
    }

    @Override
    public boolean updateUser(Long id, User user) {
        if (!Objects.isNull(user)) {
            User user1 = userMapper.selectById(id);
            if (!Objects.isNull(user1)) {
                BeanUtils.copyProperties(user, user1, "id");
                var res = userMapper.insert(user1);
                return res == 1;
            }
        }
        return false;
    }

    @Override
    public boolean updateUser(String username, User user) {
        if (!Objects.isNull(user)) {
            User user1 = findByUsername(username);
            if (!Objects.isNull(user1)) {
                BeanUtils.copyProperties(user, user1, "id", "token", "password");
                var res = userMapper.insert(user1);
                return res == 1;
            }
        }
        return false;
    }

    @Override
    public boolean deleteById(Long id) {
        if (!Objects.isNull(userMapper.selectById(id))) {
            var res = userMapper.deleteById(id);
            return res == 1;
        }
        return false;
    }

}
