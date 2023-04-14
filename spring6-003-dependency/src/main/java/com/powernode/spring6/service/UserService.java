package com.powernode.spring6.service;

import com.powernode.spring6.dao.UserDao;

public class UserService {

    private UserDao userDao;

    //必须提供一个set方法，spring容器必须调用set方法
    /*public void setUserDao(UserDao userDao){
        this.userDao = userDao;
    }*/

    //使用构造方法注入
    public UserService(UserDao userDao){
        this.userDao=userDao;
    }


    public void saveUser(){
        userDao.insert();
    }


    public void eat(){
        userDao.eat();
    }

}
