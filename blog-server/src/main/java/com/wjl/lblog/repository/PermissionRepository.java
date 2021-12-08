package com.wjl.lblog.repository;

import com.wjl.lblog.model.entity.Permission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author: wjl
 * @date: 2021/12/8 20:29
 * @version: v1.0
 */
@Repository
public interface PermissionRepository extends JpaRepository<Permission, Long> {

    Permission findPermissionById(Long id);

    Permission findPermissionByPermission(String permission);

}
