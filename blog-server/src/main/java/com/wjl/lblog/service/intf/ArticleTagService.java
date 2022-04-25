package com.wjl.lblog.service.intf;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wjl.lblog.model.entity.ArticleTag;

import java.util.List;

/**
 * @author: wjl
 * @time: 2022/4/24 19:35
 * @version: 1.0
 */
public interface ArticleTagService extends IService<ArticleTag> {

    List<Long> selectByAid(Long aid);

    List<Long> selectByTid(Long tid);

    boolean checkExistByAidAndTid(Long aid, Long tid);

    void deleteByAid(Long aid);

    boolean deleteByTid(Long tid);

}
