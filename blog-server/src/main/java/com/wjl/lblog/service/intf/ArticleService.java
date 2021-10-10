package com.wjl.lblog.service.intf;

import com.wjl.lblog.model.dto.ArticleDto;
import com.wjl.lblog.model.dto.ArticleSummaryDto;
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
    Page<ArticleSummaryDto> findAllByPage(Pageable pageable);

    /**
     * 查询所有
     */
    List<ArticleSummaryDto> findAllArticleSummary();

    /**
     * 根据 id 查询
     */
    ArticleDto findById(Long id);

    /**
     * 根据标题查询
     */
    ArticleDto findByTitle(String title);

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    /**
     * 增加
     */
    ArticleDto add(ArticleDto articleDto);

    /**
     * 更新
     */
    ArticleDto update(Long id, ArticleDto articleDto);

    /**
     * 根据 id 删除
     */
    Article deleteById(Long id);

    /**
     * 删除所有
     */
    void deleteAll();

}
