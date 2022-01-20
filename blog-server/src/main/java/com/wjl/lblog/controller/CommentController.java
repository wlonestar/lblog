package com.wjl.lblog.controller;

import com.wjl.lblog.model.entity.Comment;
import com.wjl.lblog.service.intf.CommentService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 留言接口
 *
 * @author: wjl
 * @date: 2021/9/13 22:53
 * @version: v1.0
 */
@RestController
@RequestMapping("/comment")
public class CommentController {

    @Resource
    private CommentService commentService;

    /**
     * 分页查询留言
     *
     * @param page page
     * @param size size
     */
    @RequestMapping(value = "/page", method = RequestMethod.GET)
    public Page<Comment> findAllByPage(
            @RequestParam(name = "page", defaultValue = "1") int page,
            @RequestParam(name = "size", defaultValue = "5") int size) {
        return commentService.findAllByPage(
                PageRequest.of(page - 1, size, Sort.Direction.DESC, "createTime"));
    }

    /**
     * 查询所有留言
     */
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Comment> findAll() {
        return commentService.findAll();
    }

    /**
     * 根据 id 查询留言
     *
     * @param id id
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Comment findById(@PathVariable(name = "id") Long id) {
        return commentService.findById(id);
    }

    /**
     * 增加留言
     *
     * @param comment comment
     */
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public Comment add(@RequestBody Comment comment) {
        return commentService.add(comment);
    }

    /**
     * 更新留言
     *
     * @param id id
     * @param comment comment
     */
    @RequestMapping(value = "/", method = RequestMethod.PUT)
    public Comment update(@RequestParam("id") Long id, @RequestBody Comment comment) {
        return commentService.update(id, comment);
    }

    /**
     * 根据 id 删除留言
     *
     * @param id id
     */
    @RequestMapping(value = "/", method = RequestMethod.DELETE)
    public Long deleteById(@RequestParam("id") Long id) {
        return commentService.deleteById(id);
    }

    /**
     * 删除所有留言
     */
    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    public void deleteAll() {
        commentService.deleteAll();
    }

}
