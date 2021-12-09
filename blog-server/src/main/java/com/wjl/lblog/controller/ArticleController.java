package com.wjl.lblog.controller;

import com.wjl.lblog.common.constants.Result;
import com.wjl.lblog.common.enums.HttpStatus;
import com.wjl.lblog.model.dto.ArticleDto;
import com.wjl.lblog.model.vo.ArticleDetailVo;
import com.wjl.lblog.model.vo.ArticleSummaryVo;
import com.wjl.lblog.model.vo.ArticleTitleVo;
import com.wjl.lblog.service.intf.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

/**
 * 文章接口
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
     * 查询所有文章摘要
     */
    @RequestMapping(value = "/all/summary", method = RequestMethod.GET)
    public List<ArticleSummaryVo> getAllSummary() {
        return articleService.findAllSummary();
    }

    /**
     * 查询所有文章详情
     */
    @RequestMapping(value = "/all/detail", method = RequestMethod.GET)
    public List<ArticleDetailVo> getAllDetail() {
        return articleService.findAllDetail();
    }

    /**
     * 查询所有文章
     */
    @RequestMapping(value = "/all/title", method = RequestMethod.GET)
    public List<ArticleTitleVo> getAllTitle() {
        return articleService.findAllTitle();
    }

    /**
     * 分页查询文章摘要
     *
     * @param page page
     * @param size size
     */
    @RequestMapping(value = "/all/page", method = RequestMethod.GET)
    public Page<ArticleSummaryVo> findAllByPage(
            @RequestParam(name = "page", defaultValue = "1") int page,
            @RequestParam(name = "size", defaultValue = "5") int size) {
        return articleService.findSummaryByPage(PageRequest.of(page - 1, size));
    }

    /**
     * 根据 id 查询文章
     *
     * @param id id
     */
    @RequestMapping(value = "/single/id", method = RequestMethod.GET)
    public Object getById(@RequestParam(name = "id") Long id) {
        ArticleDetailVo articleDetailVo = articleService.getById(id);
        if (!Objects.isNull(articleDetailVo)) {
            return articleDetailVo;
        } else {
            return Result.fail(HttpStatus.FAILED.getCode(), "can't find article by param");
        }
    }

    /**
     * 根据标题查询文章
     *
     * @param title title
     */
    @RequestMapping(value = "/single/title", method = RequestMethod.GET)
    public Object getByTitle(@RequestParam(name = "title") String title) {
        ArticleDetailVo articleDetailVo = articleService.getByTitle(title);
        if (!Objects.isNull(articleDetailVo)) {
            return articleDetailVo;
        } else {
            return Result.fail(HttpStatus.FAILED.getCode(), "can't find article by param");
        }
    }

    /**
     * 增加文章
     *
     * @param articleDto arrticle
     */
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public Object add(@RequestBody ArticleDto articleDto) {
        if (Objects.isNull(articleDto)) {
            return Result.fail(HttpStatus.FAILED.getCode(), "the input is null");
        }
        if (!Objects.isNull(articleService.findByTitle(articleDto.getTitle()))) {
            return Result.fail(HttpStatus.FAILED.getCode(), "the article title is same");
        }
        if (articleService.add(articleDto)) {
            return articleDto;
        } else {
            return Result.fail(HttpStatus.FAILED.getCode(), "can't add article");
        }
    }

    /**
     * 根据 id 更新文章
     *
     * @param id id
     * @param articleDto article
     */
    @RequestMapping(value = "/", method = RequestMethod.PUT)
    public ArticleDetailVo update(@RequestParam(name = "id") Long id, @RequestBody ArticleDto articleDto) {
        return null;
    }

    /**
     * 根据 id 删除文章
     *
     * @param id id
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Object deleteById(@PathVariable(name = "id") Long id) {
        if (articleService.deleteById(id)) {
            return id;
        } else {
            return Result.fail(HttpStatus.FAILED.getCode(), "delete failed");
        }
    }

}
