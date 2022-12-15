package com.ajin.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ajin
 * @create 2022-10-30 14:58
 */
@Controller
public class HelloController {

    // "/"-->/WEB-INF/templates/index.html

    @RequestMapping(value = "/")
    public String index(){
        //返回视图名称
        return "index";
    }
    @RequestMapping("/target")
    public String toTarget(){
        return "target";
    }
}
