package com.wjl.lblog.controller;

import com.wjl.lblog.model.entity.Idea;
import com.wjl.lblog.service.intf.IdeaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 动态
 *
 * @author: wjl
 * @date: 2021/9/16 15:00
 * @version: v1.0
 */
@RestController
@RequestMapping("/idea")
public class IdeaController {

    @Autowired
    private IdeaService IdeaService;

    /**
     * 分页查询动态
     *
     * @param page
     * @param size
     */
    @RequestMapping(method = RequestMethod.GET)
    public Page<Idea> findAllByPage(
            @RequestParam(defaultValue = "1") int page, @RequestParam(defaultValue = "10") int size) {
        return IdeaService.findAllByPage(PageRequest.of(page - 1, size));
    }

    /**
     * 查询所有动态
     */
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Idea> findAll() {
        return IdeaService.findAll();
    }

    /**
     * 根据 id 查询动态
     *
     * @param id
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Idea findById(@PathVariable Long id) {
        return IdeaService.findById(id);
    }

    /**
     * 增加动态
     *
     * @param idea
     */
    @RequestMapping(method = RequestMethod.POST)
    public Idea add(@RequestBody Idea idea) {
        return IdeaService.add(idea);
    }

    /**
     * 更新动态
     *
     * @param id
     * @param idea
     */
    @RequestMapping(method = RequestMethod.PUT)
    public Idea update(@RequestParam("id") Long id, @RequestBody Idea idea) {
        return IdeaService.update(id, idea);
    }

    /**
     * 根据 id 删除动态
     *
     * @param id
     */
    @RequestMapping(method = RequestMethod.DELETE)
    public Long deleteById(@RequestParam("id") Long id) {
        return IdeaService.deleteById(id);
    }

    /**
     * 删除所有动态
     */
    @DeleteMapping("/delete")
    public void deleteAll() {
        IdeaService.deleteAll();
    }

}
