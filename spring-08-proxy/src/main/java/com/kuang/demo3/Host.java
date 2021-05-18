package com.kuang.demo3;



/**
 * @author Willam_xh
 * @create 2021-05-17 15:23
 */
//真实角色：被代理的角色
//房东 真实角色 是要去出租房子
public class Host implements Rent {
    public void rent() {
        System.out.println("房东要出租房子");
    }
}
