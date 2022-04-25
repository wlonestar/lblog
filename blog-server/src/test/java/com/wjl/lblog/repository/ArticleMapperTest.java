package com.wjl.lblog.repository;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@SpringBootTest
@RunWith(SpringRunner.class)
class ArticleMapperTest {

    @Resource
    private ArticleMapper articleMapper;

//    @Test
//    void testInsert() {
//        for (int i = 0; i < 10; i++) {
//            var article = Article.builder()
//                    .createTime(new Date())
//                    .modifyTime(new Date())
//                    .title("title" + i)
//                    .summary("summary" + i + "...")
//                    .image("sdvvdusgkyetrwyujgre" + i)
//                    .content("content" + i)
//                    .categoryId(1L)
//                    .build();
//            var res = articleMapper.insert(article);
//            System.out.println(res == 1 ? "true" : "false");
//        }
//    }

    @Test
    void testSelectDetailByPage() {
        var page = new Page<>(1, 7);
        var res = articleMapper.selectDetailByPage(page);
        var list = res.getRecords();
        for (var l : list) {
            System.out.println(l);
        }
    }

    @Test
    void testSelectDetailAll() {
        var res = articleMapper.selectDetailAll();
        for (var l : res) {
            System.out.println(l);
        }
    }

    @Test
    void testSelectDetailById() {
        for (int i = 1 ; i < 5; i++) {
            var res = articleMapper.selectDetailById((long) i);
            System.out.println(res);
        }
    }

    @Test
    void testSelectSummaryByPage() {
        var page = new Page<>(1, 7);
        var res = articleMapper.selectSummaryByPage(page);
        var list = res.getRecords();
        for (var l : list) {
            System.out.println(l);
        }
    }

    @Test
    void testSelectSummaryAll() {
        var res = articleMapper.selectSummaryAll();
        for (var l : res) {
            System.out.println(l);
        }
    }

    @Test
    void testSelectSummaryById() {
        for (int i = 1 ; i < 5; i++) {
            var res = articleMapper.selectSummaryById((long) i);
            System.out.println(res);
        }
    }

}
