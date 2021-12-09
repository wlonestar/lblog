package com.wjl.lblog.service.intf;

import com.wjl.lblog.model.dto.TagDto;
import com.wjl.lblog.model.entity.Tag;
import com.wjl.lblog.model.vo.TagArticleVo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @author: wjl
 * @date: 2021/12/8 20:36
 * @version: v1.0
 */
public interface TagService {

    List<Tag> findAll();

    List<TagDto> findTagsByArticleId(Long aid);

    Page<Tag> findAllByPage(Pageable pageable);


    TagArticleVo findTagById(Long id, Pageable pageable);

    Tag findById(Long id);

    Tag findByName(String name);


    boolean add(Tag tag);

    boolean update(Long id, Tag tag);


    boolean deleteById(Long id);

}
