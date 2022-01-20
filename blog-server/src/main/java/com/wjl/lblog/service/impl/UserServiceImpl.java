package com.wjl.lblog.service.impl;

import com.wjl.lblog.model.entity.User;
import com.wjl.lblog.repository.UserRepository;
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
    private UserRepository userRepository;

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
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
        User user = userRepository.findUserById(id);
        if (!Objects.isNull(user)) {
            return user;
        }
        return null;
    }

    @Override
    public User findByUsername(String username) {
        User user = userRepository.findUserByUsername(username);
        if (!Objects.isNull(user)) {
            return user;
        }
        return null;
    }

    @Override
    public User findByUsernameAndPassword(String username, String password) {
        User user = userRepository.findUserByUsernameAndPassword(username, password);
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
            userRepository.save(user1);
            return true;
        }
        return false;
    }

    @Override
    public boolean updateUser(Long id, User user) {
        if (!Objects.isNull(user)) {
            User user1 = userRepository.findUserById(id);
            if (!Objects.isNull(user1)) {
                BeanUtils.copyProperties(user, user1, "id");
                userRepository.save(user1);
                return true;
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
                userRepository.save(user1);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean deleteById(Long id) {
        if (!Objects.isNull(userRepository.findUserById(id))) {
            userRepository.deleteById(id);
            return true;
        }
        return false;
    }

}
