package com.wjl.lblog.repository;

import com.wjl.lblog.model.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author: wjl
 * @date: 2021/12/8 20:29
 * @version: v1.0
 */
@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findRoleById(Long id);

    Role findRoleByRole(String role);

}
