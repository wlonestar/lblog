package com.wjl.lblog.service.intf;

import com.wjl.lblog.model.entity.Image;

import java.util.List;

/**
 * @author: wjl
 * @date: 2021/9/18 22:32
 * @version: v1.0
 */
public interface ImageService {

    List<Image> findAll();

    Image add(Image image);

}
