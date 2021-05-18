package com.kuang.demo04;

import com.kuang.demo3.Rent;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author Willam_xh
 * @create 2021-05-17 17:09
 */
public class ProxhyInvocationHandler implements InvocationHandler {
    //被代理的接口
    private Object target;

    public void setTarget(Object target) {
        this.target = target;
    }

    //生成代理类 传给它什么 他就生成什么
    public Object getProxy(){// 生成得到代理类
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),
                target.getClass().getInterfaces(),this);
    }


    // 处理代理实例，并返回结果 执行真正执行的方法  公式：代理谁 生成代理类 执行方法
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        log(method.getName());
        Object result = method.invoke(target,args);//这边是调用target接口的一些方法

        return  result;
    }

//    我们想添加一个日志的功能
    public void log(String massage){
        System.out.println("执行了"+massage+"的方法");
    }



}
