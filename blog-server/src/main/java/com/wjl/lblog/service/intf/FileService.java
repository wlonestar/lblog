package com.wjl.lblog.service.intf;

import org.springframework.web.multipart.MultipartFile;

/**
 * @author: wjl
 * @date: 2021/12/8 20:38
 * @version: v1.0
 */
public interface FileService {

    String fileUpload(MultipartFile file);

}
