package com.wjl.lblog.service.intf;

import com.wjl.lblog.model.entity.Timeline;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @author: wjl
 * @date: 2021/9/16 14:58
 * @version: v1.0
 */
public interface TimelineService {

    Page<Timeline> findAllByPage(Pageable pageable);

    List<Timeline> findAll();

    Timeline findById(Long id);

    Timeline add(Timeline idea);

    Timeline update(Long id, Timeline idea);

    Long deleteById(Long id);

    void deleteAll();

}
