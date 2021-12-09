package com.wjl.lblog.service.impl;

import com.wjl.lblog.model.entity.Timeline;
import com.wjl.lblog.repository.TimelineRepository;
import com.wjl.lblog.service.intf.TimelineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

/**
 * @author: wjl
 * @date: 2021/9/16 14:59
 * @version: v1.0
 */
@Service
public class TimelineServiceImpl implements TimelineService {

    @Autowired
    private TimelineRepository timelineRepository;

    @Override
    public Page<Timeline> findAllByPage(Pageable pageable) {
        return timelineRepository.findAll(pageable);
    }

    @Override
    public List<Timeline> findAll() {
        return timelineRepository.findAll();
    }

    @Override
    public Timeline findById(Long id) {
        Timeline idea = timelineRepository.findTimelineById(id);
        if (!Objects.isNull(idea)) {
            return idea;
        } else {
            return null;
        }
    }

    @Override
    public Timeline add(Timeline idea) {
        return timelineRepository.save(idea);
    }

    @Override
    public Timeline update(Long id, Timeline idea) {
        Timeline idea1 = timelineRepository.findTimelineById(id);
        if (!Objects.isNull(idea1)) {
            idea1.setContent(idea.getContent());
            timelineRepository.save(idea1);
            return idea1;
        } else {
            return null;
        }
    }

    @Override
    public Long deleteById(Long id) {
        Timeline idea = timelineRepository.findTimelineById(id);
        if (!Objects.isNull(idea)) {
            timelineRepository.deleteById(id);
            return id;
        } else {
            return null;
        }
    }

    @Override
    public void deleteAll() {
        timelineRepository.deleteAll();
    }

}
