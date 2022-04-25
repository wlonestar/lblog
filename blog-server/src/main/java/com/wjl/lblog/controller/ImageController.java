package com.wjl.lblog.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wjl.lblog.common.constants.MyResult;
import com.wjl.lblog.common.enums.MyHttpStatus;
import com.wjl.lblog.model.entity.Image;
import com.wjl.lblog.service.intf.FileService;
import com.wjl.lblog.service.intf.ImageService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.util.Objects;

/**
 * 图片接口
 *
 * @author: wjl
 * @date: 2021/9/16 14:23
 * @version: v1.0
 */
@RestController
@RequestMapping("/files")
public class ImageController {

    @Resource
    private ImageService imageService;

    @Resource
    private FileService fileService;

    /**
     * 获取已上传的图片列表
     */
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public MyResult<?> getAll() {
        var res = imageService.findAll();
        return MyResult.success(res);
    }

    /**
     * 分页查询
     *
     * @param page page
     * @param size size
     */
    @RequestMapping(value = "/page", method = RequestMethod.GET)
    public MyResult<?> findAllByPage(@RequestParam(name = "page", defaultValue = "1") int page,
                                     @RequestParam(name = "size", defaultValue = "10") int size) {
        var res = imageService.findAllByPage(new Page<>(page, size));
        return MyResult.success(res);
    }

    /**
     * 图片上传
     *
     * @param file file
     */
    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    @ResponseBody
    public MyResult<?> upload(@RequestParam(name = "file") MultipartFile file) {
        if (!Objects.isNull(file)) {
            Object object = fileService.fileUpload(file);
            Image image = new Image();
            image.setName(file.getOriginalFilename());
            image.setUrl(object.toString());
            imageService.add(image);
            return MyResult.success(object);
        } else {
            return MyResult.fail(MyHttpStatus.BAD_REQUEST.getCode(), "upload failed");
        }
    }

}
