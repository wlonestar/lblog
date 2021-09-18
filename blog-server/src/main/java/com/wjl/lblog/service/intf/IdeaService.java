package com.wjl.lblog.service.intf;

import com.wjl.lblog.model.entity.Idea;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @author: wjl
 * @date: 2021/9/16 14:58
 * @version: v1.0
 */
public interface IdeaService {

    /**
     * 分页查询
     */
    Page<Idea> findAllByPage(Pageable pageable);

    /**
     * 查询所有
     */
    List<Idea> findAll();

    /**
     * 根据 id 查询
     */
    Idea findById(Long id);

    /**
     * 增加
     */
    Idea add(Idea idea);

    /**
     * 更新
     */
    Idea update(Long id, Idea idea);

    /**
     * 根据 id 删除
     */
    Long deleteById(Long id);

    /**
     * 删除所有
     */
    void deleteAll();

}
