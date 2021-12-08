package com.wjl.lblog.controller;

import com.wjl.lblog.model.entity.Category;
import com.wjl.lblog.model.vo.CategoryArticleVo;
import com.wjl.lblog.service.intf.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
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
     * 分页查询分类实体
     *
     * @param page 页数
     * @param size 数量
     */
    @RequestMapping(value = "/page", method = RequestMethod.GET)
    public Page<Category> findAllByPage(@RequestParam(defaultValue = "1") int page,
                                        @RequestParam(defaultValue = "7") int size) {
        return categoryService.findAllCategoryByPage(
                PageRequest.of(page - 1, size, Sort.Direction.DESC, "createTime"));
    }

    /**
     * 查询所有分类实体
     */
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Category> getAll() {
        return categoryService.findAllCategory();
    }

    /**
     * 分页查询某分类下文章
     *
     * @param id id
     * @param page page
     * @param size size
     */
    @RequestMapping(value = "/article", method = RequestMethod.GET)
    public CategoryArticleVo findOneCategoryAndArticleById(@RequestParam("id") Long id,
                                                           @RequestParam(defaultValue = "1") int page,
                                                           @RequestParam(defaultValue = "7") int size) {
        return categoryService.findOneCategoryAndArticleById(id, PageRequest.of(page - 1, size));
    }

    /**
     * 根据 id 查询分类实体
     *
     * @param id id
     */
    @RequestMapping(value = "/id", method = RequestMethod.GET)
    public Category get(@RequestParam Long id) {
        return categoryService.findCategoryById(id);
    }

    /**
     * 根据名称查询分类实体
     *
     * @param name name
     */
    @RequestMapping(value = "/name", method = RequestMethod.GET)
    public Category get(@RequestParam String name) {
        return categoryService.findCategoryByName(name);
    }

    /**
     * 增加分类
     *
     * @param category category
     */
    @RequestMapping(method = RequestMethod.POST)
    public Category add(@RequestBody Category category) {
        return categoryService.add(category);
    }

    /**
     * 根据 id 更新分类
     *
     * @param id id
     * @param category category
     */
    @RequestMapping(method = RequestMethod.PUT)
    public Category update(@RequestParam("id") Long id, @RequestBody Category category) {
        return categoryService.update(id, category);
    }

    /**
     * 根据 id 删除分类
     *
     * @param id id
     */
    @RequestMapping(method = RequestMethod.DELETE)
    public Category deleteById(@RequestParam("id") Long id) {
        return categoryService.deleteById(id);
    }

}
