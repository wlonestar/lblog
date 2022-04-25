package com.wjl.lblog.repository;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wjl.lblog.model.entity.User;
import org.springframework.stereotype.Repository;

/**
 * @author: wjl
 * @date: 2021/9/15 16:33
 * @version: v1.0
 */
@Repository
public interface UserMapper extends BaseMapper<User> {
}
