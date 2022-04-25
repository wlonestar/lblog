package com.wjl.lblog.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 计算运行时间注解
 *
 * 添加注解到类前面，可计算类中所有方法的运行时间
 *
 * @author: wjl
 * @time: 2022/4/24 14:31
 * @version: 1.0
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface TimeLog {
}
