package com.wjl.lblog.controller;

import com.wjl.lblog.common.constants.Result;
import com.wjl.lblog.common.enums.HttpStatus;
import com.wjl.lblog.model.entity.Category;
import com.wjl.lblog.service.intf.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

/**
 * 分类接口
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
    public Page<Category> findAllByPage(
            @RequestParam(name = "page", defaultValue = "1") int page,
            @RequestParam(name = "size", defaultValue = "5") int size) {
        return categoryService.findByPage(
                PageRequest.of(page - 1, size, Sort.Direction.DESC, "createTime"));
    }

    /**
     * 查询所有分类实体
     */
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Category> getAll() {
        return categoryService.findAll();
    }

    /**
     * 分页查询某分类下文章
     *
     * @param id id
     * @param page page
     * @param size size
     */
    @RequestMapping(value = "/article", method = RequestMethod.GET)
    public Object findOneCategoryAndArticleById(
            @RequestParam(name = "id") Long id,
            @RequestParam(name = "page", defaultValue = "1") int page,
            @RequestParam(name = "size", defaultValue = "7") int size) {
        Category category = categoryService.findById(id);
        if (!Objects.isNull(category)) {
            return categoryService.findCategoryById(id, PageRequest.of(page - 1, size));
        } else {
            return Result.fail(HttpStatus.FAILED.getCode(), "can't get the category");
        }
    }

    /**
     * 根据 id 查询分类实体
     *
     * @param id id
     */
    @RequestMapping(value = "/id", method = RequestMethod.GET)
    public Object getById(@RequestParam(name = "id") Long id) {
        Category category = categoryService.findById(id);
        if (!Objects.isNull(category)) {
            return category;
        } else {
            return Result.fail(HttpStatus.FAILED.getCode(), "can't get the category");
        }
    }

    /**
     * 根据名称查询分类实体
     *
     * @param name name
     */
    @RequestMapping(value = "/name", method = RequestMethod.GET)
    public Object getByName(@RequestParam(name = "name") String name) {
        Category category = categoryService.findByName(name);
        if (!Objects.isNull(category)) {
            return category;
        } else {
            return Result.fail(HttpStatus.FAILED.getCode(), "can't get the category");
        }
    }

    /**
     * 增加分类
     *
     * @param category category
     */
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public Object add(@RequestBody Category category) {
        if (categoryService.add(category)) {
            return category;
        } else {
            return Result.fail(HttpStatus.FAILED.getCode(), "can't add category");
        }
    }

    /**
     * 根据 id 更新分类
     *
     * @param id id
     * @param category category
     */
    @RequestMapping(value = "/", method = RequestMethod.PUT)
    public Object update(@RequestParam(name = "id") Long id, @RequestBody Category category) {
        if (categoryService.update(id, category)) {
            return category;
        } else {
            return Result.fail(HttpStatus.FAILED.getCode(), "can't update category");
        }
    }

    /**
     * 根据 id 删除分类
     *
     * @param id id
     */
    @RequestMapping(value = "/", method = RequestMethod.DELETE)
    public Object deleteById(@RequestParam(name = "id") Long id) {
        if (categoryService.deleteById(id)) {
            return id;
        } else {
            return Result.fail(HttpStatus.FAILED.getCode(), "can't delete category");
        }
    }

}
