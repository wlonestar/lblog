package com.wjl.lblog.repository;

import com.wjl.lblog.model.entity.Link;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author: wjl
 * @date: 2021/9/27 10:53
 * @version: v1.0
 */
@Repository
public interface LinkRepository extends JpaRepository<Link, Long> {
}
