package com.kuang.pojo;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Willam_xh
 * @create 2021-05-16 9:57
 */

public class People {
    @Autowired
    private Cat cat;//这边的前提是名字一样
    @Autowired
    private Dog dog;
    private String name;

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }
    @Autowired
    public Dog getDog() {//在这边也能注入
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "People{" +
                "cat=" + cat +
                ", dog=" + dog +
                ", name='" + name + '\'' +
                '}';
    }
}
