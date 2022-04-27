package com.wjl.lblog.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wjl.lblog.model.entity.Image;
import com.wjl.lblog.model.entity.Tag;
import com.wjl.lblog.model.vo.ArticleSummaryVo;
import com.wjl.lblog.model.vo.TagArticleVo;
import com.wjl.lblog.repository.ArticleMapper;
import com.wjl.lblog.repository.TagMapper;
import com.wjl.lblog.service.intf.TagService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 * @author: wjl
 * @time: 2022/4/24 19:35
 * @version: 1.0
 */
@Service
public class TagServiceImpl extends ServiceImpl<TagMapper, Tag>
        implements TagService {

    @Resource
    private TagMapper tagMapper;

    @Resource
    private ArticleMapper articleMapper;

    @Override
    public IPage<Tag> selectByPage(Page<Tag> page) {
        var wrapper = new LambdaQueryWrapper<Tag>();
        wrapper.orderByDesc(Tag::getCreateTime);
        return tagMapper.selectPage(page, wrapper);
    }

    @Override
    public List<Tag> selectAll() {
        var wrapper = new LambdaQueryWrapper<Tag>();
        wrapper.orderByDesc(Tag::getCreateTime);
        return tagMapper.selectList(wrapper);
    }

    @Override
    public List<String> selectAllName() {
        var list = selectAll();
        var res = new ArrayList<String>();
        for (var l : list) {
            res.add(l.getName());
        }
        return res;
    }

    @Override
    public Tag selectById(Long id) {
        var tag = tagMapper.selectById(id);
        if (!Objects.isNull(tag)) {
            return tag;
        } else {
            return null;
        }
    }

    @Override
    public Tag selectByName(String name) {
        var wrapper = new LambdaQueryWrapper<Tag>();
        wrapper.eq(Tag::getName, name);
        var tag = tagMapper.selectOne(wrapper);
        if (!Objects.isNull(tag)) {
            return tag;
        } else {
            return null;
        }
    }

    @Override
    public TagArticleVo selectByTagId(Long id, Page<ArticleSummaryVo> page) {
        var tag = tagMapper.selectById(id);
        if (!Objects.isNull(tag)) {
            return getByTag(tag, page);
        } else {
            return null;
        }
    }

    @Override
    public TagArticleVo selectByTagName(String name, Page<ArticleSummaryVo> page) {
        var tag = selectByName(name);
        if (!Objects.isNull(tag)) {
            return getByTag(tag, page);
        } else {
            return null;
        }
    }

    @Override
    public boolean add(String tag) {
        if (!Objects.isNull(tag)) {
            var newTag = new Tag();
            if (selectAllName().contains(tag)) {
                return false;
            } else {
                newTag.setName(tag);
                var res = tagMapper.insert(newTag);
                return res == 1;
            }
        } else {
            return false;
        }
    }

    private TagArticleVo getByTag(Tag tag, Page<ArticleSummaryVo> page) {
        var pages = articleMapper.selectSummaryByPage(page);
        return TagArticleVo.builder()
                .id(tag.getId())
                .createTime(tag.getCreateTime())
                .name(tag.getName())
                .articles(pages).build();
    }

}
