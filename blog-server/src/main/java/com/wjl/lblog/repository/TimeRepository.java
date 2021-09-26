package com.wjl.lblog.repository;

import com.wjl.lblog.model.entity.Time;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author: wjl
 * @date: 2021/9/16 14:57
 * @version: v1.0
 */
@Repository
public interface TimeRepository extends JpaRepository<Time, Long> {

    Page<Time> findAll(Pageable pageable);

}
