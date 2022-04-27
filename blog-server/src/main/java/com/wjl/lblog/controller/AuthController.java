package com.wjl.lblog.controller;

import cn.dev33.satoken.secure.SaBase64Util;
import cn.dev33.satoken.stp.StpUtil;
import com.wjl.lblog.annotation.TimeLog;
import com.wjl.lblog.common.enums.MyHttpStatus;
import com.wjl.lblog.model.dto.UserAuthDto;
import com.wjl.lblog.model.dto.UserDto;
import com.wjl.lblog.model.entity.User;
import com.wjl.lblog.service.intf.UserService;
import com.wjl.lblog.common.constants.MyResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Objects;

/**
 * 认证接口
 *
 * @author: wjl
 * @date: 2021/9/15 16:41
 * @version: v1.0
 */
@Slf4j
@TimeLog
@RestController
@RequestMapping("/auth")
public class AuthController {

    @Resource
    private UserService userService;

    /**
     * 登录
     *
     * @param userAuthDto 用户信息
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public MyResult<?> login(@RequestBody UserAuthDto userAuthDto) {
        var username = userAuthDto.getUsername();
        var password = SaBase64Util.encode(userAuthDto.getPassword());
        var user = userService.selectByUsernameAndPassword(username, password);
        if (!Objects.isNull(user)) {
            StpUtil.login(username);
            user.setToken(StpUtil.getTokenValue());
            if (userService.updateById(user.getId(), user)) {
                return MyResult.success(StpUtil.getTokenInfo());
            } else {
                return MyResult.fail(MyHttpStatus.BAD_REQUEST.getCode(), "登录失败");
            }
        } else {
            return MyResult.fail(MyHttpStatus.BAD_REQUEST.getCode(), "登录失败");
        }
    }

    /**
     * 注册
     *
     * @param userDto user
     */
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public MyResult<?> register(@RequestBody UserAuthDto userDto) {
        var username = userDto.getUsername();
        var password = userDto.getPassword();
        var user = UserDto.builder()
                .username(username)
                .password(password)
                .build();
        var res = userService.add(user);
        if (res) {
            return MyResult.success(username);
        } else {
            return MyResult.fail(MyHttpStatus.INSERT_ERROR);
        }
    }

    /**
     * 验证是否登录
     *
     * @param uid username
     * @param satoken token
     */
    @RequestMapping(value = "/check", method = RequestMethod.GET)
    public MyResult<?> checkLogin(@RequestHeader(name = "satoken") String satoken,
                                  @RequestParam(name = "uid") Long uid) {
        if (!Objects.isNull(uid) && !Objects.isNull(satoken)) {
            if (StpUtil.isLogin()) {
                String loginId = StpUtil.getLoginIdAsString();
                User user = userService.selectByUsername(loginId);
                if (Objects.equals(user.getId(), uid) && user.getToken().equals(satoken)) {
                    return MyResult.success("已登录");
                } else {
                    return MyResult.fail(MyHttpStatus.BAD_REQUEST.getCode(), "token 已过期，请重新登录");
                }
            } else {
                return MyResult.fail(MyHttpStatus.BAD_REQUEST.getCode(), "尚未登录");
            }
        } else {
            return MyResult.fail(MyHttpStatus.BAD_REQUEST.getCode(), "发生异常");
        }
    }

    /**
     * 注销
     *
     * @param satoken token
     */
    @RequestMapping(value = "/logout", method = RequestMethod.POST)
    public MyResult<?> logout(@RequestHeader(name = "satoken") String satoken) {
        if (!Objects.isNull(satoken)) {
            StpUtil.checkLogin();
            StpUtil.logoutByTokenValue(satoken);
            return MyResult.success("logout success");
        }
        return MyResult.fail(MyHttpStatus.BAD_REQUEST.getCode(), "logout BAD_REQUEST");
    }

}
