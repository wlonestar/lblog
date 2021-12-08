package com.wjl.lblog.exception;

import com.wjl.lblog.common.enums.HttpStatus;
import com.wjl.lblog.common.constants.Result;
import lombok.extern.slf4j.Slf4j;
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

    @ExceptionHandler(Exception.class)
    @ResponseStatus(org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR)
    public Result<String> exception(Exception e) {
        log.error("全局异常信息 ex={}", e.getMessage(), e);
        return Result.fail(HttpStatus.FAILED.getCode(), e.getMessage());
    }

}

