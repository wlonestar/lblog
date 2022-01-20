package com.wjl.lblog.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wjl.lblog.common.constants.Result;
import com.wjl.lblog.common.enums.HttpStatus;
import com.wjl.lblog.model.dto.ArticleDto;
import com.wjl.lblog.model.entity.Article;
import com.wjl.lblog.model.vo.ArticleDetailVo;
import com.wjl.lblog.model.vo.ArticleSummaryVo;
import com.wjl.lblog.model.vo.ArticleTitleVo;
import com.wjl.lblog.service.intf.ArticleService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
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
@RequestMapping(value = "/article")
public class ArticleController {

    @Resource
    private ArticleService articleService;


    /**
     * 分页查询文章详情
     *
     * @param page page
     * @param size size
     */
    @RequestMapping(value = "/page/detail", method = RequestMethod.GET)
    public IPage<ArticleDetailVo> findAllDetail(
            @RequestParam(name = "page", defaultValue = "1") int page,
            @RequestParam(name = "size", defaultValue = "5") int size) {
        return articleService.selectDetailByPage(new Page<>(page, size));
    }

    /**
     * 分页查询文章摘要
     *
     * @param page page
     * @param size size
     */
    @RequestMapping(value = "/page/summary", method = RequestMethod.GET)
    public IPage<ArticleSummaryVo> findAllByPage(
            @RequestParam(name = "page", defaultValue = "1") int page,
            @RequestParam(name = "size", defaultValue = "5") int size) {
        return articleService.selectSummaryByPage(new Page<>(page, size));
    }

    /**
     * 分页查询文章标题
     *
     * @param page page
     * @param size size
     */
    @RequestMapping(value = "/page/title", method = RequestMethod.GET)
    public IPage<ArticleTitleVo> findAllByTitle(
            @RequestParam(name = "page", defaultValue = "1") int page,
            @RequestParam(name = "size", defaultValue = "5") int size) {
        return articleService.selectTitleByPage(new Page<>(page, size));
    }


    /**
     * 查询所有文章详情
     */
    @RequestMapping(value = "/all/detail", method = RequestMethod.GET)
    public List<ArticleDetailVo> getAllDetail() {
        return articleService.selectDetailAll();
    }

    /**
     * 查询所有文章摘要
     */
    @RequestMapping(value = "/all/summary", method = RequestMethod.GET)
    public List<ArticleSummaryVo> getAllSummary() {
        return articleService.selectSummaryAll();
    }

    /**
     * 查询所有文章标题
     */
    @RequestMapping(value = "/all/title", method = RequestMethod.GET)
    public List<ArticleTitleVo> getAllTitle() {
        return articleService.selectTitleAll();
    }


    /**
     * 根据 id 查询文章
     *
     * @param id id
     */
    @RequestMapping(value = "/detail/id", method = RequestMethod.GET)
    public Object getDetailById(@RequestParam(name = "id") Long id) {
        ArticleDetailVo articleDetailVo = articleService.selectDetailById(id);
        if (!Objects.isNull(articleDetailVo)) {
            return articleDetailVo;
        }
        return Result.fail(HttpStatus.BAD_REQUEST.getCode(), "can't find article by param");
    }

    /**
     * 根据 id 查询文章
     *
     * @param id id
     */
    @RequestMapping(value = "/summary/id", method = RequestMethod.GET)
    public Object getSummaryById(@RequestParam(name = "id") Long id) {
        ArticleSummaryVo articleSummaryVo = articleService.selectSummaryById(id);
        if (!Objects.isNull(articleSummaryVo)) {
            return articleSummaryVo;
        }
        return Result.fail(HttpStatus.BAD_REQUEST.getCode(), "can't find article by param");
    }

    /**
     * 根据 id 查询文章
     *
     * @param id id
     */
    @RequestMapping(value = "/title/id", method = RequestMethod.GET)
    public Object getTitleById(@RequestParam(name = "id") Long id) {
        ArticleTitleVo articleTitleVo = articleService.selectTitleById(id);
        if (!Objects.isNull(articleTitleVo)) {
            return articleTitleVo;
        }
        return Result.fail(HttpStatus.BAD_REQUEST.getCode(), "can't find article by param");
    }


    /**
     * 根据标题查询文章
     *
     * @param title title
     */
    @RequestMapping(value = "/detail/title", method = RequestMethod.GET)
    public Object getByDetail(@RequestParam(name = "title") String title) {
        ArticleDetailVo articleDetailVo = articleService.selectDetailByTitle(title);
        if (!Objects.isNull(articleDetailVo)) {
            return articleDetailVo;
        }
        return Result.fail(HttpStatus.BAD_REQUEST.getCode(), "can't find article by param");
    }

    /**
     * 根据标题查询文章
     *
     * @param title title
     */
    @RequestMapping(value = "/summary/title", method = RequestMethod.GET)
    public Object getBySummary(@RequestParam(name = "title") String title) {
        ArticleSummaryVo articleSummaryVo = articleService.selectSummaryByTitle(title);
        if (!Objects.isNull(articleSummaryVo)) {
            return articleSummaryVo;
        }
        return Result.fail(HttpStatus.BAD_REQUEST.getCode(), "can't find article by param");
    }

    /**
     * 根据标题查询文章
     *
     * @param title title
     */
    @RequestMapping(value = "/title/title", method = RequestMethod.GET)
    public Object getByTitle(@RequestParam(name = "title") String title) {
        ArticleTitleVo articleTitleVo = articleService.selectTitleByTitle(title);
        if (!Objects.isNull(articleTitleVo)) {
            return articleTitleVo;
        }
        return Result.fail(HttpStatus.BAD_REQUEST.getCode(), "can't find article by param");
    }


    /**
     * 增加文章
     *
     * @param articleDto arrticle
     */
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public Object add(@RequestBody ArticleDto articleDto) {
        if (!Objects.isNull(articleDto)) {
            return articleService.addArticle(articleDto);
        }
        return Result.fail(HttpStatus.BAD_REQUEST.getCode(), "the input is null");
    }

    /**
     * 根据 id 更新文章
     *
     * @param id id
     * @param articleDto article
     */
    @RequestMapping(value = "/", method = RequestMethod.PUT)
    public Object update(@RequestParam(name = "id") Long id, @RequestBody ArticleDto articleDto) {
        Article article = articleService.getById(id);
        if (!Objects.isNull(article)) {
            return articleService.updateArticle(id, articleDto);
        }
        return Result.fail(HttpStatus.BAD_REQUEST.getCode(), "the input is null");
    }

    /**
     * 根据 id 删除文章
     *
     * @param id id
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Object deleteById(@PathVariable(name = "id") Long id) {
        if (articleService.removeById(id)) {
            return id;
        }
        return Result.fail(HttpStatus.BAD_REQUEST.getCode(), "delete failed");
    }

}
