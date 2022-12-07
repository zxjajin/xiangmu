package com.ajin.service;

import com.ajin.pojo.User;

import java.util.List;

/**
 * @author ajin
 * @create 2022-11-16 1:15
 */
public interface UserService {

    //根据id查询
    User getUser(Integer uid);

    //查询所有数据
    List<User> getAllUser();
    //查询自己的好友
    List<User> getAllUser(Integer id);

    //登录
    User login(String name,String password);

//    void ajin(String name,String pw);
    //注册
    void adduser(User user);

}
