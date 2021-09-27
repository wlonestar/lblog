package com.wjl.lblog.controller;

import com.wjl.lblog.model.entity.Timeline;
import com.wjl.lblog.service.intf.TimelineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 时间线
 *
 * @author: wjl
 * @date: 2021/9/16 15:00
 * @version: v1.0
 */
@RestController
@RequestMapping("/idea")
public class TimelineController {

    @Autowired
    private TimelineService TimelineService;

    /**
     * 分页查询动态
     *
     * @param page
     * @param size
     */
    @RequestMapping(method = RequestMethod.GET)
    public Page<Timeline> findAllByPage(
            @RequestParam(defaultValue = "1") int page, @RequestParam(defaultValue = "10") int size) {
        return TimelineService.findAllByPage(PageRequest.of(page - 1, size, Sort.Direction.DESC, "createTime"));
    }

    /**
     * 查询所有动态
     */
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Timeline> findAll() {
        return TimelineService.findAll();
    }

    /**
     * 根据 id 查询动态
     *
     * @param id
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Timeline findById(@PathVariable Long id) {
        return TimelineService.findById(id);
    }

    /**
     * 增加动态
     *
     * @param idea
     */
    @RequestMapping(method = RequestMethod.POST)
    public Timeline add(@RequestBody Timeline idea) {
        return TimelineService.add(idea);
    }

    /**
     * 更新动态
     *
     * @param id
     * @param idea
     */
    @RequestMapping(method = RequestMethod.PUT)
    public Timeline update(@RequestParam("id") Long id, @RequestBody Timeline idea) {
        return TimelineService.update(id, idea);
    }

    /**
     * 根据 id 删除动态
     *
     * @param id
     */
    @RequestMapping(method = RequestMethod.DELETE)
    public Long deleteById(@RequestParam("id") Long id) {
        return TimelineService.deleteById(id);
    }

    /**
     * 删除所有动态
     */
    @DeleteMapping("/delete")
    public void deleteAll() {
        TimelineService.deleteAll();
    }

}
