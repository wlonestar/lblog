package com.wjl.lblog.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wjl.lblog.model.entity.ArticleTag;
import com.wjl.lblog.repository.ArticleTagMapper;
import com.wjl.lblog.service.intf.ArticleTagService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author: wjl
 * @time: 2022/4/24 19:35
 * @version: 1.0
 */
@Service
public class ArticleTagServiceImpl extends ServiceImpl<ArticleTagMapper, ArticleTag>
        implements ArticleTagService {

    @Resource
    private ArticleTagMapper articleTagMapper;

    @Override
    public List<Long> selectByAid(Long aid) {
        var wrapper = new LambdaQueryWrapper<ArticleTag>();
        wrapper.eq(ArticleTag::getAid, aid);
        var res = articleTagMapper.selectList(wrapper);
        var list = new ArrayList<Long>();
        for (var r : res) {
            var id = r.getTid();
            list.add(id);
        }
        return list;
    }

    @Override
    public List<Long> selectByTid(Long tid) {
        var wrapper = new LambdaQueryWrapper<ArticleTag>();
        wrapper.eq(ArticleTag::getTid, tid);
        var res = articleTagMapper.selectList(wrapper);
        var list = new ArrayList<Long>();
        for (var r : res) {
            var id = r.getAid();
            list.add(id);
        }
        return list;
    }

    @Override
    public boolean checkExistByAidAndTid(Long aid, Long tid) {
        var wrapper = new LambdaQueryWrapper<ArticleTag>();
        wrapper.eq(ArticleTag::getAid, aid).eq(ArticleTag::getTid, tid);
        var res = articleTagMapper.selectOne(wrapper);
        return !Objects.isNull(res);
    }

    @Override
    public boolean deleteByAid(Long aid) {
        var tids = selectByAid(aid);
        for (var tid : tids) {
            var wrapper = new LambdaQueryWrapper<ArticleTag>();
            wrapper.eq(ArticleTag::getTid, tid).eq(ArticleTag::getAid, aid);
            articleTagMapper.delete(wrapper);
        }
        return true;
    }

    @Override
    public boolean deleteByTid(Long tid) {
        var aids = selectByTid(tid);
        for (var aid : aids) {
            var wrapper = new LambdaQueryWrapper<ArticleTag>();
            wrapper.eq(ArticleTag::getTid, tid).eq(ArticleTag::getAid, aid);
            articleTagMapper.delete(wrapper);
        }
        return true;
    }

}
