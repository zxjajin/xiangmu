package com.ajin.spring5.aopanno;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author ajin
 * @create 2022-10-23 16:06
 */
@Component
@Aspect
@Order(1)
public class PersonProxy {

    //前置通知
    @Before("execution(* com.ajin.spring5.aopanno.User.add())")
    public void Person(){
        System.out.println("Person Before.....");
    }
}
