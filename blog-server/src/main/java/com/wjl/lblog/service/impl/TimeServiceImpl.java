package com.wjl.lblog.service.impl;

import com.wjl.lblog.model.entity.Time;
import com.wjl.lblog.repository.TimeRepository;
import com.wjl.lblog.service.intf.TimeService;
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
public class TimeServiceImpl implements TimeService {

    @Autowired
    private TimeRepository timeRepository;

    /**
     * 分页查询
     *
     * @param pageable
     */
    @Override
    public Page<Time> findAllByPage(Pageable pageable) {
        return timeRepository.findAll(pageable);
    }

    /**
     * 查询所有
     */
    @Override
    public List<Time> findAll() {
        return timeRepository.findAll();
    }

    /**
     * 根据 id 查询
     *
     * @param id
     */
    @Override
    public Time findById(Long id) {
        Time idea = timeRepository.findById(id).orElseThrow();
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
    public Time add(Time idea) {
        return timeRepository.save(idea);
    }

    /**
     * 更新
     *
     * @param id
     * @param idea
     */
    @Override
    public Time update(Long id, Time idea) {
        Time idea1 = timeRepository.findById(id).orElseThrow();
        if (!Objects.isNull(idea1)) {
            idea1.setContent(idea.getContent());
            timeRepository.save(idea1);
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
        Time idea = timeRepository.findById(id).orElseThrow();
        if (!Objects.isNull(idea)) {
            timeRepository.deleteById(id);
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
        timeRepository.deleteAll();
    }
}
