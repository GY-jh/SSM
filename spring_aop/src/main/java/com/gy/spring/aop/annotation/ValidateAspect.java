package com.gy.spring.aop.annotation;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: GuYue
 * @Date: 2023/8/10 9:56
 * @Description:
 */
@Component
@Aspect
@Order(1)
public class ValidateAspect {

    // @Before("execution(* com.gy.spring.aop.annotation.*.*(..))")
    @Before("com.gy.spring.aop.annotation.LoggerAspect.pointCut()")
    public void beforeMethod() {
        System.out.println("ValidateAspect-->前置通知");
    }

}
