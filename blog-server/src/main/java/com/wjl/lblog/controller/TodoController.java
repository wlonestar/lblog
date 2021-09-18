package com.wjl.lblog.controller;

import com.wjl.lblog.model.entity.Todo;
import com.wjl.lblog.service.intf.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 待办
 *
 * @author: wjl
 * @date: 2021/9/16 14:59
 * @version: v1.0
 */
@RestController
@RequestMapping("/todo")
public class TodoController {

    @Autowired
    private TodoService TodoService;

    /**
     * 分页查询待办
     *
     * @param page
     * @param size
     */
    @RequestMapping(method = RequestMethod.GET)
    public Page<Todo> findAllByPage(
            @RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "10") int size) {
        return TodoService.findAllByPage(PageRequest.of(page, size));
    }

    /**
     * 查询所有待办
     */
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Todo> findAll() {
        return TodoService.findAll();
    }

    /**
     * 根据 id 查询待办
     *
     * @param id
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Todo findById(@PathVariable Long id) {
        return TodoService.findById(id);
    }

    /**
     * 增加待办
     *
     * @param todo
     */
    @RequestMapping(method = RequestMethod.POST)
    public Todo add(@RequestBody Todo todo) {
        return TodoService.add(todo);
    }

    /**
     * 更新待办
     *
     * @param id
     * @param todo
     */
    @RequestMapping(method = RequestMethod.PUT)
    public Todo update(@RequestParam("id") Long id, @RequestBody Todo todo) {
        return TodoService.update(id, todo);
    }

    /**
     * 根据 id 删除待办
     *
     * @param id
     */
    @RequestMapping(method = RequestMethod.DELETE)
    public Long deleteById(@RequestParam("id") Long id) {
        return TodoService.deleteById(id);
    }

    /**
     * 删除所有待办
     */
    @DeleteMapping("/delete")
    public void deleteAll() {
        TodoService.deleteAll();
    }

}
