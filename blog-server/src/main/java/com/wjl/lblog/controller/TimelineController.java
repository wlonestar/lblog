package com.wjl.lblog.controller;

import com.wjl.lblog.model.entity.Timeline;
import com.wjl.lblog.service.intf.TimelineService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
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
    public Page<Timeline> findAllByPage(
            @RequestParam(name = "page", defaultValue = "1") int page,
            @RequestParam(name = "size", defaultValue = "10") int size) {
        return TimelineService.findAllByPage(
                PageRequest.of(page - 1, size, Sort.Direction.DESC, "createTime"));
    }

    /**
     * 查询所有时间线
     */
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Timeline> findAll() {
        return TimelineService.findAll();
    }

    /**
     * 根据 id 查询时间线
     *
     * @param id id
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Timeline findById(@PathVariable(name = "id") Long id) {
        return TimelineService.findById(id);
    }

    /**
     * 增加时间线
     *
     * @param idea 时间线
     */
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public Timeline add(@RequestBody Timeline idea) {
        return TimelineService.add(idea);
    }

    /**
     * 更新时间线
     *
     * @param id id
     * @param idea 时间线
     */
    @RequestMapping(value = "/", method = RequestMethod.PUT)
    public Timeline update(@RequestParam(name = "id") Long id, @RequestBody Timeline idea) {
        return TimelineService.update(id, idea);
    }

    /**
     * 根据 id 删除时间线
     *
     * @param id id
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Long deleteById(@PathVariable(name = "id") Long id) {
        return TimelineService.deleteById(id);
    }

    /**
     * 删除所有时间线
     */
    @RequestMapping(value = "/", method = RequestMethod.DELETE)
    public void deleteAll() {
        TimelineService.deleteAll();
    }

}
