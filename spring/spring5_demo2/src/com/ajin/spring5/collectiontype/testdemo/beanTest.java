package com.ajin.spring5.collectiontype.testdemo;

import com.ajin.spring5.autowire.Emp;
import com.ajin.spring5.bean.Orders;
import com.ajin.spring5.collectiontype.Book;
import com.ajin.spring5.collectiontype.Course;
import com.ajin.spring5.collectiontype.Stu;
import com.alibaba.druid.pool.DruidDataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ajin
 * @create 2022-10-05 2:01
 */
public class beanTest {

    @Test
    public void test1(){

        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Stu stu = context.getBean("stu", Stu.class);
        stu.test();
    }

    @Test
    public void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        Book book1 = context.getBean("book", Book.class);
        Book book2 = context.getBean("book", Book.class);
//        book.test();
        System.out.println("book1 = " + book1);
        System.out.println("book2 = " + book2);
        System.out.println(book1.equals(book2));
    }
    @Test
    public void test3(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");
        Course course = context.getBean("myBean", Course.class);
        System.out.println("course = " + course);
    }

    @Test
    public void testBean3(){
//        ApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");
        Orders orders = context.getBean("order", Orders.class);
        System.out.println("第四步 获取创建bean实例");
        System.out.println("orders = " + orders);

        //手动让bean实例销毁
//        ((ClassPathXmlApplicationContext) context).close();
        context.close();
    }
    @Test
    public void test4(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean5.xml");
        Emp emp = context.getBean("emp", Emp.class);
        System.out.println(emp);
    }
    @Test
    public void test5(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean6.xml");
        DruidDataSource dataSource = context.getBean("dataSource", DruidDataSource.class);
        System.out.println(dataSource);

    }
}
