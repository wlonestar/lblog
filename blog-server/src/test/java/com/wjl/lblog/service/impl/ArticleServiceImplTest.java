package com.wjl.lblog.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wjl.lblog.model.dto.ArticleDto;
import com.wjl.lblog.model.vo.ArticleDetailVo;
import com.wjl.lblog.model.vo.ArticleSummaryVo;
import com.wjl.lblog.service.intf.ArticleService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
class ArticleServiceImplTest {

    @Resource
    private ArticleService articleService;

    @Test
    void selectDetailByPageTest() {
        var page = new Page<ArticleDetailVo>(1, 5);
        var res = articleService.selectDetailByPage(page);
        var records = res.getRecords();
        for (var r : records) {
            System.out.println(r);
        }
    }

    @Test
    void selectDetailAllTest() {
        var res = articleService.selectDetailAll();
        for (var r : res) {
            System.out.println(r);
        }
    }

    @Test
    void selectDetailByIdTest() {
        var id = 2L;
        var res = articleService.selectDetailById(id);
        System.out.println(res);
    }

    @Test
    void selectSummaryByPageTest() {
        var page = new Page<ArticleSummaryVo>(1, 5);
        var res = articleService.selectSummaryByPage(page);
        var records = res.getRecords();
        for (var r : records) {
            System.out.println(r);
        }
    }

    @Test
    void selectSummaryAllTest() {
        var res = articleService.selectSummaryAll();
        for (var r : res) {
            System.out.println(r);
        }
    }

    @Test
    void selectSummaryByIdTest() {
        var id = 2L;
        var res = articleService.selectSummaryById(id);
        System.out.println(res);
    }

    @Test
    void addTest() {
        var articleDto = ArticleDto.builder()
                .title("article101210")
                .summary("summsdary222222")
                .image("imafbsdegee")
                .content("conegnreedsufwfwe")
                .category("category121")
                .tags(List.of("tag0", "tag3", "tagg5"))
                .build();
        var res = articleService.add(articleDto);
        System.out.println(res);
    }

    @Test
    void updateTest() {
        var articleDto = ArticleDto.builder()
                .title("article1wrw0")
                .summary("summsdary2r2")
                .image("imafbsd")
                .content("conegnreedsu")
                .category("category12")
                .tags(List.of("tag23", "tag38", "tag5", "tags232"))
                .build();
        var res = articleService.updateById(6L, articleDto);
        System.out.println(res);
    }

    @Test
    void deleteByIdTest() {
        var id = 12L;
        var res = articleService.deleteById(id);
        System.out.println(res);
    }

}
