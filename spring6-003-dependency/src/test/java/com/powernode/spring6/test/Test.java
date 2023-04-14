package com.powernode.spring6.test;

import com.powernode.spring6.bena.User;
import com.powernode.spring6.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    private UserService userService;

    @org.junit.Test
    public void test(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring.xml");
        UserService userService = classPathXmlApplicationContext.getBean("userService", UserService.class);
        userService.saveUser();
        userService.eat();
    }

    @org.junit.Test
    public void autoBasic(){
        ApplicationContext app= new ClassPathXmlApplicationContext("spring.xml");
        User user = app.getBean("user", User.class);
        System.out.println(user);

    }


}
