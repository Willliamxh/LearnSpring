package com.kuang.demo01;

/**
 * @author Willam_xh
 * @create 2021-05-17 15:25
 */

//客户：访问代理对象的人
public class Client {
    public static void main(String[] args) {
//        //我这边直接去找房东
//        Host host = new Host();
//        host.rent();
////        但是这里就有个问题就是我们去社会上找房子找不到 我们只能去找中介

    //房东现在不需要去自己租房子
        Host host = new Host();
    //把房东丢给我们的中介 中介帮房东租房子 但是中介代理角色一般会有一些附属操作
        Proxy proxy = new Proxy(host);

        //我们不用面对房东 直接找中介租房子
        proxy.rent();




    }
}
