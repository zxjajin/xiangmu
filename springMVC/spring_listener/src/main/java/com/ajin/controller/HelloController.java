package com.ajin.controller;

import com.ajin.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author ajin
 * @create 2022-11-11 20:45
 */
@Controller
public class HelloController {

    @Autowired
    private HelloService helloService;
}
