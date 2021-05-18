package com.kuang.demo02;

/**
 * @author Willam_xh
 * @create 2021-05-17 16:04
 */
public class UserServiceProxy implements UserService{
    private UserService userService;

    //Spring 建议set方法注入
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void add() {
        log("add");
        userService.add();
    }

    public void delete() {
        log("delete");
        userService.delete();
    }

    public void update() {
        log("update");
        userService.update();
    }

    public void query() {
        log("query");
        userService.query();
    }

    //日志方法
    public void log(String massage){
        System.out.println("{debug}使用了"+massage+"方法");
    }

    //这样可以避免去修改原有的业务代码

}
