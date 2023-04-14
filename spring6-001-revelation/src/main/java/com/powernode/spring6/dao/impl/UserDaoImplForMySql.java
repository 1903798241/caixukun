package com.powernode.spring6.dao.impl;

import com.powernode.spring6.dao.UserDao;

public class UserDaoImplForMySql implements UserDao {

    public void deleteById() {
        System.out.println("正在删除数据库的信息......");
    }

}
