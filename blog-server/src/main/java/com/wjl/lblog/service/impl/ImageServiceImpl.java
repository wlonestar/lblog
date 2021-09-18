package com.wjl.lblog.service.impl;

import com.wjl.lblog.model.entity.Image;
import com.wjl.lblog.repository.ImageRepository;
import com.wjl.lblog.service.intf.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: wjl
 * @date: 2021/9/18 22:34
 * @version: v1.0
 */
@Service
public class ImageServiceImpl implements ImageService {

    @Autowired
    private ImageRepository imageRepository;

    @Override
    public List<Image> findAll() {
        return imageRepository.findAll();
    }

    @Override
    public Image add(Image image) {
        return imageRepository.save(image);
    }

}
