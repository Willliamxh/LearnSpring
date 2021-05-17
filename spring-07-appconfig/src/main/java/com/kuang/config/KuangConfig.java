package com.kuang.config;

import com.kuang.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author Willam_xh
 * @create 2021-05-17 9:38
 */
//这个也会被Spring容器托管，注册到容器中，因为他本来就是一个@Component
// @Configuration代表这就是一个配置类，集合我们beans.xml一样
@Configuration
@ComponentScan("com.kuang.pojo")
@Import(KuangConfig2.class)
public class KuangConfig {
    // 注册一个bean，就相当于之前写的一个bean标签
    // 这个方法的名字就相当于bean标签中的id属性，方法的返回值就相当bean标签的class
    @Bean
    public User getUser(){
        return new User();//要返回要注入到bean的对象
    }

}
