package com.wjl.lblog.service.intf;

import com.wjl.lblog.model.entity.Image;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @author: wjl
 * @date: 2021/9/18 22:32
 * @version: v1.0
 */
public interface ImageService {

    List<Image> findAll();

    Page<Image> findAllByPage(Pageable pageable);

    Image add(Image image);

}
