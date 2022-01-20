package com.wjl.lblog.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wjl.lblog.common.constants.Result;
import com.wjl.lblog.common.enums.HttpStatus;
import com.wjl.lblog.model.dto.CategoryDto;
import com.wjl.lblog.model.entity.Category;
import com.wjl.lblog.service.intf.CategoryService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
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
@RequestMapping(value = "/category")
public class CategoryController {

    @Resource
    private CategoryService categoryService;

    /**
     * 分页查询分类实体
     *
     * @param page 页数
     * @param size 数量
     */
    @RequestMapping(value = "/page", method = RequestMethod.GET)
    public IPage<Category> findAllByPage(
            @RequestParam(name = "page", defaultValue = "1") int page,
            @RequestParam(name = "size", defaultValue = "5") int size) {
        return categoryService.selectCategoryByPage(new Page<>(page, size));
    }

    /**
     * 查询所有分类实体
     */
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Category> getAll() {
        return categoryService.selectCategoryAll();
    }

    /**
     * 分页查询某分类下文章
     *
     * @param id id
     * @param page page
     * @param size size
     */
    @RequestMapping(value = "/article/id", method = RequestMethod.GET)
    public Object findOneCategoryAndArticleById(
            @RequestParam(name = "id") Long id,
            @RequestParam(name = "page", defaultValue = "1") int page,
            @RequestParam(name = "size", defaultValue = "7") int size) {
        Category category = categoryService.selectCategoryById(id);
        if (!Objects.isNull(category)) {
            return categoryService.selectArticleByCategoryId(id, new Page<>(page, size));
        }
        return Result.fail(HttpStatus.BAD_REQUEST.getCode(), "can't get the category");
    }

    /**
     * 分页查询某分类下文章
     *
     * @param name name
     * @param page page
     * @param size size
     */
    @RequestMapping(value = "/article/name", method = RequestMethod.GET)
    public Object findOneCategoryAndArticleByName(
            @RequestParam(name = "name") String name,
            @RequestParam(name = "page", defaultValue = "1") int page,
            @RequestParam(name = "size", defaultValue = "7") int size) {
        Category category = categoryService.selectCategoryByName(name);
        if (!Objects.isNull(category)) {
            return categoryService.selectArticleByCategoryName(name, new Page<>(page, size));
        }
        return Result.fail(HttpStatus.BAD_REQUEST.getCode(), "can't get the category");
    }

    /**
     * 根据 id 查询分类实体
     *
     * @param id id
     */
    @RequestMapping(value = "/id", method = RequestMethod.GET)
    public Object getById(@RequestParam(name = "id") Long id) {
        Category category = categoryService.selectCategoryById(id);
        if (!Objects.isNull(category)) {
            return category;
        }
        return Result.fail(HttpStatus.BAD_REQUEST.getCode(), "can't get the category");
    }

    /**
     * 根据名称查询分类实体
     *
     * @param name name
     */
    @RequestMapping(value = "/name", method = RequestMethod.GET)
    public Object getByName(@RequestParam(name = "name") String name) {
        Category category = categoryService.selectCategoryByName(name);
        if (!Objects.isNull(category)) {
            return category;
        }
        return Result.fail(HttpStatus.BAD_REQUEST.getCode(), "can't get the category");
    }


    /**
     * 增加分类
     *
     * @param categoryDto category
     */
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public Object add(@RequestBody CategoryDto categoryDto) {
        if (categoryService.addCategory(categoryDto)) {
            return categoryDto;
        }
        return Result.fail(HttpStatus.BAD_REQUEST.getCode(), "can't add category");
    }

    /**
     * 根据 id 更新分类
     *
     * @param id id
     * @param categoryDto category
     */
    @RequestMapping(value = "/", method = RequestMethod.PUT)
    public Object update(@RequestParam(name = "id") Long id, @RequestBody CategoryDto categoryDto) {
        Category category = categoryService.selectCategoryById(id);
        if (!Objects.isNull(category)) {
            return categoryService.updateCategory(id, categoryDto);
        }
        return Result.fail(HttpStatus.BAD_REQUEST.getCode(), "can't update category");
    }

    /**
     * 根据 id 删除分类
     *
     * @param id id
     */
    @RequestMapping(value = "/", method = RequestMethod.DELETE)
    public Object deleteById(@RequestParam(name = "id") Long id) {
        if (categoryService.removeById(id)) {
            return id;
        }
        return Result.fail(HttpStatus.BAD_REQUEST.getCode(), "can't delete category");
    }

}
