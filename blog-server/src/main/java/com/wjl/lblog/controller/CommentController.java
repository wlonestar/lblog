package com.wjl.lblog.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wjl.lblog.annotation.TimeLog;
import com.wjl.lblog.common.constants.MyResult;
import com.wjl.lblog.common.enums.MyHttpStatus;
import com.wjl.lblog.model.dto.CommentDto;
import com.wjl.lblog.service.intf.CommentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Objects;

/**
 * 留言接口
 *
 * @author: wjl
 * @date: 2021/9/13 22:53
 * @version: v1.0
 */
@Slf4j
@TimeLog
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
    public MyResult<?> findAllByPage(@RequestParam(name = "page", defaultValue = "1") int page,
                                     @RequestParam(name = "size", defaultValue = "5") int size) {
        var res = commentService.selectAllByPage(new Page<>(page, size));
        return MyResult.success(res);
    }

    /**
     * 查询所有留言
     */
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public MyResult<?> findAll() {
        var res = commentService.selectAll();
        return MyResult.success(res);
    }

    /**
     * 根据 id 查询留言
     *
     * @param id id
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public MyResult<?> findById(@RequestParam(name = "id") Long id) {
        var res = commentService.selectById(id);
        return MyResult.success(res);
    }

    /**
     * 增加留言
     *
     * @param commentDto comment
     */
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public MyResult<?> add(@RequestBody CommentDto commentDto) {
        if (!Objects.isNull(commentDto)) {
            var res = commentService.add(commentDto);
            if (res) {
                return MyResult.success();
            } else {
                return MyResult.fail(MyHttpStatus.INSERT_ERROR);
            }
        } else {
            return MyResult.fail(MyHttpStatus.BAD_REQUEST);
        }
    }

    /**
     * 根据 id 删除留言
     *
     * @param id id
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public MyResult<?> deleteById(@PathVariable("id") Long id) {
        var res = commentService.deleteById(id);
        if (res) {
            return MyResult.success();
        } else {
            return MyResult.fail(MyHttpStatus.DELETE_ERROR);
        }
    }

}
