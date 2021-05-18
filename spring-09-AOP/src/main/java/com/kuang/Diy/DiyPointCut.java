package com.kuang.Diy;

/**
 * @author Willam_xh
 * @create 2021-05-18 16:25
 */
//其实aop就是将核心代码和非核心代码进行分离，在核心代码中切入非核心代码，主要项目中就是完成事物和日志的记录的
public class DiyPointCut {
    public void before(){
        System.out.println("======方法执行前======");
    }


    public void after(){
        System.out.println("=======方法执行后=====");
    }


}
