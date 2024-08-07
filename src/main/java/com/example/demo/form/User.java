package com.example.demo.form;

public class User
{
    public String name;
    public String password;
    public String age;

    public User(String name, String password, String age) {

        this.name = name;
        this.password = password;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getAge() {
        return age;
    }
}
