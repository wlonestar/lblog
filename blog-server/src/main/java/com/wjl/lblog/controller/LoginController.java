package com.wjl.lblog.controller;

import cn.dev33.satoken.secure.SaBase64Util;
import cn.dev33.satoken.stp.StpUtil;
import com.wjl.lblog.model.entity.User;
import com.wjl.lblog.service.intf.UserService;
import com.wjl.lblog.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

/**
 * 登录
 *
 * @author: wjl
 * @date: 2021/9/15 16:41
 * @version: v1.0
 */
@RestController
public class LoginController {

    @Autowired
    private UserService userService;

    /**
     * 登录
     *
     * @param user
     */
    @PostMapping("/login")
    public Result<User> login(@RequestBody User user) {
        String username = user.getUsername();
        String password = user.getPassword();
        User user1 = userService.findByUsername(username);
        if (!Objects.isNull(user1)) {
            if (SaBase64Util.decode(user1.getPassword()).equals(password)) {
                StpUtil.login(username);
                user1.setSatoken(StpUtil.getTokenValue());
                user1.setPassword(null);
                return Result.success(user1);
            }
        }
        return Result.fail(401, "登录失败");
    }

    /**
     * 注销
     */
    @PostMapping("/logout")
    public Result<User> logout(@RequestHeader String tokenValue) {
        if (!Objects.isNull(tokenValue)) {
            StpUtil.logoutByTokenValue(tokenValue);
            return Result.success("成功退出");
        }
        return Result.fail(401, "注销失败");
    }

}
