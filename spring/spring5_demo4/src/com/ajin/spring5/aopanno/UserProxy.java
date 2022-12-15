package com.ajin.spring5.aopanno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author ajin
 * @create 2022-10-23 15:17
 */
//增强的类
@Component
@Aspect //生成代理对象
@Order(3)
public class UserProxy {

    //相同的切入点抽取
    @Pointcut(value = "execution(* com.ajin.spring5.aopanno.User.add())")
    public void pointdemo(){

    }


    //前置通知
    //@Before注解表示作为前置通知
    @Before(value = "pointdemo()")
    public void before(){
        System.out.println("before....");
    }

    //后置通知(返回通知)
    @AfterReturning("pointdemo()")
    public void afterReturning(){
        System.out.println("afterReturning.....");
    }

    //最终通知
    @After("execution(* com.ajin.spring5.aopanno.User.add())")
    public void after(){
        System.out.println("after....");
    }

    //异常通知
    @AfterThrowing("execution(* com.ajin.spring5.aopanno.User.add())")
    public void afterThrowing(){
        System.out.println("afterThrowing.....");
    }
    //环绕通知
    @Around("execution(* com.ajin.spring5.aopanno.User.add())")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕之前....");
        //被增强方法执行
        proceedingJoinPoint.proceed();
        System.out.println("环绕之后.....");
    }


}
