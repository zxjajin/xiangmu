package com.ajin.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ajin
 * @create 2022-11-02 20:03
 */
@Controller
public class JspController {

    @RequestMapping("/success")
    public String success(){
        return "success";
//        return "forward:/WEB-INF/templates/success.jsp";
        //重定向不能访问WEB-INF下面的目录：WEB-INF是Java的WEB应用的安全目录。所谓安全就是客户端无法访问，只有服务端可以访问的目录。
//        return "redirect:/WEB-INF/templates/success.jsp";
    }
}
