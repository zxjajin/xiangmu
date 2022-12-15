package com.ajin.spring5.testdemo;

import com.ajin.spring5.bean.Emp;
import com.ajin.spring5.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ajin
 * @create 2022-10-04 16:29
 */
public class TestBean {


    @Test
    public void testbean1(){
        //1.加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");

        //2.获取配置文件对象
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();
    }
    @Test
    public void testbean2(){
        //1.加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");

        //2.获取配置文件对象
        Emp emp = context.getBean("emp", Emp.class);
       emp.test();
    }

}
