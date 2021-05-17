package com.kuang.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author Willam_xh
 * @create 2021-05-16 19:36
 */
//组件
@Component
@Scope("singleton")
public class User {

//    @Value("许晗_注解嵌入")
    public String name;

    @Value("许晗_注解嵌入")//或者是在这边注入
    public void setName(String name) {
        this.name = name;
    }


}
