package com.wjl.lblog.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wjl.lblog.model.entity.Image;
import com.wjl.lblog.repository.ImageMapper;
import com.wjl.lblog.service.intf.ImageService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: wjl
 * @date: 2021/9/18 22:34
 * @version: v1.0
 */
@Service
public class ImageServiceImpl extends ServiceImpl<ImageMapper, Image>
        implements ImageService {

    @Resource
    private ImageMapper imageMapper;

    @Override
    public List<Image> findAll() {
        var wrapper = new LambdaQueryWrapper<Image>();
        return imageMapper.selectList(wrapper);
    }

    @Override
    public IPage<Image> findAllByPage(Page<Image> page) {
        var wrapper = new LambdaQueryWrapper<Image>();
        return imageMapper.selectPage(page, wrapper);
    }

    @Override
    public boolean add(Image image) {
        var res = imageMapper.insert(image);
        return res == 1;
    }

}
