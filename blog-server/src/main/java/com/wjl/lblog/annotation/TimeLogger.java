package com.wjl.lblog.annotation;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
import java.util.Date;

/**
 * @author: wjl
 * @time: 2022/4/24 14:33
 * @version: 1.0
 */
@Slf4j
@Aspect
@Component
public class TimeLogger {

    private Date begin;

    @Pointcut("@within(com.wjl.lblog.annotation.TimeLog)")
    public void logClass() {
    }

    @Pointcut("@within(com.wjl.lblog.annotation.TimeLogMethod)")
    public void logMethod() {
    }

    @Pointcut("@within(com.wjl.lblog.annotation.TimeNotLogMethod)")
    public void notLogMethod() {
    }

    @Before("(logClass() || logMethod()) && !notLogMethod()")
    public void adviceBefore(JoinPoint joinPoint) {
        begin = new Date();
        log.info("[{}()] --- begin --- {}", joinPoint.getSignature().getName(), begin.getTime());
    }

    @After("(logClass() || logMethod()) && !notLogMethod()")
    public void adviceAfter(JoinPoint joinPoint) {
        Date end = new Date();
        var res = (end.getTime() - begin.getTime()) / 1000.0;
        log.info("[{}()] --- end --- {}, cost {} s", joinPoint.getSignature().getName(), end.getTime(), res);
    }

    @AfterThrowing("(logClass() || logMethod()) && !notLogMethod()")
    public void adviceAfterThrowing(JoinPoint joinPoint) {
        log.error("[{}()] method run error", joinPoint.getSignature().getName());
    }

}
