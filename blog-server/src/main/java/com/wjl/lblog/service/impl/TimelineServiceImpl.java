package com.wjl.lblog.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wjl.lblog.model.dto.TimelineDto;
import com.wjl.lblog.model.entity.Timeline;
import com.wjl.lblog.repository.TimelineMapper;
import com.wjl.lblog.service.intf.TimelineService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Objects;

/**
 * @author: wjl
 * @date: 2021/9/16 14:59
 * @version: v1.0
 */
@Service
public class TimelineServiceImpl extends ServiceImpl<TimelineMapper, Timeline>
        implements TimelineService {

    @Resource
    private TimelineMapper timelineMapper;

    @Override
    public IPage<Timeline> selectAllByPage(Page<Timeline> page) {
        var wrapper = new LambdaQueryWrapper<Timeline>();
        wrapper.orderByDesc(Timeline::getCreateTime);
        return timelineMapper.selectPage(page, wrapper);
    }

    @Override
    public List<Timeline> selectAll() {
        var wrapper = new LambdaQueryWrapper<Timeline>();
        wrapper.orderByDesc(Timeline::getCreateTime);
        return timelineMapper.selectList(wrapper);
    }

    @Override
    public Timeline selectById(Long id) {
        var timeline = timelineMapper.selectById(id);
        if (!Objects.isNull(timeline)) {
            return timeline;
        } else {
            return null;
        }
    }

    @Override
    public boolean add(TimelineDto timelineDto) {
        var timeline = Timeline.builder()
                .title(timelineDto.getTitle())
                .content(timelineDto.getContent())
                .build();
        var res = timelineMapper.insert(timeline);
        return res == 1;
    }

    @Override
    public boolean updateById(Long id, TimelineDto timelineDto) {
        var timeline = timelineMapper.selectById(id);
        if (!Objects.isNull(timeline)) {
            timeline.setContent(timelineDto.getContent());
            timeline.setTitle(timelineDto.getTitle());
            var res = timelineMapper.updateById(timeline);
            return res == 1;
        } else {
            return false;
        }
    }

    @Override
    public boolean deleteById(Long id) {
        var idea = timelineMapper.selectById(id);
        if (!Objects.isNull(idea)) {
            var res = timelineMapper.deleteById(id);
            return res == 1;
        } else {
            return false;
        }
    }

}
