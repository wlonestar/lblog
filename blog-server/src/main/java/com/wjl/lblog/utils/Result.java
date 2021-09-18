package com.wjl.lblog.utils;

import com.wjl.lblog.constant.enums.ReturnCode;
import lombok.Data;

/**
 * @author: wjl
 * @date: 2021/9/13 20:42
 * @version: v1.0
 */
@Data
public class Result<T> {

    private int code;
    private String msg;
    private T data;

    public static <T> Result<T> success(T data) {
        Result<T> Result = new Result<>();
        Result.setCode(ReturnCode.RC200.getCode());
        Result.setMsg(ReturnCode.RC200.getMsg());
        Result.setData(data);
        return Result;
    }

    public static <T> Result<T> success(String msg) {
        Result<T> Result = new Result<>();
        Result.setCode(ReturnCode.RC200.getCode());
        Result.setMsg(msg);
        return Result;
    }

    public static <T> Result<T> fail(int code, String msg) {
        Result<T> Result = new Result<>();
        Result.setCode(code);
        Result.setMsg(msg);
        return Result;
    }

}

