package com.wjl.lblog.service.intf;

import com.wjl.lblog.model.entity.Link;

import java.util.List;

/**
 * @author: wjl
 * @date: 2021/9/27 10:54
 * @version: v1.0
 */
public interface LinkService {

    List<Link> findAll();

}
