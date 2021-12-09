package com.wjl.lblog.service.intf;

import com.wjl.lblog.model.entity.User;

import java.util.List;

/**
 * @author: wjl
 * @date: 2021/9/15 16:34
 * @version: v1.0
 */
public interface UserService {

    List<User> findAll();

    List<String> findAllUsername();


    User findById(Long id);

    User findByUsername(String username);

    User findByUsernameAndPassword(String username, String password);


    boolean addUser(User user);

    boolean updateUser(Long id, User user);

    boolean updateUser(String username, User user);

    boolean deleteById(Long id);

}
