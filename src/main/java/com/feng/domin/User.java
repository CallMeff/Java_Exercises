package com.feng.domin;

/**
 * @desc：用户
 * @title：User
 * @author: tianfengluyao
 * @date: 2018/9/27 16:24
 */
public class User{

    private String name;
    private int age;
    private int salary;

    public User() {
    }

    public User(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


}
