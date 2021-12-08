package com.wjl.lblog.common.enums;

/**
 * 返回码
 *
 * @author: wjl
 * @date: 2021/9/13 20:40
 * @version: v1.0
 */
public enum HttpStatus {

    OK(200, "success"),
    FAILED(400, "fail"),
    NOT_FOUND(404, "not found");

    private final int code;
    private final String msg;

    HttpStatus(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

}
