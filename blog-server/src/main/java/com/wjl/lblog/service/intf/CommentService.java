package com.wjl.lblog.service.intf;

import com.wjl.lblog.model.entity.Comment;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @author: wjl
 * @date: 2021/9/13 22:51
 * @version: v1.0
 */
public interface CommentService {

    Page<Comment> findAllByPage(Pageable pageable);

    List<Comment> findAll();

    Comment findById(Long id);

    Comment add(Comment comment);

    Comment update(Long id, Comment comment);

    Long deleteById(Long id);

    void deleteAll();

}
