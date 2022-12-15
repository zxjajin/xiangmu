package com.ajin.mvc.controller;

import com.ajin.mvc.bean.User;
import org.springframework.http.RequestEntity;
import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author ajin
 * @create 2022-11-04 15:41
 */
@Controller
public class HttpController {

    /**
     *
     * @param requestBody 请求体
     * @return
     */
    @RequestMapping("/testRequestBody")
    public String testRequestBody(@RequestBody String requestBody){
        System.out.println("requestBody:"+requestBody);
        return "success";
    }

    /**
     *
     * @param requestEntity 请求实体
     * @return
     */
    @RequestMapping("/testRequestEntity")
    public String testRequestEntity(RequestEntity<String> requestEntity){
        //当前requestEnity表示整个请求报文的信息
        System.out.println("请求头："+requestEntity.getHeaders());
        System.out.println("请求体："+requestEntity.getBody());
        return "success";
    }

    @RequestMapping("/testResponse")
    public void testResponse(HttpServletResponse response) throws IOException {
        response.getWriter().print("hello,response");
    }

    @RequestMapping("/testResponseBody")
    @ResponseBody
    public String testResponseBody(){
        return "success";
    }

    /**
     * @ResponseBody 响应到浏览器页面
     * @return User对象的JSON字符串
     */
    @RequestMapping("/testResponseUser")
    @ResponseBody
    public Object testResponseUser(){
        return new User(1001,"admin","123456",23,"男");
    }

    /**
     * 异步请求
     * @param username
     * @param password
     * @return
     */
    @RequestMapping("/testAxios")
    @ResponseBody
    public String testAxios(String username,String password){

        System.out.println(username+","+password);
        return "hello,axios";
    }
}
