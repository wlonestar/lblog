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

    /**
     * 分页查询
     */
    Page<Comment> findAllByPage(Pageable pageable);

    /**
     * 查询所有
     */
    List<Comment> findAll();

    /**
     * 根据 id 查询
     */
    Comment findById(Long id);

    /**
     * 增加
     */
    Comment add(Comment comment);

    /**
     * 更新
     */
    Comment update(Long id, Comment comment);

    /**
     * 根据 id 删除
     */
    Long deleteById(Long id);

    /**
     * 删除所有
     */
    void deleteAll();

}
