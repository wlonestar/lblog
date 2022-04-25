package com.wjl.lblog.repository;

import com.wjl.lblog.model.entity.ArticleTag;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@SpringBootTest
@RunWith(SpringRunner.class)
class ArticleTagMapperTest {

    @Resource
    private ArticleTagMapper articleTagMapper;

    @Test
    void insertTest() {
        for (int i = 0; i < 5; i++) {
            for (int j = 5; j < 10; j++) {
                var articleTag = ArticleTag.builder()
                        .aid((long) i)
                        .tid((long) j).build();
                var res = articleTagMapper.insert(articleTag);
                System.out.println(res);
            }
        }
    }

}
