package com.wjl.lblog.service.impl;

import com.wjl.lblog.model.entity.Comment;
import com.wjl.lblog.repository.CommentRepository;
import com.wjl.lblog.service.intf.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

/**
 * @author: wjl
 * @date: 2021/9/13 21:58
 * @version: v1.0
 */
@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentRepository commentRepository;

    /**
     * 分页查询
     *
     * @param pageable
     */
    @Override
    public Page<Comment> findAllByPage(Pageable pageable) {
        return commentRepository.findAll(pageable);
    }

    /**
     * 查询所有
     */
    @Override
    public List<Comment> findAll() {
        return commentRepository.findAll();
    }

    /**
     * 根据 id 查询留言
     *
     * @param id
     */
    @Override
    public Comment findById(Long id) {
        return commentRepository.findById(id).orElseThrow();
    }

    /**
     * 增加留言
     *
     * @param comment
     */
    @Override
    public Comment add(Comment comment) {
        return commentRepository.save(comment);
    }

    /**
     * 更新留言
     *
     * @param id
     * @param comment
     */
    @Override
    public Comment update(Long id, Comment comment) {
        Comment comment1 = commentRepository.findById(id).orElseThrow();
        if (!Objects.isNull(comment1)) {
            comment1.setAvatar(comment.getAvatar());
            comment1.setContent(comment.getContent());
            comment1.setEmail(comment.getEmail());
            comment1.setNickname(comment.getNickname());
            comment1.setSite(comment.getSite());
            commentRepository.save(comment1);
            return comment1;
        } else {
            return null;
        }
    }

    /**
     * 根据 id 删除留言
     *
     * @param id
     */
    @Override
    public Long deleteById(Long id) {
        Comment comment = commentRepository.findById(id).orElseThrow();
        if (!Objects.isNull(comment)) {
            commentRepository.deleteById(id);
            return id;
        } else {
            return null;
        }
    }

    /**
     * 删除所有留言
     */
    @Override
    public void deleteAll() {
        commentRepository.deleteAll();
    }

}
