package com.ajin.mvc.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/** 异常处理
 * @author ajin
 * @create 2022-11-05 0:41
 */
//1.在类上使用@ControllerAdvice
@ControllerAdvice
public class ExceptionController {

    //2.在方法上 使用@ExceptionHandler
    @ExceptionHandler(value = {ArithmeticException.class,NullPointerException.class})
    public String testException(Exception ex, Model model){//加参数
        //保存错误信息到request作用域
        model.addAttribute("ex",ex);
        //返回到自定义错误页面error.html
        return "error";
    }
}
