package com.wjl.lblog.repository;

import com.wjl.lblog.model.entity.RolePermission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author: wjl
 * @date: 2021/12/8 20:30
 * @version: v1.0
 */
@Repository
public interface RolePermissionRepository extends JpaRepository<RolePermission, Long> {

    List<RolePermission> findAllByRid(Long rid);

}
