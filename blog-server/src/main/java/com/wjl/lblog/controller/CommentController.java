package com.wjl.lblog.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wjl.lblog.common.constants.MyResult;
import com.wjl.lblog.common.enums.MyHttpStatus;
import com.wjl.lblog.model.entity.Comment;
import com.wjl.lblog.service.intf.CommentService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

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
    public MyResult<?> findAllByPage(
            @RequestParam(name = "page", defaultValue = "1") int page,
            @RequestParam(name = "size", defaultValue = "5") int size) {
        var res = commentService.findAllByPage(new Page<>(page, size));
        return MyResult.success(res);
    }

    /**
     * 查询所有留言
     */
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public MyResult<?> findAll() {
        var res = commentService.findAll();
        return MyResult.success(res);
    }

    /**
     * 根据 id 查询留言
     *
     * @param id id
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public MyResult<?> findById(@PathVariable(name = "id") Long id) {
        var res = commentService.findById(id);
        return MyResult.success(res);
    }

    /**
     * 增加留言
     *
     * @param comment comment
     */
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public MyResult<?> add(@RequestBody Comment comment) {
        var res = commentService.add(comment);
        if (res) {
            return MyResult.success();
        } else {
            return MyResult.fail(MyHttpStatus.BAD_REQUEST.getCode(), "增加留言失败");
        }
    }

    /**
     * 更新留言
     *
     * @param id id
     * @param comment comment
     */
    @RequestMapping(value = "/", method = RequestMethod.PUT)
    public MyResult<?> update(@RequestParam("id") Long id, @RequestBody Comment comment) {
        var res = commentService.update(id, comment);
        if (res) {
            return MyResult.success();
        } else {
            return MyResult.fail(MyHttpStatus.BAD_REQUEST.getCode(), "更新留言失败");
        }
    }

    /**
     * 根据 id 删除留言
     *
     * @param id id
     */
    @RequestMapping(value = "/", method = RequestMethod.DELETE)
    public MyResult<?> deleteById(@RequestParam("id") Long id) {
        var res = commentService.deleteById(id);
        if (res) {
            return MyResult.success();
        } else {
            return MyResult.fail(MyHttpStatus.BAD_REQUEST.getCode(), "删除留言失败");
        }
    }

}
