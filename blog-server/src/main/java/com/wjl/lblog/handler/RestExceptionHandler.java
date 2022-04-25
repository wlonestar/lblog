package com.wjl.lblog.handler;

import cn.dev33.satoken.exception.NotLoginException;
import com.wjl.lblog.common.enums.MyHttpStatus;
import com.wjl.lblog.common.constants.MyResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 全局异常处理
 *
 * @author: wjl
 * @date: 2021/9/13 20:45
 * @version: v1.0
 */
@Slf4j
@RestControllerAdvice
public class RestExceptionHandler {

    @ExceptionHandler(value = {Exception.class})
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR,
            code = HttpStatus.INTERNAL_SERVER_ERROR)
    public MyResult<String> exception(Exception e) {
        log.error("全局异常 {}", e.getMessage(), e);
        return MyResult.fail(MyHttpStatus.INTERNAL_SERVER_ERROR.getCode(),
                e.getMessage());
    }

    @ExceptionHandler(value = {NotLoginException.class})
    @ResponseStatus(value = HttpStatus.BAD_REQUEST, code = HttpStatus.BAD_REQUEST)
    public MyResult<?> satokenException(NotLoginException e) {
        log.error("认证异常 {}", e.getMessage(), e);
        return MyResult.fail(MyHttpStatus.BAD_REQUEST.getCode(),
                e.getMessage());
    }

}

