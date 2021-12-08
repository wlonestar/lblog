package com.wjl.lblog.service.intf;

import com.wjl.lblog.model.dto.ArticleDto;
import com.wjl.lblog.model.vo.ArticleDetailVo;
import com.wjl.lblog.model.vo.ArticleSummaryVo;
import com.wjl.lblog.model.entity.Article;
import com.wjl.lblog.model.vo.ArticleTitleVo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @author: wjl
 * @date: 2021/9/13 21:55
 * @version: v1.0
 */
public interface ArticleService {

    Page<ArticleSummaryVo> findAllByPage(Pageable pageable);

    Page<ArticleDetailVo> findArticleDetailsByPage(Pageable pageable);

    Page<ArticleTitleVo> findArticleTitlesByPage(Pageable pageable);


    List<ArticleSummaryVo> findAllArticleSummary();

    List<ArticleDetailVo> findArticleDetails();

    List<ArticleTitleVo> findArticleTitles();

    List<Article> findArticles();

    List<ArticleDto> findAllArticleDtoByArticleId(Long aid);

    List<ArticleDto> findAllArticleDtoByTagId(Long tid);


    ArticleDetailVo findById(Long id);

    ArticleSummaryVo findArticleSummaryById(Long id);

    ArticleTitleVo findArticleTitleById(Long id);

    Article findArticleById(Long id);


    ArticleDetailVo findByTitle(String title);

    ArticleDetailVo add(ArticleDetailVo articleDetailVo);

    ArticleDetailVo update(Long id, ArticleDetailVo articleDetailVo);

    Article deleteById(Long id);

}
