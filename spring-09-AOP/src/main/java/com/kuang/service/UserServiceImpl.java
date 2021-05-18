package com.kuang.service;

/**
 * @author Willam_xh
 * @create 2021-05-18 15:00
 */
public class UserServiceImpl implements UserService {
    public void add() {
        System.out.println("增加了一个用户");
    }

    public void delete() {
        System.out.println("删除了一个用户");
    }

    public void update() {
        System.out.println("跟新了一个用户");
    }

    public void query() {
        System.out.println("查询了一个用户");
    }
}
