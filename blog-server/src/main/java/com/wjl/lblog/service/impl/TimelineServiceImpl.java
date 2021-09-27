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

    /**
     * 分页查询
     *
     * @param pageable
     */
    @Override
    public Page<Timeline> findAllByPage(Pageable pageable) {
        return timelineRepository.findAll(pageable);
    }

    /**
     * 查询所有
     */
    @Override
    public List<Timeline> findAll() {
        return timelineRepository.findAll();
    }

    /**
     * 根据 id 查询
     *
     * @param id
     */
    @Override
    public Timeline findById(Long id) {
        Timeline idea = timelineRepository.findById(id).orElseThrow();
        if (!Objects.isNull(idea)) {
            return idea;
        } else {
            return null;
        }
    }

    /**
     * 增加
     *
     * @param idea
     */
    @Override
    public Timeline add(Timeline idea) {
        return timelineRepository.save(idea);
    }

    /**
     * 更新
     *
     * @param id
     * @param idea
     */
    @Override
    public Timeline update(Long id, Timeline idea) {
        Timeline idea1 = timelineRepository.findById(id).orElseThrow();
        if (!Objects.isNull(idea1)) {
            idea1.setContent(idea.getContent());
            timelineRepository.save(idea1);
            return idea1;
        } else {
            return null;
        }
    }

    /**
     * 根据 id 删除
     *
     * @param id
     */
    @Override
    public Long deleteById(Long id) {
        Timeline idea = timelineRepository.findById(id).orElseThrow();
        if (!Objects.isNull(idea)) {
            timelineRepository.deleteById(id);
            return id;
        } else {
            return null;
        }
    }

    /**
     * 删除所有
     */
    @Override
    public void deleteAll() {
        timelineRepository.deleteAll();
    }
}
