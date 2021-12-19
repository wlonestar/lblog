package com.wjl.lblog.service.impl;

import com.wjl.lblog.model.entity.Image;
import com.wjl.lblog.repository.ImageRepository;
import com.wjl.lblog.service.intf.ImageService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: wjl
 * @date: 2021/9/18 22:34
 * @version: v1.0
 */
@Service
public class ImageServiceImpl implements ImageService {

    @Resource
    private ImageRepository imageRepository;

    @Override
    public List<Image> findAll() {
        return imageRepository.findAll();
    }

    @Override
    public Page<Image> findAllByPage(Pageable pageable) {
        return imageRepository.findAll(pageable);
    }

    @Override
    public Image add(Image image) {
        return imageRepository.save(image);
    }

}
