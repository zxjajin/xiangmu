package com.ajin.spring5.service;

import com.ajin.spring5.dao.UserDao;

/**
 * @author ajin
 * @create 2022-10-04 16:18
 */
public class UserService {

    //创建UserDao类型属性，生成set方法
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add(){
        System.out.println("service add.....");
        userDao.update();
    }
}
