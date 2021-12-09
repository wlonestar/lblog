package com.wjl.lblog.service.intf;

import com.wjl.lblog.model.entity.ArticleTag;

import java.util.List;

/**
 * @author: wjl
 * @date: 2021/12/8 20:37
 * @version: v1.0
 */
public interface ArticleTagService {

    List<ArticleTag> findAllByAid(Long aid);

    List<ArticleTag> findAllByTid(Long tid);

}
