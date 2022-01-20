package com.wjl.lblog.repository;

import com.wjl.lblog.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author: wjl
 * @date: 2021/9/15 16:33
 * @version: v1.0
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findUserById(Long id);

    User findUserByUsername(String username);

    User findUserByUsernameAndPassword(String username, String password);

}
