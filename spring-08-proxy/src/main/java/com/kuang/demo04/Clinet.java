package com.kuang.demo04;

import com.kuang.demo02.UserService;
import com.kuang.demo02.UserServiceImpl;

/**
 * @author Willam_xh
 * @create 2021-05-18 10:05
 */
public class Clinet {
    public static void main(String[] args) {
        //真实角色
        UserServiceImpl userService=new UserServiceImpl();
        //代理角色：不存在
        ProxhyInvocationHandler phi = new ProxhyInvocationHandler();

        phi.setTarget(userService);//设置代理对象
        //动态生成代理类
        UserService proxy = (UserService) phi.getProxy();
        proxy.delete();

        proxy.add();


    }
}
