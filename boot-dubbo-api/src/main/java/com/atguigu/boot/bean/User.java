package com.atguigu.boot.bean;

import java.io.Serializable;

/**
 * Created by shuyan.qi on 2019/4/9.
 */
public class User implements Serializable {
    private static final long serialVersionUID = 6230859946278391216L;
    private String name;
    //0代表男、1代表女
    private int sex;
    private Integer age;
    private String phone;
    private String address;

    public User(String name, int sex, Integer age, String phone, String address) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.phone = phone;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getSex() {
        return sex;
    }

    public Integer getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
