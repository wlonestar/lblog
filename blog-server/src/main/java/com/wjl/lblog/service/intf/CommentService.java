package com.wjl.lblog.service.intf;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.wjl.lblog.model.dto.CommentDto;
import com.wjl.lblog.model.entity.Comment;

import java.util.List;

/**
 * @author: wjl
 * @date: 2021/9/13 22:51
 * @version: v1.0
 */
public interface CommentService extends IService<Comment> {

    IPage<Comment> selectAllByPage(Page<Comment> page);

    List<Comment> selectAll();

    Comment selectById(Long id);

    boolean add(CommentDto commentDto);

    boolean deleteById(Long id);

}
