package com.wjl.lblog.controller;

import com.wjl.lblog.common.constants.Result;
import com.wjl.lblog.common.enums.HttpStatus;
import com.wjl.lblog.model.entity.Tag;
import com.wjl.lblog.model.vo.TagArticleVo;
import com.wjl.lblog.service.intf.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

/**
 * 标签接口
 *
 * @author: wjl
 * @date: 2021/12/8 19:09
 * @version: v1.0
 */
@RestController
@RequestMapping("/tag")
public class TagController {

    @Autowired
    private TagService tagService;

    /**
     * 查询所有标签
     */
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Tag> findAll() {
        return tagService.findAll();
    }

    /**
     * 分页查询所有标签
     *
     * @param page page
     * @param size size
     */
    @RequestMapping(value = "/page", method = RequestMethod.GET)
    public Page<Tag> findAllByPage(
            @RequestParam(name = "page", defaultValue = "1") int page,
            @RequestParam(name = "size",defaultValue = "5") int size) {
        return tagService.findAllByPage(PageRequest.of(page - 1, size));
    }

    /**
     * 分页查询标签下所有文章
     *
     * @param id id
     * @param page page
     * @param size size
     */
    @RequestMapping(value = "/article", method = RequestMethod.GET)
    public Object findAllByPage(
            @RequestParam(name = "id") Long id,
            @RequestParam(name = "page", defaultValue = "1") int page,
            @RequestParam(name = "size", defaultValue = "5") int size) {
        Tag tag = tagService.findById(id);
        if (!Objects.isNull(tag)) {
            return tagService.findTagById(id, PageRequest.of(page - 1, size));
        } else {
            return Result.fail(HttpStatus.FAILED.getCode(), "can't get the tag");
        }
    }

    /**
     * 根据 id 查询标签
     *
     * @param id id
     */
    @RequestMapping(value = "/id", method = RequestMethod.GET)
    public Object findTagById(@RequestParam(name = "id") Long id) {
        Tag tag = tagService.findById(id);
        if (!Objects.isNull(tag)) {
            return tag;
        } else {
            return Result.fail(HttpStatus.FAILED.getCode(), "can't find tag");
        }
    }

    /**
     * 根据标签名查询标签
     *
     * @param name name
     */
    @RequestMapping(value = "/name", method = RequestMethod.GET)
    public Object findTagByName(@RequestParam(name = "name") String name) {
        Tag tag = tagService.findByName(name);
        if (!Objects.isNull(tag)) {
            return tag;
        } else {
            return Result.fail(HttpStatus.FAILED.getCode(), "can't find tag");
        }
    }


    /**
     * 添加标签
     *
     * @param tag tag
     */
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public Object add(@RequestBody Tag tag) {
        if (tagService.add(tag)) {
            return tag;
        } else {
            return Result.fail(HttpStatus.FAILED.getCode(), "can't add tag");
        }
    }

    /**
     * 根据 id 更新标签
     *
     * @param id id
     * @param tag tag
     */
    @RequestMapping(value = "/", method = RequestMethod.PUT)
    public Object update(@RequestParam(name = "id") Long id, @RequestBody Tag tag) {
        if (tagService.update(id, tag)) {
            return tag;
        } else {
            return Result.fail(HttpStatus.FAILED.getCode(), "can't update tag");
        }
    }

    /**
     * 根据 id 删除标签
     *
     * @param id id
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Object deleteById(@PathVariable("id") Long id) {
        if (tagService.deleteById(id)) {
            return id;
        } else {
            return Result.fail(HttpStatus.FAILED.getCode(), "can't delete the tag");
        }
    }

}
