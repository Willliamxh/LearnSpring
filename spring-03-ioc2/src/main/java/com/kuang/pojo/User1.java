package com.kuang.pojo;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * @author Willam_xh
 * @create 2021-05-06 15:41
 */
public class User1 {

    private String name;

//    public User() {
//        System.out.println("User 的无参构造函数");
//    }


    public User1() {
        System.out.println("user1 被创建了");
    }

    public User1(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println("name"+name);

    }
}
