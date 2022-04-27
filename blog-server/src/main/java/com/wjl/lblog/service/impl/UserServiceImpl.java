package com.wjl.lblog.service.impl;

import cn.dev33.satoken.secure.SaBase64Util;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wjl.lblog.model.dto.UserDto;
import com.wjl.lblog.model.entity.User;
import com.wjl.lblog.model.vo.UserVo;
import com.wjl.lblog.repository.UserMapper;
import com.wjl.lblog.service.intf.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author: wjl
 * @date: 2021/9/15 16:44
 * @version: v1.0
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
        implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> selectAll() {
        var wrapper = new LambdaQueryWrapper<User>();
        return userMapper.selectList(wrapper);
    }

    @Override
    public List<String> selectAllUsername() {
        var users = selectAll();
        var usernames = new ArrayList<String>();
        for (User user : users) {
            String username = user.getUsername();
            usernames.add(username);
        }
        return usernames;
    }

    @Override
    public User selectById(Long id) {
        var user = userMapper.selectById(id);
        if (!Objects.isNull(user)) {
            return user;
        } else {
            return null;
        }
    }

    @Override
    public UserVo selectVoById(Long id) {
        var user = selectById(id);
        if (!Objects.isNull(user)) {
            return UserVo.builder()
                    .username(user.getUsername())
                    .avatar(user.getAvatar())
                    .age(user.getAge())
                    .gender(user.getGender())
                    .location(user.getLocation())
                    .signature(user.getSignature())
                    .profile(user.getProfile())
                    .build();
        } else {
            return null;
        }
    }

    @Override
    public User selectByUsername(String username) {
        var wrapper = new LambdaQueryWrapper<User>();
        wrapper.eq(User::getUsername, username);
        var user = userMapper.selectOne(wrapper);
        if (!Objects.isNull(user)) {
            return user;
        } else {
            return null;
        }
    }

    @Override
    public User selectByUsernameAndPassword(String username, String password) {
        var wrapper = new LambdaQueryWrapper<User>();
        wrapper.eq(User::getUsername, username).eq(User::getPassword, password);
        var user = userMapper.selectOne(wrapper);
        if (!Objects.isNull(user)) {
            return user;
        } else {
            return null;
        }
    }

    @Override
    public boolean add(UserDto userDto) {
        if (!Objects.isNull(userDto)) {
            if (selectAllUsername().contains(userDto.getUsername())) {
                return false;
            } else {
                var user = User.builder()
                        .username(userDto.getUsername())
                        .password(SaBase64Util.encode(userDto.getPassword()))
                        .avatar(userDto.getAvatar())
                        .age(userDto.getAge())
                        .gender(userDto.getGender())
                        .location(userDto.getLocation())
                        .signature(userDto.getSignature())
                        .profile(userDto.getProfile())
                        .build();
                var res = userMapper.insert(user);
                return res == 1;
            }
        }
        return false;
    }

    @Override
    public boolean updateById(Long id, UserDto userDto) {
        var user = selectById(id);
        if (!Objects.isNull(user)) {
            if (!Objects.isNull(userDto)) {
                var token = user.getToken();
                user = User.builder()
                        .id(id)
                        .username(userDto.getUsername())
                        .password(SaBase64Util.encode(userDto.getPassword()))
                        .token(token)
                        .avatar(userDto.getAvatar())
                        .age(userDto.getAge())
                        .gender(userDto.getGender())
                        .location(userDto.getLocation())
                        .signature(userDto.getSignature())
                        .profile(userDto.getProfile())
                        .build();
                var res = userMapper.updateById(user);
                return res == 1;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @Override
    public boolean updateById(Long id, User user) {
        var newUser = selectById(id);
        if (!Objects.isNull(newUser)) {
            newUser = user;
            var res = userMapper.updateById(newUser);
            return res == 1;
        }
        return false;
    }

    @Override
    public boolean deleteById(Long id) {
        if (!Objects.isNull(userMapper.selectById(id))) {
            var res = userMapper.deleteById(id);
            return res == 1;
        } else {
            return false;
        }
    }

}
