package com.wjl.lblog.service.impl;

import com.wjl.lblog.model.entity.Todo;
import com.wjl.lblog.repository.TodoRepository;
import com.wjl.lblog.service.intf.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

/**
 * @author: wjl
 * @date: 2021/9/16 14:46
 * @version: v1.0
 */
@Service
public class TodoServiceImpl implements TodoService {

    @Autowired
    private TodoRepository todoRepository;

    /**
     * 分页查询
     *
     * @param pageable
     */
    @Override
    public Page<Todo> findAllByPage(Pageable pageable) {
        return todoRepository.findAll(pageable);
    }

    /**
     * 查询所有
     */
    @Override
    public List<Todo> findAll() {
        return todoRepository.findAll();
    }

    /**
     * 根据 id 查询
     *
     * @param id
     */
    @Override
    public Todo findById(Long id) {
        Todo todo = todoRepository.findById(id).orElseThrow();
        if (!Objects.isNull(todo)) {
            return todo;
        } else {
            return null;
        }
    }

    /**
     * 增加
     *
     * @param todo
     */
    @Override
    public Todo add(Todo todo) {
        return todoRepository.save(todo);
    }

    /**
     * 更新
     *
     * @param id
     * @param todo
     */
    @Override
    public Todo update(Long id, Todo todo) {
        Todo todo1 = todoRepository.findById(id).orElseThrow();
        if (!Objects.isNull(todo1)) {
            todo1.setContent(todo.getContent());
            todo1.setState(todo.getState());
            todoRepository.save(todo1);
            return todo1;
        } else {
            return null;
        }
    }

    /**
     * 根据 id 删除
     *
     * @param id
     */
    @Override
    public Long deleteById(Long id) {
        Todo todo = todoRepository.findById(id).orElseThrow();
        if (!Objects.isNull(todo)) {
            todoRepository.deleteById(id);
            return id;
        } else {
            return null;
        }
    }

    /**
     * 删除所有
     */
    @Override
    public void deleteAll() {
        todoRepository.deleteAll();
    }
}
