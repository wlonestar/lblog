package com.wjl.lblog.controller;

import com.wjl.lblog.annotation.TimeLog;
import com.wjl.lblog.common.constants.MyResult;
import com.wjl.lblog.service.intf.TagService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

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
        var res = "";
        return MyResult.success(res);
    }

    /**
     * 查询所有标签实体
     *
     * @return res
     */
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public MyResult<?> findAll() {
        var res = "";
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
        var res = "";
        return MyResult.success(res);
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
        var res = "";
        return MyResult.success(res);
    }

    /**
     * 根据 id 查询标签实体
     *
     * @param id id
     * @return res
     */
    @RequestMapping(value = "/id", method = RequestMethod.GET)
    public MyResult<?> getById(@RequestParam(name = "id") Long id) {
        var res = "";
        return MyResult.success(res);
    }

    /**
     * 根据名称查询标签实体
     *
     * @param name name
     * @return res
     */
    @RequestMapping(value = "/name", method = RequestMethod.GET)
    public MyResult<?> getByName(@RequestParam(name = "name") String name) {
        var res = "";
        return MyResult.success(res);
    }

    /**
     * 增加标签
     *
     * @param name name
     * @return res
     */
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public MyResult<?> add(@RequestBody String name) {
        var res = "";
        return MyResult.success(res);
    }

    /**
     * 根据 id 删除标签
     * @param id id
     * @return res
     */
    @RequestMapping(value = "/", method = RequestMethod.DELETE)
    public MyResult<?> deleteById(@RequestParam(name = "id") Long id) {
        var res = "";
        return MyResult.success(res);
    }

}
