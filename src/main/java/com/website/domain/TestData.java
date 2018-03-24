package com.website.domain;

public class TestData {

    public static User getUser(){
        return new User("4901813","11111111");
    }

    public static User getUserFailPass(){
        return new User("840048","123123123");
    }

    public static User getUserNotTariff(){
        return new User("3428802","123123123");
    }

    public static User getInvalidUserNameInvalidPassword(){
        return new User("83428802","8123123123");
    }
}
