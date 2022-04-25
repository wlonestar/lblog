package com.wjl.lblog.service.intf;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.wjl.lblog.model.dto.ArticleDto;
import com.wjl.lblog.model.vo.ArticleDetailVo;
import com.wjl.lblog.model.vo.ArticleSummaryVo;
import com.wjl.lblog.model.entity.Article;

import java.util.List;

/**
 * @author: wjl
 * @date: 2021/9/13 21:55
 * @version: v1.0
 */
public interface ArticleService extends IService<Article> {

    IPage<ArticleDetailVo> selectDetailByPage(Page<ArticleDetailVo> page);

    List<ArticleDetailVo> selectDetailAll();

    ArticleDetailVo selectDetailById(Long id);

    IPage<ArticleSummaryVo> selectSummaryByPage(Page<ArticleSummaryVo> page);

    List<ArticleSummaryVo> selectSummaryAll();

    ArticleSummaryVo selectSummaryById(Long id);

    boolean add(ArticleDto articleDto);

    boolean updateById(Long id, ArticleDto articleDto);

    boolean deleteById(Long id);

}
