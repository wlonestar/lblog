package com.wjl.lblog.constant.enums;

import lombok.Getter;

/**
 * 返回码
 *
 * @author: wjl
 * @date: 2021/9/13 20:40
 * @version: v1.0
 */
@Getter
public enum ReturnCode {

    RC200(200, "success"),
    RC400(400, "fail");

    private final int code;
    private final String msg;

    ReturnCode(int code, String msg){
        this.code = code;
        this.msg = msg;
    }

}
