package com.kuang.demo02;

/**
 * @author Willam_xh
 * @create 2021-05-17 15:56
 */
public class Client {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
//        userService.add();

//        找代理去做
        UserServiceProxy proxy = new UserServiceProxy();
        proxy.setUserService(userService);
        proxy.add();


    }
}
