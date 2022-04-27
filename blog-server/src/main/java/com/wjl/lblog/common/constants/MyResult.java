package com.wjl.lblog.common.constants;

import com.wjl.lblog.common.enums.MyHttpStatus;
import lombok.*;

/**
 * @author: wjl
 * @date: 2021/9/13 20:42
 * @version: v1.0
 */
@Data
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class MyResult<T> {

    private int status;
    private String msg;
    private T data;

    public static <T> MyResult<T> success() {
        return MyResult.<T>builder()
                .status(MyHttpStatus.OK.getCode())
                .msg(MyHttpStatus.OK.getMsg()).build();
    }

    public static <T> MyResult<T> success(T data) {
        return MyResult.<T>builder()
                .status(MyHttpStatus.OK.getCode())
                .msg(MyHttpStatus.OK.getMsg())
                .data(data).build();
    }

    public static <T> MyResult<T> success(T data, String msg) {
        return MyResult.<T>builder()
                .status(MyHttpStatus.OK.getCode())
                .msg(msg)
                .data(data).build();
    }

    public static <T> MyResult<T> success(String msg) {
        return MyResult.<T>builder()
                .status(MyHttpStatus.OK.getCode())
                .msg(msg).build();
    }

    public static <T> MyResult<T> fail(int status, String msg) {
        return MyResult.<T>builder()
                .status(status)
                .msg(msg).build();
    }

    public static <T> MyResult<T> fail(MyHttpStatus httpStatus) {
        return MyResult.<T>builder()
                .status(httpStatus.getCode())
                .msg(httpStatus.getMsg())
                .build();
    }

}
