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
     * @param user
     */
    @PostMapping("/add")
    public User add(@RequestBody User user) {
        return userService.add(user);
    }

    /**
     * 更新密码
     *
     * @param user
     */
    @PutMapping("/update")
    public User update(@RequestBody User user) {
        return userService.update(user);
    }

}
