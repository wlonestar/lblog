package com.wjl.lblog.service.impl;

import com.wjl.lblog.model.entity.Link;
import com.wjl.lblog.repository.LinkRepository;
import com.wjl.lblog.service.intf.LinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: wjl
 * @date: 2021/9/27 10:54
 * @version: v1.0
 */
@Service
public class LinkServiceImpl implements LinkService {

    @Autowired
    private LinkRepository linkRepository;

    @Override
    public List<Link> findAll() {
        return linkRepository.findAll();
    }

}
