package com.wjl.lblog.service.intf;

import com.wjl.lblog.model.vo.ArticleDetailVo;
import com.wjl.lblog.model.vo.ArticleSummaryVo;
import com.wjl.lblog.model.entity.Article;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @author: wjl
 * @date: 2021/9/13 21:55
 * @version: v1.0
 */
public interface ArticleService {

    /**
     * 分页查询
     */
    Page<ArticleSummaryVo> findAllByPage(Pageable pageable);

    /**
     * 查询所有
     */
    List<ArticleSummaryVo> findAllArticleSummary();

    /**
     * 根据 id 查询
     */
    ArticleDetailVo findById(Long id);

    /**
     * 根据标题查询
     */
    ArticleDetailVo findByTitle(String title);

    /**
     * 增加
     */
    ArticleDetailVo add(ArticleDetailVo articleDetailVo);

    /**
     * 更新
     */
    ArticleDetailVo update(Long id, ArticleDetailVo articleDetailVo);

    /**
     * 根据 id 删除
     */
    Article deleteById(Long id);

    /**
     * 删除所有
     */
    void deleteAll();

}
