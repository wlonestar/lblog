package com.wjl.lblog.repository;

import com.wjl.lblog.model.entity.Category;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@SpringBootTest
@RunWith(SpringRunner.class)
class CategoryMapperTest {

    @Resource
    private CategoryMapper categoryMapper;

//    @Test
//    void testInsert() {
//        for (int i = 0; i < 10; i++) {
//            var category = Category.builder()
//                    .createTime(new Date())
//                    .modifyTime(new Date())
//                    .name("category" + i + "" + i)
//                    .build();
//            var res = categoryMapper.insert(category);
//            System.out.println(category);
//            System.out.println(res == 1 ? "true" : "false");
//        }
//    }


}
