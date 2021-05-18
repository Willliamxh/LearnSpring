package com.kuang.demo02;

/**
 * @author Willam_xh
 * @create 2021-05-17 15:54
 */
//我们去实现抽象角色的行为
public class UserServiceImpl implements UserService{
    public void add() {
//        System.out.println("使用了add 方法");//如果需要添加日志 我得把所有的部分都得添加一遍
        System.out.println("增加了一个用户");
    }

    public void delete() {
//        System.out.println("使用了add 方法");//如果需要添加日志 我得把所有的部分都得添加一遍
        System.out.println("删除了一个用户");
    }

    public void update() {
//        System.out.println("使用了add 方法");//如果需要添加日志 我得把所有的部分都得添加一遍
        System.out.println("更新了一个用户");
    }

    public void query() {
//        System.out.println("使用了query 方法");//如果需要添加日志 我得把所有的部分都得添加一遍
        System.out.println("修改了一个用户");
    }
}
