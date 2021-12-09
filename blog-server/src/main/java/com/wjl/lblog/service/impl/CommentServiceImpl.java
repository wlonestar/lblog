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

    @Override
    public Page<Comment> findAllByPage(Pageable pageable) {
        return commentRepository.findAll(pageable);
    }

    @Override
    public List<Comment> findAll() {
        return commentRepository.findAll();
    }

    @Override
    public Comment findById(Long id) {
        Comment comment = commentRepository.findCommentById(id);
        if (!Objects.isNull(comment)) {
            return comment;
        }
        return null;
    }

    @Override
    public Comment add(Comment comment) {
        return commentRepository.save(comment);
    }

    @Override
    public Comment update(Long id, Comment comment) {
        Comment comment1 = commentRepository.findCommentById(id);
        if (!Objects.isNull(comment1)) {
            comment1.setAvatar(comment.getAvatar());
            comment1.setContent(comment.getContent());
            comment1.setEmail(comment.getEmail());
            comment1.setSite(comment.getSite());
            commentRepository.save(comment1);
            return comment1;
        } else {
            return null;
        }
    }

    @Override
    public Long deleteById(Long id) {
        Comment comment = commentRepository.findCommentById(id);
        if (!Objects.isNull(comment)) {
            commentRepository.deleteById(id);
            return id;
        } else {
            return null;
        }
    }

    @Override
    public void deleteAll() {
        commentRepository.deleteAll();
    }

}
