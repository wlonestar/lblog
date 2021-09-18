package com.wjl.lblog.controller;

import com.wjl.lblog.model.vo.CategoryVo;
import com.wjl.lblog.service.intf.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 分类
 *
 * @author: wjl
 * @date: 2021/9/14 15:30
 * @version: v1.0
 */
@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    /**
     * 分页查询分类
     *
     * @param page
     * @param size
     */
    @RequestMapping(method = RequestMethod.GET)
    public Page<CategoryVo> findAllByPage(
            @RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "10") int size) {
        return categoryService.findAllByPage(PageRequest.of(page, size));
    }

    /**
     * 查询所有分类
     */
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<CategoryVo> getAll() {
        return categoryService.findAll();
    }

    /**
     * 根据 id 查询分类
     *
     * @param id
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public CategoryVo get(@PathVariable Long id) {
        return categoryService.findById(id);
    }

    /**
     * 增加分类
     *
     * @param categoryVo
     */
    @RequestMapping(method = RequestMethod.POST)
    public CategoryVo add(@RequestBody CategoryVo categoryVo) {
        return categoryService.add(categoryVo);
    }

    /**
     * 根据 id 更新分类
     *
     * @param id
     * @param categoryVo
     */
    @RequestMapping(method = RequestMethod.PUT)
    public CategoryVo update(@RequestParam("id") Long id, @RequestBody CategoryVo categoryVo) {
        return categoryService.update(id, categoryVo);
    }

    /**
     * 根据 id 删除分类
     *
     * @param id
     */
    @RequestMapping(method = RequestMethod.DELETE)
    public Long deleteById(@RequestParam("id") Long id) {
        return categoryService.deleteById(id);
//        return id;
    }

}
