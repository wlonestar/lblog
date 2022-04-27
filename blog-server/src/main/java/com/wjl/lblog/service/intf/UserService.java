package com.wjl.lblog.service.intf;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wjl.lblog.model.dto.UserDto;
import com.wjl.lblog.model.entity.User;
import com.wjl.lblog.model.vo.UserVo;

import java.util.List;

/**
 * @author: wjl
 * @date: 2021/9/15 16:34
 * @version: v1.0
 */
public interface UserService extends IService<User> {

    List<User> selectAll();

    List<String> selectAllUsername();

    User selectById(Long id);

    UserVo selectVoById(Long id);

    User selectByUsername(String username);

    User selectByUsernameAndPassword(String username, String password);

    boolean add(UserDto userDto);

    boolean updateById(Long id, UserDto userDto);

    boolean updateById(Long id, User user);

    boolean deleteById(Long id);

}
