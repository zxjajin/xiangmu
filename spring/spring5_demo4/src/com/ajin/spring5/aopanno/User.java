package com.ajin.spring5.aopanno;

import org.springframework.stereotype.Component;

/**
 * @author ajin
 * @create 2022-10-23 15:17
 */
//被增强的类
@Component
public class User {
    public void add(){
//        int i = 10/ 0;
        System.out.println("add.....");
    }
}
