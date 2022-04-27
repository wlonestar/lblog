package com.wjl.lblog.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wjl.lblog.annotation.TimeLog;
import com.wjl.lblog.common.constants.MyResult;
import com.wjl.lblog.common.enums.MyHttpStatus;
import com.wjl.lblog.service.intf.TagService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Objects;

/**
 * 标签接口
 *
 * @author: wjl
 * @time: 2022/4/24 19:36
 * @version: 1.0
 */
@Slf4j
@TimeLog
@RestController
@RequestMapping(path = "/tag")
public class TagController {

    @Resource
    private TagService tagService;

    /**
     * 分页查询标签实体
     *
     * @param page page
     * @param size size
     * @return res
     */
    @RequestMapping(value = "/page", method = RequestMethod.GET)
    public MyResult<?> findAllByPage(@RequestParam(name = "page", defaultValue = "1") int page,
                                     @RequestParam(name = "size", defaultValue = "5") int size) {
        var res = tagService.selectByPage(new Page<>(page, size));
        return MyResult.success(res);
    }

    /**
     * 查询所有标签实体
     *
     * @return res
     */
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public MyResult<?> findAll() {
        var res = tagService.selectAll();
        return MyResult.success(res);
    }

    /**
     * 分页查询某标签下文章
     *
     * @param id id
     * @param page page
     * @param size size
     * @return res
     */
    @RequestMapping(value = "/article/id", method = RequestMethod.GET)
    public MyResult<?> findTagById(@RequestParam(name = "id") Long id,
                                   @RequestParam(name = "page", defaultValue = "1") int page,
                                   @RequestParam(name = "size", defaultValue = "5") int size) {
        var tag = tagService.selectById(id);
        if (!Objects.isNull(tag)) {
            var res = tagService.selectByTagId(id, new Page<>(page, size));
            return MyResult.success(res);
        } else {
            return MyResult.fail(MyHttpStatus.QUERY_ERROR);
        }
    }

    /**
     * 分页查询某标签下文章
     *
     * @param name name
     * @param page page
     * @param size size
     * @return res
     */
    @RequestMapping(value = "/article/name", method = RequestMethod.GET)
    public MyResult<?> findTagByName(@RequestParam(name = "name") String name,
                                     @RequestParam(name = "page", defaultValue = "1") int page,
                                     @RequestParam(name = "size", defaultValue = "5") int size) {
        var tag = tagService.selectByName(name);
        if (!Objects.isNull(tag)) {
            var res = tagService.selectByTagName(name, new Page<>(page, size));
            return MyResult.success(res);
        } else {
            return MyResult.fail(MyHttpStatus.QUERY_ERROR);
        }
    }

    /**
     * 根据 id 查询标签实体
     *
     * @param id id
     * @return res
     */
    @RequestMapping(value = "/id", method = RequestMethod.GET)
    public MyResult<?> getById(@RequestParam(name = "id") Long id) {
        var res = tagService.selectById(id);
        if (!Objects.isNull(res)) {
            return MyResult.success(res);
        } else {
            return MyResult.fail(MyHttpStatus.QUERY_ERROR);
        }
    }

    /**
     * 根据名称查询标签实体
     *
     * @param name name
     * @return res
     */
    @RequestMapping(value = "/name", method = RequestMethod.GET)
    public MyResult<?> getByName(@RequestParam(name = "name") String name) {
        var res = tagService.selectByName(name);
        if (!Objects.isNull(res)) {
            return MyResult.success(res);
        } else {
            return MyResult.fail(MyHttpStatus.QUERY_ERROR);
        }
    }

    /**
     * 增加标签
     *
     * @param name name
     * @return res
     */
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public MyResult<?> add(@RequestBody String name) {
        var res = tagService.add(name);
        if (res) {
            return MyResult.success();
        } else {
            return MyResult.fail(MyHttpStatus.INSERT_ERROR);
        }
    }

    /**
     * 根据 id 删除标签
     * @param id id
     * @return res
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public MyResult<?> deleteById(@PathVariable(name = "id") Long id) {
        var res = tagService.removeById(id);
        if (res) {
            return MyResult.success();
        } else {
            return MyResult.fail(MyHttpStatus.DELETE_ERROR);
        }
    }

}
