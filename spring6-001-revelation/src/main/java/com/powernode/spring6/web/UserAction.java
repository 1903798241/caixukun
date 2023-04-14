package com.powernode.spring6.web;

import com.powernode.spring6.service.UserService;
import com.powernode.spring6.service.impl.UserServiceImpl;

public class UserAction {
    //创建service层对象
    private UserService userService = new UserServiceImpl();

    public void delete(){
        userService.deleteUser();
    }


}
