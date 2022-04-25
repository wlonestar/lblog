package com.wjl.lblog.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wjl.lblog.model.entity.Tag;
import com.wjl.lblog.model.vo.ArticleSummaryVo;
import com.wjl.lblog.model.vo.TagArticleVo;
import com.wjl.lblog.repository.ArticleMapper;
import com.wjl.lblog.repository.TagMapper;
import com.wjl.lblog.service.intf.TagService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
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
        return tagMapper.selectPage(page, null);
    }

    @Override
    public List<Tag> selectAll() {
        return tagMapper.selectList(null);
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
            newTag.setName(tag);
            var res = tagMapper.insert(newTag);
            return res == 1;
        } else {
            return false;
        }
    }

    @Override
    public boolean updateById(Long id, String tag) {
        var newTag = selectById(id);
        if (!Objects.isNull(newTag)) {
            if (!Objects.isNull(tag)) {
                newTag.setName(tag);
                newTag.setModifyTime(new Date());
                var res = tagMapper.updateById(newTag);
                return res == 1;
            } else {
                return false;
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
