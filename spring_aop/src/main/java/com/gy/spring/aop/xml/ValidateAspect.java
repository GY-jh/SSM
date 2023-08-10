package com.gy.spring.aop.xml;

import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: GuYue
 * @Date: 2023/8/10 9:56
 * @Description:
 */
@Component
public class ValidateAspect {

    public void beforeMethod() {
        System.out.println("ValidateAspect-->前置通知");
    }

}
