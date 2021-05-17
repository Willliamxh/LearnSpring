package com.kuang.pojo;

/**
 * @author Willam_xh
 * @create 2021-05-06 14:59
 */
public class User {
    private String name;

//    public User() {
//        System.out.println("User 的无参构造函数");
//    }


//    public User() {
//    }

    public User(String name) {
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
