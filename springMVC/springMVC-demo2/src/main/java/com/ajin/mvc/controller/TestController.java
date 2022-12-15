package com.ajin.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ajin
 * @create 2022-10-30 18:14
 */
@Controller
public class TestController {

    @RequestMapping("/")
    public String index(){
        return "index";
//        return "test_param";
    }
    @RequestMapping("/param")
    public String param(){
        return "test_param";
    }
}
