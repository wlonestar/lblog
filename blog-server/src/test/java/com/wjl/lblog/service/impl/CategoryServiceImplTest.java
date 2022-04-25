package com.wjl.lblog.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wjl.lblog.model.entity.Category;
import com.wjl.lblog.model.vo.ArticleSummaryVo;
import com.wjl.lblog.service.intf.CategoryService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@SpringBootTest
@RunWith(SpringRunner.class)
class CategoryServiceImplTest {

    @Resource
    private CategoryService categoryService;

    @Test
    void selectByPageTest() {
        var page = new Page<Category>(1, 7);
        var res = categoryService.selectByPage(page).getRecords();
        for (var r : res) {
            System.out.println(r);
        }
    }

    @Test
    void selectAllTest() {
        var res = categoryService.selectAll();
        for (var r : res) {
            System.out.println(r);
        }
    }

    @Test
    void selectByIdTest() {
        var id = 12L;
        var res = categoryService.selectById(id);
        System.out.println(res);
    }

    @Test
    void selectByNameTest() {
        var name = "12";
        var res = categoryService.selectByName(name);
        System.out.println(res);
        name = "category11";
        res = categoryService.selectByName(name);
        System.out.println(res);
    }

    @Test
    void selectByCategoryIdTest() {
        var id = 2L;
        var page = new Page<ArticleSummaryVo>(1, 6);
        var res = categoryService.selectByCategoryId(id, page);
        System.out.println(res.getName());
        var records = res.getArticles().getRecords();
        for (var r : records) {
            System.out.println(r);
        }
    }

    @Test
    void selectByCategoryNameTest() {
        var name = "category0";
        var page = new Page<ArticleSummaryVo>(1, 6);
        var res = categoryService.selectByCategoryName(name, page);
        var records = res.getArticles().getRecords();
        for (var r : records) {
            System.out.println(r);
        }
    }

}