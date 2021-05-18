package com.kuang.demo3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author Willam_xh
 * @create 2021-05-17 17:09
 */
public class ProxhyInvocationHandler implements InvocationHandler {
    private Rent rent;

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    public Object getProxy(){// 生成得到代理类
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),
                rent.getClass().getInterfaces(),this);
    }

    // 动态代理的本质，就是使用反射机制实现
    // 处理代理实例，并返回结果 执行真正执行的方法
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        seeHouse();
        Object result = method.invoke(rent,args);
        getFree();
        return  result;
    }

    public void seeHouse(){
        System.out.println("中介带看房子");
    }

    public void getFree(){
        System.out.println("收房租");
    }

}
