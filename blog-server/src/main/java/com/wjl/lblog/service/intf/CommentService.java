package com.wjl.lblog.service.intf;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.wjl.lblog.model.entity.Comment;

import java.util.List;

/**
 * @author: wjl
 * @date: 2021/9/13 22:51
 * @version: v1.0
 */
public interface CommentService extends IService<Comment> {

    IPage<Comment> findAllByPage(Page<Comment> page);

    List<Comment> findAll();

    Comment findById(Long id);

    boolean add(Comment comment);

    boolean update(Long id, Comment comment);

    boolean deleteById(Long id);

}
