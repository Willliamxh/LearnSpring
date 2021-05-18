package com.kuang.demo01;

/**
 * @author Willam_xh
 * @create 2021-05-17 15:28
 */
//代理角色：代理真实角色，代理真实角色后，一般会做一些附属操作
//    我代理角色也是需要去租房子的 所以我也得有租房子那个功能
public class Proxy implements Rent{

    private Host host;//组合的方式 我这边代理模式我也得找房东

    public Proxy() {
    }

    public Proxy(Host host) {
        this.host = host;
    }


    public void rent() {
//        System.out.println("代理调用了房东租房子");
        seeHouse();
        host.rent();
        getContract();
        getFree();

    }

    //看房子这个过程只能中介去做
    public void seeHouse(){
        System.out.println("中介带你看房子");
    }

    //收中介费用这个过程只能中介去做
    public void getFree(){
        System.out.println("中介带你去收租");
    }

    //中介签订租赁合同
    public void getContract(){
        System.out.println("中介签订租赁合同");
    }




}
