package com.wjl.lblog.controller;

import com.wjl.lblog.model.entity.Link;
import com.wjl.lblog.service.intf.LinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 友链
 *
 * @author: wjl
 * @date: 2021/9/27 10:55
 * @version: v1.0
 */
@RestController
@RequestMapping("/link")
public class LinkController {

    @Autowired
    private LinkService linkService;

    /**
     * 获取所有友链
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Link> findAll() {
        return linkService.findAll();
    }

}
