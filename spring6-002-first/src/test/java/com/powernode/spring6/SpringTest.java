package com.powernode.spring6;

import com.powernode.spring6.bean.User;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SpringTest {

    @Test
    public void testLog4j2(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Logger logger = LoggerFactory.getLogger(SpringTest.class);//表示对SpringTest这个类进行日志记录
        logger.info("wo shi lao ba");
        logger.error("wo shi lao ba");
        logger.debug("wo shi lao ba");
    }




    @Test
    public void test(){
        //ApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring.xml");
        //spring容器是可以同时读取多个配置文件的
        //ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml","customer.xml");

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        /*User user = (User) applicationContext.getBean("user");
        System.out.println(user);

        Object customer = applicationContext.getBean("customer");
        System.out.println(customer);
*/      //如果bean不存在，不会返回null而是出现异常
        //Date date = (Date) applicationContext.getBean("date");
        //如果不想要进行一个强制类型转换，就需要像这样传两个参数
        Date date = applicationContext.getBean("date", Date.class);
        System.out.println(date);
        /*SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-ddd HH-mm-ss");*/
        //SimpleDateFormat simpleDateFormat = (SimpleDateFormat) applicationContext.getBean("format");
        SimpleDateFormat simpleDateFormat = applicationContext.getBean("format", SimpleDateFormat.class);
        String format = simpleDateFormat.format(date);
        System.out.println(format);
        //获取user对象
        User user = applicationContext.getBean("user", User.class);
        user.eat();
    }


}
