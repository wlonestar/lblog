package com.wjl.lblog.repository;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wjl.lblog.model.entity.Tag;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.Date;

@SpringBootTest
@RunWith(SpringRunner.class)
class TagMapperTest {

    @Resource
    private TagMapper tagMapper;

//    @Test
//    void insertTest() {
//        for (int i = 0; i < 10; i++) {
//            var tag = Tag.builder().name("tag" + i).build();
//            var res = tagMapper.insert(tag);
//            System.out.println(res);
//        }
//    }
//
//    @Test
//    void updateTest() throws InterruptedException {
//        var tag = tagMapper.selectById(4L);
//        var res = tagMapper.updateById(tag);
//        System.out.println(res);
//        System.out.println(tag);
//        Thread.sleep(1000);
//        tag.setModifyTime(new Date());
//        res = tagMapper.updateById(tag);
//        System.out.println(res);
//        System.out.println(tag);
//    }

}