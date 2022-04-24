package com.wjl.lblog.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wjl.lblog.common.constants.MyResult;
import com.wjl.lblog.common.enums.MyHttpStatus;
import com.wjl.lblog.model.dto.ArticleDto;
import com.wjl.lblog.model.entity.Article;
import com.wjl.lblog.model.vo.ArticleDetailVo;
import com.wjl.lblog.model.vo.ArticleSummaryVo;
import com.wjl.lblog.model.vo.ArticleTitleVo;
import com.wjl.lblog.service.intf.ArticleService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
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
    public MyResult<?> findAllDetail(
            @RequestParam(name = "page", defaultValue = "1") int page,
            @RequestParam(name = "size", defaultValue = "5") int size) {
        var res = articleService.selectDetailByPage(new Page<>(page, size));
        return MyResult.success(res);
    }

    /**
     * 分页查询文章摘要
     *
     * @param page page
     * @param size size
     */
    @RequestMapping(value = "/page/summary", method = RequestMethod.GET)
    public MyResult<?> findAllByPage(
            @RequestParam(name = "page", defaultValue = "1") int page,
            @RequestParam(name = "size", defaultValue = "5") int size) {
        var res = articleService.selectSummaryByPage(new Page<>(page, size));
        return MyResult.success(res);
    }

    /**
     * 分页查询文章标题
     *
     * @param page page
     * @param size size
     */
    @RequestMapping(value = "/page/title", method = RequestMethod.GET)
    public MyResult<?> findAllByTitle(
            @RequestParam(name = "page", defaultValue = "1") int page,
            @RequestParam(name = "size", defaultValue = "5") int size) {
        var res = articleService.selectTitleByPage(new Page<>(page, size));
        return MyResult.success(res);
    }

    /**
     * 查询所有文章详情
     */
    @RequestMapping(value = "/all/detail", method = RequestMethod.GET)
    public MyResult<?> getAllDetail() {
        var res = articleService.selectDetailAll();
        return MyResult.success(res);
    }

    /**
     * 查询所有文章摘要
     */
    @RequestMapping(value = "/all/summary", method = RequestMethod.GET)
    public MyResult<?> getAllSummary() {
        var res = articleService.selectSummaryAll();
        return MyResult.success(res);
    }

    /**
     * 查询所有文章标题
     */
    @RequestMapping(value = "/all/title", method = RequestMethod.GET)
    public MyResult<?> getAllTitle() {
        var res = articleService.selectTitleAll();
        return MyResult.success(res);
    }

    /**
     * 根据 id 查询文章
     *
     * @param id id
     */
    @RequestMapping(value = "/detail/id", method = RequestMethod.GET)
    public MyResult<?> getDetailById(@RequestParam(name = "id") Long id) {
        ArticleDetailVo articleDetailVo = articleService.selectDetailById(id);
        if (!Objects.isNull(articleDetailVo)) {
            return MyResult.success(articleDetailVo);
        }
        return MyResult.fail(MyHttpStatus.BAD_REQUEST.getCode(), "can't find article by param");
    }

    /**
     * 根据 id 查询文章
     *
     * @param id id
     */
    @RequestMapping(value = "/summary/id", method = RequestMethod.GET)
    public MyResult<?> getSummaryById(@RequestParam(name = "id") Long id) {
        ArticleSummaryVo articleSummaryVo = articleService.selectSummaryById(id);
        if (!Objects.isNull(articleSummaryVo)) {
            return MyResult.success(articleSummaryVo);
        }
        return MyResult.fail(MyHttpStatus.BAD_REQUEST.getCode(), "can't find article by param");
    }

    /**
     * 根据 id 查询文章
     *
     * @param id id
     */
    @RequestMapping(value = "/title/id", method = RequestMethod.GET)
    public MyResult<?> getTitleById(@RequestParam(name = "id") Long id) {
        ArticleTitleVo articleTitleVo = articleService.selectTitleById(id);
        if (!Objects.isNull(articleTitleVo)) {
            return MyResult.success(articleTitleVo);
        }
        return MyResult.fail(MyHttpStatus.BAD_REQUEST.getCode(), "can't find article by param");
    }

    /**
     * 根据标题查询文章
     *
     * @param title title
     */
    @RequestMapping(value = "/detail/title", method = RequestMethod.GET)
    public MyResult<?> getByDetail(@RequestParam(name = "title") String title) {
        ArticleDetailVo articleDetailVo = articleService.selectDetailByTitle(title);
        if (!Objects.isNull(articleDetailVo)) {
            return MyResult.success(articleDetailVo);
        }
        return MyResult.fail(MyHttpStatus.BAD_REQUEST.getCode(), "can't find article by param");
    }

    /**
     * 根据标题查询文章
     *
     * @param title title
     */
    @RequestMapping(value = "/summary/title", method = RequestMethod.GET)
    public MyResult<?> getBySummary(@RequestParam(name = "title") String title) {
        ArticleSummaryVo articleSummaryVo = articleService.selectSummaryByTitle(title);
        if (!Objects.isNull(articleSummaryVo)) {
            return MyResult.success(articleSummaryVo);
        }
        return MyResult.fail(MyHttpStatus.BAD_REQUEST.getCode(), "can't find article by param");
    }

    /**
     * 根据标题查询文章
     *
     * @param title title
     */
    @RequestMapping(value = "/title/title", method = RequestMethod.GET)
    public MyResult<?> getByTitle(@RequestParam(name = "title") String title) {
        ArticleTitleVo articleTitleVo = articleService.selectTitleByTitle(title);
        if (!Objects.isNull(articleTitleVo)) {
            return MyResult.success(articleTitleVo);
        }
        return MyResult.fail(MyHttpStatus.BAD_REQUEST.getCode(), "can't find article by param");
    }

    /**
     * 增加文章
     *
     * @param articleDto arrticle
     */
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public MyResult<?> add(@RequestBody ArticleDto articleDto) {
        if (!Objects.isNull(articleDto)) {
            var res = articleService.addArticle(articleDto);
            if (res) {
                return MyResult.success();
            } else {
                return MyResult.fail(MyHttpStatus.BAD_REQUEST.getCode(), "");
            }
        }
        return MyResult.fail(MyHttpStatus.BAD_REQUEST.getCode(), "the input is null");
    }

    /**
     * 根据 id 更新文章
     *
     * @param id id
     * @param articleDto article
     */
    @RequestMapping(value = "/", method = RequestMethod.PUT)
    public MyResult<?> update(@RequestParam(name = "id") Long id, @RequestBody ArticleDto articleDto) {
        Article article = articleService.getById(id);
        if (!Objects.isNull(article)) {
            var res = articleService.updateArticle(id, articleDto);
            if (res) {
                return MyResult.success();
            } else {
                return MyResult.fail(MyHttpStatus.BAD_REQUEST.getCode(), "");
            }
        }
        return MyResult.fail(MyHttpStatus.BAD_REQUEST.getCode(), "the input is null");
    }

    /**
     * 根据 id 删除文章
     *
     * @param id id
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public MyResult<?> deleteById(@PathVariable(name = "id") Long id) {
        var res = articleService.removeById(id);
        if (res) {
            return MyResult.success();
        } else {
            return MyResult.fail(MyHttpStatus.BAD_REQUEST.getCode(), "delete failed");
        }
    }

}
