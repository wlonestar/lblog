package com.wjl.lblog.controller;

import cn.dev33.satoken.secure.SaBase64Util;
import cn.dev33.satoken.stp.StpUtil;
import com.wjl.lblog.common.enums.HttpStatus;
import com.wjl.lblog.model.dto.UserLoginDto;
import com.wjl.lblog.model.dto.UserRegisterDto;
import com.wjl.lblog.model.entity.Role;
import com.wjl.lblog.model.entity.User;
import com.wjl.lblog.model.entity.UserRole;
import com.wjl.lblog.service.intf.RoleService;
import com.wjl.lblog.service.intf.UserRoleService;
import com.wjl.lblog.service.intf.UserService;
import com.wjl.lblog.common.constants.Result;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Objects;

/**
 * 登录接口
 *
 * @author: wjl
 * @date: 2021/9/15 16:41
 * @version: v1.0
 */
@RestController
@RequestMapping("/admin")
public class LoginController {

    @Resource
    private UserService userService;

    @Resource
    private RoleService roleService;

    @Resource
    private UserRoleService userRoleService;

    /**
     * 登录
     *
     * @param userLoginDto 用户信息
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Object login(@RequestBody UserLoginDto userLoginDto) {
        String username = userLoginDto.getUsername();
        String password = SaBase64Util.encode(userLoginDto.getPassword());
        if (!Objects.isNull(userService.findByUsernameAndPassword(username, password))) {
            StpUtil.login(username);
            User user = userService.findByUsername(username);
            user.setToken(StpUtil.getTokenValue());
            if (userService.updateUser(username, user)) {
                return StpUtil.getTokenInfo();
            } else {
                return Result.fail(HttpStatus.BAD_REQUEST.getCode(), "登录失败");
            }
        }
        return Result.fail(HttpStatus.BAD_REQUEST.getCode(), "登录失败");
    }

    /**
     * 验证是否登录
     *
     * @param username username
     * @param tokenValue token
     */
    @RequestMapping(value = "/check", method = RequestMethod.GET)
    public Object checkLogin(@RequestParam(name = "username") String username,
                             @RequestParam(name = "tokenValue") String tokenValue) {
        if (!Objects.isNull(username) && !Objects.isNull(tokenValue)) {
            if (StpUtil.isLogin()) {
                String loginId = StpUtil.getLoginIdAsString();
                User user = userService.findByUsername(loginId);
                if (user.getUsername().equals(username) && user.getToken().equals(tokenValue)) {
                    return Result.success("已登录");
                } else {
                    return Result.fail(HttpStatus.BAD_REQUEST.getCode(), "token 已过期，请重新登录");
                }
            } else {
                return Result.fail(HttpStatus.BAD_REQUEST.getCode(), "尚未登录");
            }
        } else {
            return Result.fail(HttpStatus.BAD_REQUEST.getCode(), "发生异常");
        }
    }

    /**
     * 注销
     *
     * @param tokenValue token
     */
    @RequestMapping(value = "/logout", method = RequestMethod.POST)
    public Result<User> logout(@RequestParam(name = "tokenValue") String tokenValue) {
        if (!Objects.isNull(tokenValue)) {
            StpUtil.checkLogin();
            StpUtil.logoutByTokenValue(tokenValue);
            return Result.success("logout success");
        }
        return Result.fail(HttpStatus.BAD_REQUEST.getCode(), "logout BAD_REQUEST");
    }

    /**
     * 注册
     *
     * @param userRegisterDto user
     */
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public Object register(@RequestBody UserRegisterDto userRegisterDto) {
        String username = userRegisterDto.getUsername();
        String password = userRegisterDto.getPassword();
        String passwordRepeat = userRegisterDto.getPasswordRepeat();
        List<String> usernames = userService.findAllUsername();
        if (!usernames.contains(username)) {
            if (passwordRepeat.equals(password)) {
                User user = new User();
                user.setUsername(username);
                user.setPassword(SaBase64Util.encode(password));
                userService.addUser(user);
                User user1 = userService.findByUsername(username);
                Long uid = user1.getId();
                Role role = roleService.findRoleByRoleName("user");
                Long rid = role.getId();
                UserRole userRole = new UserRole();
                userRole.setUid(uid);
                userRole.setRid(rid);
                userRoleService.addUserRole(userRole);
                return Result.success("register success");
            } else {
                return Result.fail(HttpStatus.BAD_REQUEST.getCode(), "The two passwords entered are inconsistent");
            }
        } else {
            return Result.fail(HttpStatus.BAD_REQUEST.getCode(), "username exists");
        }
    }

}
