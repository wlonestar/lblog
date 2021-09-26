package com.wjl.lblog.service.intf;

import com.wjl.lblog.model.entity.Time;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @author: wjl
 * @date: 2021/9/16 14:58
 * @version: v1.0
 */
public interface TimeService {

    /**
     * 分页查询
     */
    Page<Time> findAllByPage(Pageable pageable);

    /**
     * 查询所有
     */
    List<Time> findAll();

    /**
     * 根据 id 查询
     */
    Time findById(Long id);

    /**
     * 增加
     */
    Time add(Time idea);

    /**
     * 更新
     */
    Time update(Long id, Time idea);

    /**
     * 根据 id 删除
     */
    Long deleteById(Long id);

    /**
     * 删除所有
     */
    void deleteAll();

}
