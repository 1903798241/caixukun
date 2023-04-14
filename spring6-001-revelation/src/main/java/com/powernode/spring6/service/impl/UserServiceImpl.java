package com.powernode.spring6.service.impl;

import com.powernode.spring6.dao.UserDao;
import com.powernode.spring6.dao.impl.UserDaoImplForMySql;
import com.powernode.spring6.service.UserService;

public class UserServiceImpl implements UserService {

    private UserDao userDao = new UserDaoImplForMySql();

    public void deleteUser() {
        //调用dao层
        userDao.deleteById();
    }
}
