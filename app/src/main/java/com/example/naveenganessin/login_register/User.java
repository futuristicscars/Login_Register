package com.example.naveenganessin.login_register;

/**
 * Created by naveenganessin on 30/9/15.
 */
public class User {
    String name, username, password;
    int age;

    public User(String name, int age, String username, String password){
        this.name = name;
        this.age = age;
        this.username = username;
        this.password = password;
    }
    public User(String username, String password){
        this.username = username;
        this.password = password;
        this.age = -1;
        this.name = "";
    }

}
