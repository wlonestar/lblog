package com.wjl.lblog.service.intf;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.wjl.lblog.model.dto.ArticleDto;
import com.wjl.lblog.model.vo.ArticleDetailVo;
import com.wjl.lblog.model.vo.ArticleSummaryVo;
import com.wjl.lblog.model.entity.Article;
import com.wjl.lblog.model.vo.ArticleTitleVo;

import java.util.List;

/**
 * @author: wjl
 * @date: 2021/9/13 21:55
 * @version: v1.0
 */
public interface ArticleService extends IService<Article> {

    IPage<ArticleDetailVo> selectDetailByPage(Page<ArticleDetailVo> page);

    IPage<ArticleSummaryVo> selectSummaryByPage(Page<ArticleSummaryVo> page);

    IPage<ArticleTitleVo> selectTitleByPage(Page<ArticleTitleVo> page);


    List<ArticleDetailVo> selectDetailAll();

    List<ArticleSummaryVo> selectSummaryAll();

    List<ArticleTitleVo> selectTitleAll();


    ArticleDetailVo selectDetailById(Long id);

    ArticleSummaryVo selectSummaryById(Long id);

    ArticleTitleVo selectTitleById(Long id);


    ArticleDetailVo selectDetailByTitle(String title);

    ArticleSummaryVo selectSummaryByTitle(String title);

    ArticleTitleVo selectTitleByTitle(String title);



    boolean addArticle(Article article);

    boolean updateArticle(Long id, Article article);

    boolean addArticle(ArticleDto articleDto);

    boolean updateArticle(Long id, ArticleDto articleDto);

}
