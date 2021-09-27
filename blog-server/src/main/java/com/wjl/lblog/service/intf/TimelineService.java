package com.wjl.lblog.service.intf;

import com.wjl.lblog.model.entity.Timeline;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @author: wjl
 * @date: 2021/9/16 14:58
 * @version: v1.0
 */
public interface TimelineService {

    /**
     * 分页查询
     */
    Page<Timeline> findAllByPage(Pageable pageable);

    /**
     * 查询所有
     */
    List<Timeline> findAll();

    /**
     * 根据 id 查询
     */
    Timeline findById(Long id);

    /**
     * 增加
     */
    Timeline add(Timeline idea);

    /**
     * 更新
     */
    Timeline update(Long id, Timeline idea);

    /**
     * 根据 id 删除
     */
    Long deleteById(Long id);

    /**
     * 删除所有
     */
    void deleteAll();

}
