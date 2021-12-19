package com.wjl.lblog.controller;

import com.wjl.lblog.common.constants.Result;
import com.wjl.lblog.common.enums.HttpStatus;
import com.wjl.lblog.model.entity.User;
import com.wjl.lblog.service.intf.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 用户接口
 *
 * @author: wjl
 * @date: 2021/9/15 16:56
 * @version: v1.0
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    /**
     * 添加用户
     *
     * @param user 用户
     */
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public Object add(@RequestBody User user) {
        if (userService.addUser(user)) {
            return user;
        }
        return Result.fail(HttpStatus.BAD_REQUEST.getCode(), "failed");
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
    public Object update(@RequestParam(name = "id") Long id, @RequestBody User user) {
        if (userService.updateUser(id, user)) {
            return user;
        } else {
            return Result.fail(HttpStatus.BAD_REQUEST.getCode(), "failed");
        }
    }

}
