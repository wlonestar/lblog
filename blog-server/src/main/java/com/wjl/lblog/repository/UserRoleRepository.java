package com.wjl.lblog.repository;

import com.wjl.lblog.model.entity.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author: wjl
 * @date: 2021/12/8 20:30
 * @version: v1.0
 */
@Repository
public interface UserRoleRepository extends JpaRepository<UserRole, Long> {

    List<UserRole> findAllByUid(Long uid);

    UserRole findUserRoleByUid(Long uid);

}
