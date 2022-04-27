package com.wjl.lblog.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wjl.lblog.annotation.TimeLog;
import com.wjl.lblog.common.constants.MyResult;
import com.wjl.lblog.common.enums.MyHttpStatus;
import com.wjl.lblog.model.dto.ArticleDto;
import com.wjl.lblog.service.intf.ArticleService;
import lombok.extern.slf4j.Slf4j;
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
@Slf4j
@TimeLog
@RestController
@RequestMapping(path = "/article")
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
    public MyResult<?> findAllDetail(@RequestParam(name = "page", defaultValue = "1") int page,
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
    public MyResult<?> findAllByPage(@RequestParam(name = "page", defaultValue = "1") int page,
                                     @RequestParam(name = "size", defaultValue = "5") int size) {
        var res = articleService.selectSummaryByPage(new Page<>(page, size));
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
     * 根据 id 查询文章详情
     *
     * @param id id
     */
    @RequestMapping(value = "/detail", method = RequestMethod.GET)
    public MyResult<?> getDetailById(@RequestParam(name = "id") Long id) {
        var res = articleService.selectDetailById(id);
        if (!Objects.isNull(res)) {
            return MyResult.success(res);
        } else {
            return MyResult.fail(MyHttpStatus.QUERY_ERROR);
        }
    }

    /**
     * 根据 id 查询文章摘要
     *
     * @param id id
     */
    @RequestMapping(value = "/summary", method = RequestMethod.GET)
    public MyResult<?> getSummaryById(@RequestParam(name = "id") Long id) {
        var res = articleService.selectSummaryById(id);
        if (!Objects.isNull(res)) {
            return MyResult.success(res);
        }
        return MyResult.fail(MyHttpStatus.QUERY_ERROR);
    }

    /**
     * 增加文章
     *
     * @param articleDto arrticle
     */
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public MyResult<?> add(@RequestBody ArticleDto articleDto) {
        if (!Objects.isNull(articleDto)) {
            var res = articleService.add(articleDto);
            if (res) {
                return MyResult.success();
            } else {
                return MyResult.fail(MyHttpStatus.INSERT_ERROR);
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
    public MyResult<?> update(@RequestParam(name = "id") Long id,
                              @RequestBody ArticleDto articleDto) {
        var article = articleService.getById(id);
        if (!Objects.isNull(article)) {
            var res = articleService.updateById(id, articleDto);
            if (res) {
                return MyResult.success();
            } else {
                return MyResult.fail(MyHttpStatus.UPDATE_ERROR);
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
            return MyResult.fail(MyHttpStatus.DELETE_ERROR);
        }
    }

}
