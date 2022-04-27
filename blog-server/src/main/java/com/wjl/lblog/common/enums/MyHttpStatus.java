package com.wjl.lblog.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 状态码
 *
 * @author: wjl
 * @date: 2021/9/13 20:40
 * @version: v1.0
 */
@Getter
@AllArgsConstructor
public enum MyHttpStatus {

    // Success
    OK(0, "OK"),

    QUERY_ERROR(1, "query error"),
    INSERT_ERROR(2, "insert error"),
    UPDATE_ERROR(3, "update error"),
    DELETE_ERROR(4, "delete error"),
    UPLOAD_ERROR(5, "upload error"),

    // --- Client Error ---
    BAD_REQUEST(400, "Bad Request"),
    // --- Server Error ---
    SERVER_ERROR(500, "Internal Server Error")
    ;

    private final int code;
    private final String msg;

}
