package com.wjl.lblog.service.intf;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wjl.lblog.model.entity.Image;

import java.util.List;

/**
 * @author: wjl
 * @date: 2021/9/18 22:32
 * @version: v1.0
 */
public interface ImageService {

    List<Image> findAll();

    IPage<Image> findAllByPage(Page<Image> page);

    boolean add(Image image);

}
