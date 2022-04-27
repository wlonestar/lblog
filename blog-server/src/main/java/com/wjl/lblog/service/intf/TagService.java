package com.wjl.lblog.service.intf;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.wjl.lblog.model.entity.Tag;
import com.wjl.lblog.model.vo.ArticleSummaryVo;
import com.wjl.lblog.model.vo.TagArticleVo;
import lombok.extern.java.Log;

import java.util.List;

/**
 * @author: wjl
 * @time: 2022/4/24 19:34
 * @version: 1.0
 */
public interface TagService extends IService<Tag> {

    IPage<Tag> selectByPage(Page<Tag> page);

    List<Tag> selectAll();

    List<String> selectAllName();

    Tag selectById(Long id);

    Tag selectByName(String name);

    TagArticleVo selectByTagId(Long id, Page<ArticleSummaryVo> page);

    TagArticleVo selectByTagName(String name, Page<ArticleSummaryVo> page);

    boolean add(String tag);

}
