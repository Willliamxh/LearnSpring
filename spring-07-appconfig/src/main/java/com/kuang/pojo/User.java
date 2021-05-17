package com.kuang.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author Willam_xh
 * @create 2021-05-17 9:37
 */
@Component  // 说明这个类被Spring接管了，注册到了容器中
public class User {
    private String name;

    public String getName() {
        return name;
    }

    @Value("shi-lin")   // 属性注入值
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }



}
