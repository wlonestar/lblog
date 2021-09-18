package com.wjl.lblog.controller;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.IdUtil;
import cn.hutool.core.util.StrUtil;
import com.wjl.lblog.model.entity.Image;
import com.wjl.lblog.service.intf.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.List;

import static com.wjl.lblog.constant.constnts.GlobalConstants.folder;
import static com.wjl.lblog.constant.constnts.GlobalConstants.ip;

/**
 * 图片
 *
 * @author: wjl
 * @date: 2021/9/16 14:23
 * @version: v1.0
 */
@RestController
@RequestMapping("/files")
public class ImageController {

    @Autowired
    private ImageService imageService;

    @Value("${server.port}")
    public String port;

    /**
     * 获取已上传的图片列表
     */
    @RequestMapping(method = RequestMethod.GET)
    public List<Image> getAll() {
        return imageService.findAll();
    }

    /**
     * 图片上传
     *
     * @param file
     */
    @RequestMapping(method = RequestMethod.POST)
    public String upload(MultipartFile file) throws IOException {
        String originalFilename = file.getOriginalFilename();
        String flag = IdUtil.fastSimpleUUID();
        String rootFilePath = folder + "/files/" + flag + "_" + originalFilename;
        FileUtil.writeBytes(file.getBytes(), rootFilePath);
        Image image = new Image();
        image.setName(originalFilename);
        image.setUrl(ip + ":" + port + "/files/" + flag);
        imageService.add(image);
        return ip + ":" + port + "/files/" + flag;
    }

    /**
     * 图片下载
     *
     * @param flag
     * @param response
     */
    @GetMapping("/{flag}")
    public void download(@PathVariable String flag, HttpServletResponse response) {
        OutputStream outputStream;
        String basePath = folder + "/files/";
        List<String> fileNames = FileUtil.listFileNames(basePath);
        String file = fileNames.stream().filter(name -> name.contains(flag)).findAny().orElse("");
        try {
            if (StrUtil.isNotEmpty(file)) {
                response.addHeader("Content-Disposition", "attachment;filename=" + URLEncoder.encode(file, StandardCharsets.UTF_8));
                response.setContentType("application/octet-stream");
                byte[] bytes = FileUtil.readBytes(basePath + file);
                outputStream = response.getOutputStream();
                outputStream.write(bytes);
                outputStream.flush();
                outputStream.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
