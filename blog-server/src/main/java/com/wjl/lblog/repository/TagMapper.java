package com.wjl.lblog.repository;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wjl.lblog.model.entity.Tag;
import org.springframework.stereotype.Repository;

/**
 * @author: wjl
 * @time: 2022/4/24 19:33
 * @version: 1.0
 */
@Repository
<<<<<<<< HEAD:blog-server/src/main/java/com/wjl/lblog/repository/TagMapper.java
public interface TagMapper extends BaseMapper<Tag> {
========
public interface RoleMapper extends BaseMapper<Role> {
>>>>>>>> 1a74263 (fix: add tag entity, remove number field):blog-server/src/main/java/com/wjl/lblog/repository/RoleMapper.java
}
