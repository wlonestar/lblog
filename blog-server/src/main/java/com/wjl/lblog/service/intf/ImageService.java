package com.wjl.lblog.service.intf;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.wjl.lblog.model.entity.Image;

import java.util.List;

/**
 * @author: wjl
 * @date: 2021/9/18 22:32
 * @version: v1.0
 */
public interface ImageService extends IService<Image> {

    IPage<Image> selectAllByPage(Page<Image> page);

    List<Image> selectAll();

    boolean add(Image image);

}
