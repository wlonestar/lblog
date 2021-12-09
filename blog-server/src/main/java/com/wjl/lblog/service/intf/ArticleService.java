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

    List<ArticleSummaryVo> findAllSummary();

    List<ArticleDetailVo> findAllDetail();

    List<ArticleTitleVo> findAllTitle();

    Page<ArticleSummaryVo> findSummaryByPage(Pageable pageable);


    ArticleDetailVo getById(Long id);

    ArticleDetailVo getByTitle(String title);

    Article findById(Long id);

    Article findByTitle(String title);


    boolean add(ArticleDto articleDto);

    boolean update(Long id, ArticleDto articleDto);


    boolean deleteById(Long id);

}
