package com.wjl.lblog.service.intf;

import com.wjl.lblog.model.vo.ArticleVo;
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
    Page<ArticleVo> findAllByPage(Pageable pageable);

    /**
     * 查询所有
     */
    List<ArticleVo> findAll();

    /**
     * 根据 id 查询
     */
    ArticleVo findById(Long id);

    /**
     * 增加
     */
    ArticleVo add(ArticleVo articleVo);

    /**
     * 更新
     */
    ArticleVo update(Long id, ArticleVo articleVo);

    /**
     * 根据 id 删除
     */
    Long deleteById(Long id);

    /**
     * 删除所有
     */
    void deleteAll();

}
