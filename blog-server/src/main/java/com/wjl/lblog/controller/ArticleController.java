package com.wjl.lblog.controller;

import com.wjl.lblog.model.dto.ArticleDto;
import com.wjl.lblog.model.dto.ArticleSummaryDto;
import com.wjl.lblog.model.entity.Article;
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
     * 分页查询文章摘要
     *
     * @param page page
     * @param size size
     */
    @RequestMapping(value = "/page", method = RequestMethod.GET)
    public Page<ArticleSummaryDto> findAllByPage(@RequestParam(defaultValue = "1") int page,
                                                 @RequestParam(defaultValue = "10") int size) {
        return articleService.findAllByPage(PageRequest.of(page - 1, size));
    }

    /**
     * 查询所有文章摘要
     */
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<ArticleSummaryDto> getAll() {
        return articleService.findAllArticleSummary();
    }

    /**
     * 根据 id 查询文章
     *
     * @param id id
     */
    @RequestMapping(value = "/id", method = RequestMethod.GET)
    public ArticleDto getById(@RequestParam Long id) {
        return articleService.findById(id);
    }

    /**
     * 根据标题查询文章
     *
     * @param title title
     */
    @RequestMapping(value = "/title", method = RequestMethod.GET)
    public ArticleDto getByTitle(@RequestParam String title) {
        return articleService.findByTitle(title);
    }

    /**
     * 增加文章
     *
     * @param articleDto
     */
    @RequestMapping(method = RequestMethod.POST)
    public ArticleDto add(@RequestBody ArticleDto articleDto) {
        return articleService.add(articleDto);
    }

    /**
     * 根据 id 更新文章
     *
     * @param id
     * @param articleDto
     */
    @RequestMapping(method = RequestMethod.PUT)
    public ArticleDto update(@RequestParam("id") Long id, @RequestBody ArticleDto articleDto) {
        return articleService.update(id, articleDto);
    }

    /**
     * 根据 id 删除文章
     *
     * @param id
     */
    @RequestMapping(method = RequestMethod.DELETE)
    public Article deleteById(@RequestParam("id") Long id) {
        return articleService.deleteById(id);
    }

}
