package com.ajin.spring5.testdemo;

import com.ajin.spring5.Book;
import com.ajin.spring5.Orders;
import com.ajin.spring5.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ajin
 * @create 2022-10-02 22:16
 */
public class TestSpring5 {

    @Test
    public void testAdd(){
        //1.加载spring配置文件
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");

        //2.获取配置创建的对象
        User user = context.getBean("user", User.class);
        System.out.println(user);
        user.add();
    }

    @Test
    public void testbook(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Book book = context.getBean("book", Book.class);
        book.test();
    }

    @Test
    public void Oders(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Orders orders = context.getBean("orders", Orders.class);
        System.out.println("orders = " + orders);
        orders.Test();
    }
}
