package com.wjl.lblog.controller;

import com.wjl.lblog.model.entity.Article;
import com.wjl.lblog.model.vo.ArticleVo;
import com.wjl.lblog.service.intf.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 文章
 *
 * @author: wjl
 * @date: 2021/9/13 22:16
 * @version: v1.0
 */
@RestController
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    /**
     * 分页查询文章
     *
     * @param page
     * @param size
     */
    @RequestMapping(method = RequestMethod.GET)
    public Page<ArticleVo> findAllByPage(
            @RequestParam(defaultValue = "1") int page, @RequestParam(defaultValue = "10") int size) {
        return articleService.findAllByPage(PageRequest.of(page - 1, size, Sort.Direction.DESC, "createTime"));
    }

    /**
     * 查询所有文章
     */
    @RequestMapping(method = RequestMethod.GET, value = "/all")
    public List<ArticleVo> getAll() {
        return articleService.findAll();
    }

    /**
     * 根据 id 查询文章
     *
     * @param id
     */
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public ArticleVo get(@PathVariable Long id) {
        return articleService.findById(id);
    }

    /**
     * 根据标题查询文章
     *
     * @param title
     */
    @RequestMapping(method = RequestMethod.GET, value = "/p")
    public ArticleVo get(@RequestParam String title) {
        return articleService.findByTitle(title);
    }

    /**
     * 增加文章
     *
     * @param articleVo
     */
    @RequestMapping(method = RequestMethod.POST)
    public ArticleVo add(@RequestBody ArticleVo articleVo) {
        return articleService.add(articleVo);
    }

    /**
     * 根据 id 更新文章
     *
     * @param id
     * @param articleVo
     */
    @RequestMapping(method = RequestMethod.PUT)
    public ArticleVo update(@RequestParam("id") Long id, @RequestBody ArticleVo articleVo) {
        return articleService.update(id, articleVo);
    }

    /**
     * 根据 id 删除文章
     *
     * @param id
     */
    @RequestMapping(method = RequestMethod.DELETE)
    public Long deleteById(@RequestParam("id") Long id) {
        return articleService.deleteById(id);
    }

}
