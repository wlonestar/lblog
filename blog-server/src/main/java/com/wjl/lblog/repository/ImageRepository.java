package com.wjl.lblog.repository;

import com.wjl.lblog.model.entity.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author: wjl
 * @date: 2021/9/18 22:30
 * @version: v1.0
 */
@Repository
public interface ImageRepository extends JpaRepository<Image, Long> {
}
