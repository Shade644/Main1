package com.example.demo.model;


public class UserEntity {
    private String name;
    private int age;

    public UserEntity(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

}