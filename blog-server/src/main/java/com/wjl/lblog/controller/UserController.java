package com.wjl.lblog.controller;

import com.wjl.lblog.model.entity.User;
import com.wjl.lblog.service.intf.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 用户
 *
 * @author: wjl
 * @date: 2021/9/15 16:56
 * @version: v1.0
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 添加用户
     *
     * @param user 用户
     */
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public User add(@RequestBody User user) {
        return userService.addUser(user);
    }

    /**
     * 根据 id 获取用户信息
     */
    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public User getUserById(@RequestParam(name = "id") Long id) {
        User user = userService.findById(id);
        user.setPassword(null);
        return user;
    }

    /**
     * 根据用户名获取用户信息
     */
    @RequestMapping(value = "/name", method = RequestMethod.GET)
    public User getUserInfo(@RequestParam(name = "username") String username) {
        User user = userService.findByUsername(username);
        user.setId(null);
        user.setPassword(null);
        return user;
    }

    /**
     * 更新密码
     *
     * @param user 用户信息
     */
    @RequestMapping(value = "/password", method = RequestMethod.PUT)
    public User update(@RequestParam(name = "id") Long id, @RequestBody User user) {
        return userService.update(id, user);
    }

}
