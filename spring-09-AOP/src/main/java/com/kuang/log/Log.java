package com.kuang.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @author Willam_xh
 * @create 2021-05-18 15:07
 */
public class Log implements MethodBeforeAdvice {
    //method 要执行的目标对象的方法
    //object 参数
    //target 目标对象
    public void before(Method method, Object[] objects, Object target) throws Throwable {
        System.out.println(target.getClass().getName()+"的"+method.getName()+"被执行了");


    }
}
