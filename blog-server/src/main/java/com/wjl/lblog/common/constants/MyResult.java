package com.wjl.lblog.common.constants;

import com.wjl.lblog.common.enums.MyHttpStatus;
import lombok.Data;

/**
 * @author: wjl
 * @date: 2021/9/13 20:42
 * @version: v1.0
 */
@Data
public class MyResult<T> {

    private int status;
    private String msg;
    private T data;

    public static <T> MyResult<T> success() {
        MyResult<T> result = new MyResult<>();
        result.setStatus(MyHttpStatus.OK.getCode());
        result.setMsg(MyHttpStatus.OK.getMsg());
        return result;
    }

    public static <T> MyResult<T> success(T data) {
        MyResult<T> result = new MyResult<>();
        result.setStatus(MyHttpStatus.OK.getCode());
        result.setMsg(MyHttpStatus.OK.getMsg());
        result.setData(data);
        return result;
    }

    public static <T> MyResult<T> success(T data, String msg) {
        MyResult<T> result = new MyResult<>();
        result.setStatus(MyHttpStatus.OK.getCode());
        result.setMsg(msg);
        result.setData(data);
        return result;
    }

    public static <T> MyResult<T> success(String msg) {
        MyResult<T> result = new MyResult<>();
        result.setStatus(MyHttpStatus.OK.getCode());
        result.setMsg(msg);
        return result;
    }

    public static <T> MyResult<T> fail(int status, String msg) {
        MyResult<T> result = new MyResult<>();
        result.setStatus(status);
        result.setMsg(msg);
        return result;
    }

}
