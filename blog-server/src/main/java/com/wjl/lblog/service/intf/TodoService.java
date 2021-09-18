package com.wjl.lblog.service.intf;

import com.wjl.lblog.model.entity.Todo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @author: wjl
 * @date: 2021/9/16 14:45
 * @version: v1.0
 */
public interface TodoService {

    /**
     * 分页查询
     */
    Page<Todo> findAllByPage(Pageable pageable);

    /**
     * 查询所有
     */
    List<Todo> findAll();

    /**
     * 根据 id 查询
     */
    Todo findById(Long id);

    /**
     * 增加
     */
    Todo add(Todo todo);

    /**
     * 更新
     */
    Todo update(Long id, Todo todo);

    /**
     * 根据 id 删除
     */
    Long deleteById(Long id);

    /**
     * 删除所有
     */
    void deleteAll();

}
