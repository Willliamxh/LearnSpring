package com.kuang.pojo;

/**
 * @author Willam_xh
 * @create 2021-05-24 14:45
 */
import lombok.Data;

@Data
public class User {
    private int id;
    private String name;
    private String pwd;


    public User() {
    }

    public User(int id, String name, String pwd) {

        this.id = id;
        this.name = name;
        this.pwd = pwd;
    }
}