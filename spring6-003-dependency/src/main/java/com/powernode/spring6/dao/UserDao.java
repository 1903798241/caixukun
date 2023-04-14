package com.powernode.spring6.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserDao {

    private static final Logger logger = LoggerFactory.getLogger(UserDao.class);

    public void insert(){
        logger.info("数据库正在保存数据信息...");
    }

    public void eat(){
        logger.info("wang ze yao jiu xi huang chi baba");
    }

}
