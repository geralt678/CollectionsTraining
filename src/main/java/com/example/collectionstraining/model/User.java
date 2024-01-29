package com.example.collectionstraining.model;

public class User {
    private String name;
    private int age;
    private Oem oem;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public User(String name, int age, Oem oem) {
        this.name = name;
        this.age = age;
        this.oem = oem;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Oem getOem() {
        return oem;
    }

    public void setOem(Oem oem) {
        this.oem = oem;
    }

    public void add20() {
        this.age += 20;
    }
}
