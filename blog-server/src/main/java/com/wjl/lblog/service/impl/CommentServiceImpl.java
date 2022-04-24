package com.wjl.lblog.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wjl.lblog.model.entity.Comment;
import com.wjl.lblog.repository.CommentMapper;
import com.wjl.lblog.service.intf.CommentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Objects;

/**
 * @author: wjl
 * @date: 2021/9/13 21:58
 * @version: v1.0
 */
@Service
public class CommentServiceImpl implements CommentService {

    @Resource
    private CommentMapper commentMapper;

    @Override
    public IPage<Comment> findAllByPage(Page<Comment> page) {
        var wrapper = new LambdaQueryWrapper<Comment>();
        return commentMapper.selectPage(page, wrapper);
    }

    @Override
    public List<Comment> findAll() {
        var wrapper = new LambdaQueryWrapper<Comment>();
        return commentMapper.selectList(wrapper);
    }

    @Override
    public Comment findById(Long id) {
        Comment comment = commentMapper.selectById(id);
        if (!Objects.isNull(comment)) {
            return comment;
        }
        return null;
    }

    @Override
    public boolean add(Comment comment) {
        var res = commentMapper.insert(comment);
        return res == 1;
    }

    @Override
    public boolean update(Long id, Comment comment) {
        Comment comment1 = commentMapper.selectById(id);
        if (!Objects.isNull(comment1)) {
            comment1.setAvatar(comment.getAvatar());
            comment1.setContent(comment.getContent());
            comment1.setEmail(comment.getEmail());
            comment1.setSite(comment.getSite());
            var res = commentMapper.insert(comment1);
            return res == 1;
        } else {
            return false;
        }
    }

    @Override
    public boolean deleteById(Long id) {
        Comment comment = commentMapper.selectById(id);
        if (!Objects.isNull(comment)) {
            var res = commentMapper.deleteById(id);
            return res == 1;
        } else {
            return false;
        }
    }

}
