package com.wjl.lblog.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wjl.lblog.model.dto.ArticleDto;
import com.wjl.lblog.model.entity.Article;
import com.wjl.lblog.model.entity.ArticleTag;
import com.wjl.lblog.model.entity.Category;
import com.wjl.lblog.model.entity.Tag;
import com.wjl.lblog.model.vo.ArticleDetailVo;
import com.wjl.lblog.model.vo.ArticleSummaryVo;
import com.wjl.lblog.repository.ArticleMapper;
import com.wjl.lblog.repository.ArticleTagMapper;
import com.wjl.lblog.repository.CategoryMapper;
import com.wjl.lblog.repository.TagMapper;
import com.wjl.lblog.service.intf.ArticleService;
import com.wjl.lblog.service.intf.ArticleTagService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 * @author: wjl
 * @date: 2021/9/13 21:58
 * @version: v1.0
 */
@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article>
        implements ArticleService {

    @Resource
    private ArticleMapper articleMapper;

    @Resource
    private CategoryMapper categoryMapper;

    @Resource
    private TagMapper tagMapper;

    @Resource
    private ArticleTagMapper articleTagMapper;

    @Resource
    private ArticleTagService articleTagService;

    @Override
    public IPage<ArticleDetailVo> selectDetailByPage(Page<ArticleDetailVo> page) {
        var res = articleMapper.selectDetailByPage(page);
        var records = res.getRecords();
        processTags(records);
        res.setRecords(records);
        return res;
    }

    @Override
    public List<ArticleDetailVo> selectDetailAll() {
        var res = articleMapper.selectDetailAll();
        processTags(res);
        return res;
    }

    @Override
    public ArticleDetailVo selectDetailById(Long id) {
        var res = articleMapper.selectDetailById(id);
        res.setId(id);
        processTag(res);
        return res;
    }

    @Override
    public IPage<ArticleSummaryVo> selectSummaryByPage(Page<ArticleSummaryVo> page) {
        return articleMapper.selectSummaryByPage(page);
    }

    @Override
    public List<ArticleSummaryVo> selectSummaryAll() {
        return articleMapper.selectSummaryAll();
    }

    @Override
    public ArticleSummaryVo selectSummaryById(Long id) {
        ArticleSummaryVo articleSummaryVo = articleMapper.selectSummaryById(id);
        if (!Objects.isNull(articleSummaryVo)) {
            return articleSummaryVo;
        }
        return null;
    }

    @Override
    public boolean add(ArticleDto articleDto) {
        if (!Objects.isNull(articleDto)) {
            // process category
            var article = processCategory(articleDto);
            var res = articleMapper.insert(article);
            // process tags
            var tags = articleDto.getTags();
            processArticleTag(article, tags);
            return res == 1;
        }
        return false;
    }

    @Override
    public boolean updateById(Long id, ArticleDto articleDto) {
        var article = articleMapper.selectById(id);
        if (!Objects.isNull(article)) {
            // process category
            article = processCategory(articleDto);
            article.setId(id);
            article.setModifyTime(new Date());
            var res = articleMapper.updateById(article);
            // process tags
            var tags = articleDto.getTags();
            articleTagService.deleteByAid(id);
            processArticleTag(article, tags);
            return res == 1;
        }
        return false;
    }

    @Override
    public boolean deleteById(Long id) {
        Article article = articleMapper.selectById(id);
        if (!Objects.isNull(article)) {
            var res = articleMapper.deleteById(id);
            articleTagService.deleteByAid(id);
            return res == 1;
        }
        return false;
    }

    private Article processCategory(ArticleDto articleDto) {
        var article = Article.builder()
                .title(articleDto.getTitle())
                .summary(articleDto.getSummary())
                .image(articleDto.getImage())
                .content(articleDto.getContent())
                .build();
        // query category by name
        var wrapper = new LambdaQueryWrapper<Category>();
        wrapper.eq(Category::getName, articleDto.getCategory());
        var category = categoryMapper.selectOne(wrapper);
        if (Objects.isNull(category)) {
            category = new Category();
            category.setName(articleDto.getCategory());
            categoryMapper.insert(category);
            wrapper.eq(Category::getName, category.getName());
            article.setCategoryId(categoryMapper.selectOne(wrapper).getId());
        } else {
            categoryMapper.updateById(category);
            article.setCategoryId(category.getId());
        }
        return article;
    }

    private void processTags(List<ArticleDetailVo> list) {
        for (var l : list) {
            processTag(l);
        }
    }

    private void processTag(ArticleDetailVo detailVo) {
        var tags = new ArrayList<String>();
        var aid = detailVo.getId();
        var tids = articleTagService.selectByAid(aid);
        for (var tid : tids) {
            var tag = tagMapper.selectById(tid).getName();
            tags.add(tag);
        }
        detailVo.setTags(tags);
    }

    private void processArticleTag(Article article, List<String> tags) {
        for (var tag : tags) {
            var wrapper = new LambdaQueryWrapper<Tag>();
            wrapper.eq(Tag::getName, tag);
            var res= tagMapper.selectOne(wrapper);
            if (Objects.isNull(res)) {
                var newTag = Tag.builder().name(tag).build();
                tagMapper.insert(newTag);
                wrapper.eq(Tag::getName, tag);
                res = newTag;
            }
            var articleTag = ArticleTag.builder()
                    .aid(article.getId())
                    .tid(res.getId()).build();
            articleTagMapper.insert(articleTag);
        }
    }

}
