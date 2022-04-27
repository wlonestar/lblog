package com.wjl.lblog.service.intf;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.wjl.lblog.model.dto.TimelineDto;
import com.wjl.lblog.model.entity.Timeline;

import java.util.List;

/**
 * @author: wjl
 * @date: 2021/9/16 14:58
 * @version: v1.0
 */
public interface TimelineService extends IService<Timeline> {

    IPage<Timeline> selectAllByPage(Page<Timeline> page);

    List<Timeline> selectAll();

    Timeline selectById(Long id);

    boolean add(TimelineDto timelineDto);

    boolean updateById(Long id, TimelineDto timelineDto);

    boolean deleteById(Long id);

}
