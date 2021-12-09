package com.wjl.lblog.service.impl;

import com.wjl.lblog.model.entity.ArticleTag;
import com.wjl.lblog.repository.ArticleTagRepository;
import com.wjl.lblog.service.intf.ArticleTagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: wjl
 * @date: 2021/12/9 10:31
 * @version: v1.0
 */
@Service
public class ArticleTagServiceImpl implements ArticleTagService {

    @Autowired
    private ArticleTagRepository articleTagRepository;

    @Override
    public List<ArticleTag> findAllByAid(Long aid) {
        return articleTagRepository.findArticleTagsByAid(aid);
    }

    @Override
    public List<ArticleTag> findAllByTid(Long tid) {
        return articleTagRepository.findArticleTagByTid(tid);
    }

}
