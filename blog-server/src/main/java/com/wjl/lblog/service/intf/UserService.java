package com.wjl.lblog.service.intf;

import com.wjl.lblog.model.entity.User;

/**
 * @author: wjl
 * @date: 2021/9/15 16:34
 * @version: v1.0
 */
public interface UserService {

    /**
     * 通过用户名查找用户
     */
    User findByUsername(String username);

    /**
     * 通过 id 查找用户
     */
    User findById(Long id);

    /**
     * 添加用户
     */
    User add(User user);

    /**
     * 更新
     */
    User update(Long id, User user);

}
