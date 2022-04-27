package com.wjl.lblog.controller;

import com.wjl.lblog.annotation.TimeLog;
import com.wjl.lblog.common.constants.MyResult;
import com.wjl.lblog.common.enums.MyHttpStatus;
import com.wjl.lblog.model.dto.UserDto;
import com.wjl.lblog.service.intf.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Objects;

/**
 * 用户接口
 *
 * @author: wjl
 * @date: 2021/9/15 16:56
 * @version: v1.0
 */
@Slf4j
@TimeLog
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    /**
     * 根据 id 获取用户信息
     *
     * @param id id
     */
    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public MyResult<?> getUserById(@RequestParam(name = "id") Long id) {
        var user = userService.selectVoById(id);
        if (!Objects.isNull(user)) {
            return MyResult.success(user);
        } else {
            return MyResult.fail(MyHttpStatus.QUERY_ERROR);
        }
    }

    /**
     * 添加用户
     *
     * @param userDto user
     */
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public MyResult<?> add(@RequestBody UserDto userDto) {
        var res = userService.add(userDto);
        if (res) {
            return MyResult.success();
        } else {
            return MyResult.fail(MyHttpStatus.INSERT_ERROR);
        }
    }

    /**
     * 更新用户信息
     *
     * @param userDto 用户信息
     */
    @RequestMapping(value = "/", method = RequestMethod.PUT)
    public MyResult<?> update(@RequestParam(name = "id") Long id,
                              @RequestBody UserDto userDto) {
        var res = userService.updateById(id, userDto);
        if (res) {
            return MyResult.success();
        } else {
            return MyResult.fail(MyHttpStatus.UPDATE_ERROR);
        }
    }

}
