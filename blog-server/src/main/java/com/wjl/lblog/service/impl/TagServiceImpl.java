package com.wjl.lblog.service.impl;

import com.querydsl.core.QueryResults;
import com.querydsl.core.Tuple;
import com.wjl.lblog.component.QueryComponent;
import com.wjl.lblog.model.dto.TagDto;
import com.wjl.lblog.model.entity.*;
import com.wjl.lblog.model.vo.ArticleTitleVo;
import com.wjl.lblog.model.vo.TagArticleVo;
import com.wjl.lblog.repository.ArticleTagRepository;
import com.wjl.lblog.repository.TagRepository;
import com.wjl.lblog.service.intf.TagService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author: wjl
 * @date: 2021/12/8 20:56
 * @version: v1.0
 */
@Service
public class TagServiceImpl implements TagService {

    @Autowired
    private QueryComponent queryComponent;

    @Autowired
    private TagRepository tagRepository;

    @Autowired
    private ArticleTagRepository articleTagRepository;

    QTag qTag = QTag.tag;

    QArticle qArticle = QArticle.article;

    QArticleTag qArticleTag = QArticleTag.articleTag;

    @Override
    public List<Tag> findAll() {
        return tagRepository.findAll();
    }

    @Override
    public List<TagDto> findTagsByArticleId(Long aid) {
        List<ArticleTag> articleTags = articleTagRepository.findArticleTagsByAid(aid);
        List<TagDto> tags = new ArrayList<>();
        for (ArticleTag articleTag : articleTags) {
            Tag tag = tagRepository.findTagById(articleTag.getTid());
            TagDto tagDto = new TagDto(tag.getId(), tag.getName());
            tags.add(tagDto);
        }
        return tags;
    }

    @Override
    public Page<Tag> findAllByPage(Pageable pageable) {
        return tagRepository.findAll(pageable);
    }

    @Override
    public TagArticleVo findTagById(Long id, Pageable pageable) {
        Tag tag = tagRepository.findTagById(id);
        if (!Objects.isNull(tag)) {
            TagArticleVo tagArticleVo = new TagArticleVo();
            BeanUtils.copyProperties(tag, tagArticleVo);
            QueryResults<Tuple> queryResults = queryComponent.queryFactory()
                    .select(
                            qArticle.id,
                            qArticle.createTime,
                            qArticle.title
                    )
                    .from(qArticle, qTag, qArticleTag)
                    .where(qArticleTag.tid.eq(id)
                            .and(qArticleTag.tid.eq(qTag.id))
                            .and(qArticleTag.aid.eq(qArticle.id))
                    )
                    .orderBy(qArticle.createTime.desc())
                    .offset(pageable.getOffset())
                    .limit(pageable.getPageSize())
                    .fetchResults();
            List<Tuple> tuples = queryResults.getResults();
            List<ArticleTitleVo> articleTitleVos = new ArrayList<>();
            for (Tuple tuple : tuples) {
                ArticleTitleVo articleTitleVo = new ArticleTitleVo();
                articleTitleVo.setId(tuple.get(qArticle.id));
                articleTitleVo.setArticleTime(tuple.get(qArticle.createTime));
                articleTitleVo.setTitle(tuple.get(qArticle.title));
                articleTitleVos.add(articleTitleVo);
            }
            tagArticleVo.setArticles(new PageImpl<>(articleTitleVos, pageable, queryResults.getTotal()));
            return tagArticleVo;
        }
        return null;
    }

    @Override
    public Tag findById(Long id) {
        Tag tag = tagRepository.findTagById(id);
        if (!Objects.isNull(tag)) {
            return tag;
        }
        return null;
    }

    @Override
    public Tag findByName(String name) {
        Tag tag = tagRepository.findTagByName(name);
        if (!Objects.isNull(tag)) {
            return tag;
        }
        return null;
    }

    @Override
    public boolean add(Tag tag) {
        if (!Objects.isNull(tag)) {
            if (Objects.isNull(findByName(tag.getName()))) {
                tagRepository.save(tag);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean update(Long id, Tag tag) {
        Tag tag1 = findById(id);
        if (!Objects.isNull(tag1)) {
            BeanUtils.copyProperties(tag, tag1, "id", "createTime", "updateTime");
            tagRepository.save(tag1);
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteById(Long id) {
        Tag tag = findById(id);
        if (!Objects.isNull(tag)) {
            tagRepository.deleteById(id);
            return true;
        }
        return false;
    }

}
