package com.ajin.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author ajin
 * @create 2022-11-02 22:10
 */
@Controller
public class UserController {

    /*
    *   使用RESTFul模拟用户的资源的增删改查
    *   /user   GET     查询所有用户信息
    *   /user/1   GET     根据用户id查询用户信息
    *   /user   POST     添加用户信息
    *   /user/1   DELETE     删除用户信息
    *   /user   PUT     修改用户信息
    */

    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public String getAllUser(){
        System.out.println("查询所有用户信息");
        return "success";
    }

    @RequestMapping(value = "/user/{id}",method = RequestMethod.GET)
    public String getUserById(@PathVariable Integer id){
        System.out.println("根据id查询用户信息"+id);
        return "success";
    }

    @RequestMapping(value = "/user",method = RequestMethod.POST)
    public String inserUser(String username,String password){
        System.out.println("添加用户信息："+username+","+password);
        return "success";
    }

    @RequestMapping(value = "/user",method = RequestMethod.PUT)
    public String updateUser(String username,String password){
        System.out.println("修改用户信息："+username+","+password);
        return "success";
    }

    @RequestMapping(value = "/user/{id}",method = RequestMethod.DELETE)
    public String deleteUser(@PathVariable Integer id){
        System.out.println("删除id为："+id+"的用户");
        return "success";
    }

}
