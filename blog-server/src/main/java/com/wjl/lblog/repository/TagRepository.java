package com.wjl.lblog.repository;

import com.wjl.lblog.model.entity.Tag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author: wjl
 * @date: 2021/12/8 20:28
 * @version: v1.0
 */
@Repository
public interface TagRepository extends JpaRepository<Tag, Long> {

    Tag findTagById(Long id);

    Tag findTagByName(String name);

}
