package com.wjl.lblog.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wjl.lblog.common.constants.MyResult;
import com.wjl.lblog.common.enums.MyHttpStatus;
import com.wjl.lblog.model.entity.Timeline;
import com.wjl.lblog.service.intf.TimelineService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 时间线接口
 *
 * @author: wjl
 * @date: 2021/9/16 15:00
 * @version: v1.0
 */
@RestController
@RequestMapping("/idea")
public class TimelineController {

    @Resource
    private TimelineService TimelineService;

    /**
     * 分页查询时间线
     *
     * @param page 页数
     * @param size 数量
     */
    @RequestMapping(value = "/page", method = RequestMethod.GET)
    public MyResult<?> findAllByPage(@RequestParam(name = "page", defaultValue = "1") int page,
                                     @RequestParam(name = "size", defaultValue = "10") int size) {
        var res = TimelineService.findAllByPage(new Page<>(page, size));
        return MyResult.success(res);
    }

    /**
     * 查询所有时间线
     */
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public MyResult<?> findAll() {
        var res = TimelineService.findAll();
        return MyResult.success(res);
    }

    /**
     * 根据 id 查询时间线
     *
     * @param id id
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public MyResult<?> findById(@PathVariable(name = "id") Long id) {
        var res = TimelineService.findById(id);
        return MyResult.success(res);
    }

    /**
     * 增加时间线
     *
     * @param idea 时间线
     */
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public MyResult<?> add(@RequestBody Timeline idea) {
        var res = TimelineService.add(idea);
        if (res) {
            return MyResult.success();
        } else {
            return MyResult.fail(MyHttpStatus.BAD_REQUEST.getCode(), "增加失败");
        }
    }

    /**
     * 更新时间线
     *
     * @param id id
     * @param idea 时间线
     */
    @RequestMapping(value = "/", method = RequestMethod.PUT)
    public MyResult<?> update(@RequestParam(name = "id") Long id,
                              @RequestBody Timeline idea) {
        var res = TimelineService.update(id, idea);
        if (res) {
            return MyResult.success();
        } else {
            return MyResult.fail(MyHttpStatus.BAD_REQUEST.getCode(), "更新失败");
        }
    }

    /**
     * 根据 id 删除时间线
     *
     * @param id id
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public MyResult<?> deleteById(@PathVariable(name = "id") Long id) {
        var res = TimelineService.deleteById(id);
        if (res) {
            return MyResult.success();
        } else {
            return MyResult.fail(MyHttpStatus.BAD_REQUEST.getCode(), "删除失败");
        }
    }

}
