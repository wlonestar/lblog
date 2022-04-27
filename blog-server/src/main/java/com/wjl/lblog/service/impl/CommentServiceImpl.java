package com.wjl.lblog.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wjl.lblog.model.dto.CommentDto;
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
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment>
        implements CommentService {

    @Resource
    private CommentMapper commentMapper;

    @Override
    public IPage<Comment> selectAllByPage(Page<Comment> page) {
        var wrapper = new LambdaQueryWrapper<Comment>();
        wrapper.orderByDesc(Comment::getCreateTime);
        return commentMapper.selectPage(page, wrapper);
    }

    @Override
    public List<Comment> selectAll() {
        var wrapper = new LambdaQueryWrapper<Comment>();
        wrapper.orderByDesc(Comment::getCreateTime);
        return commentMapper.selectList(wrapper);
    }

    @Override
    public Comment selectById(Long id) {
        Comment comment = commentMapper.selectById(id);
        if (!Objects.isNull(comment)) {
            return comment;
        } else {
            return null;
        }
    }

    @Override
    public boolean add(CommentDto commentDto) {
        if (!Objects.isNull(commentDto)) {
            var comment = Comment.builder()
                    .content(commentDto.getContent())
                    .username(commentDto.getUsername())
                    .avatar(commentDto.getAvatar())
                    .site(commentDto.getSite())
                    .email(commentDto.getEmail())
                    .build();
            var res = commentMapper.insert(comment);
            return res == 1;
        } else {
            return false;
        }
    }

    @Override
    public boolean deleteById(Long id) {
        var comment = commentMapper.selectById(id);
        if (!Objects.isNull(comment)) {
            var res = commentMapper.deleteById(id);
            return res == 1;
        } else {
            return false;
        }
    }

}
