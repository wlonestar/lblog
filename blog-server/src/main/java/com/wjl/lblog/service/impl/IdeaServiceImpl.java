package com.wjl.lblog.service.impl;

import com.wjl.lblog.model.entity.Idea;
import com.wjl.lblog.repository.IdeaRepository;
import com.wjl.lblog.service.intf.IdeaService;
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
public class IdeaServiceImpl implements IdeaService {

    @Autowired
    private IdeaRepository ideaRepository;

    /**
     * 分页查询
     *
     * @param pageable
     */
    @Override
    public Page<Idea> findAllByPage(Pageable pageable) {
        return ideaRepository.findAll(pageable);
    }

    /**
     * 查询所有
     */
    @Override
    public List<Idea> findAll() {
        return ideaRepository.findAll();
    }

    /**
     * 根据 id 查询
     *
     * @param id
     */
    @Override
    public Idea findById(Long id) {
        Idea idea = ideaRepository.findById(id).orElseThrow();
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
    public Idea add(Idea idea) {
        return ideaRepository.save(idea);
    }

    /**
     * 更新
     *
     * @param id
     * @param idea
     */
    @Override
    public Idea update(Long id, Idea idea) {
        Idea idea1 = ideaRepository.findById(id).orElseThrow();
        if (!Objects.isNull(idea1)) {
            idea1.setContent(idea.getContent());
            ideaRepository.save(idea1);
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
        Idea idea = ideaRepository.findById(id).orElseThrow();
        if (!Objects.isNull(idea)) {
            ideaRepository.deleteById(id);
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
        ideaRepository.deleteAll();
    }
}
