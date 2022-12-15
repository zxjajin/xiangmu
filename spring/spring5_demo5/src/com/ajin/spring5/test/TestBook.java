package com.ajin.spring5.test;

import com.ajin.spring5.pojo.Book;
import com.ajin.spring5.service.BookService;
import com.alibaba.druid.pool.DruidDataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ajin
 * @create 2022-10-23 23:54
 */
public class TestBook {
    @Test
    public void testJdbcTemplate(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        //添加操作
//        Book book = new Book();
//        book.setUserId("5");
//        book.setUserName("aef");
//        book.setUstatus("aeaf");
//        bookService.addBook(book);
//        bookService.del(1);
        //修改操作
        bookService.update(new Book("2","xiaobai","aaa"));
        //查询表中数据条数
//        int count = bookService.findCount();
//        System.out.println("count = " + count);
        //查询表中一条数据
//        Book one = bookService.findOne("2");
//        System.out.println(one);
        //查询多条数据
//        List<Book> all = bookService.findAll();
//        for (Book book : all) {
//            System.out.println(book);
//        }
        //批量添加
//        List<Object[]> batchArgs = new ArrayList<>();
//        Object[] o1 = {"9","fae","fae"};
//        Object[] o2 = {"7","aefgtg","fae"};
//        Object[] o3 = {"8","hgrahhgr","fae"};
//        batchArgs.add(o1);
//        batchArgs.add(o2);
//        batchArgs.add(o3);
//        //调用批量添加
//        bookService.batchAdd(batchArgs);

//        //批量修改
//        List<Object[]> batchArgs = new ArrayList<>();
//        Object[] o1 = {"eafv","faefeaefaaaef","9"};
//        Object[] o2 = {"efagbb","fhtrae","7"};
//        Object[] o3 = {"xiaobai","ajin","8"};
//        batchArgs.add(o1);
//        batchArgs.add(o2);
//        batchArgs.add(o3);
//        //调用方法实现批量修改
//        bookService.batchUpdate(batchArgs);
        //批量删除
        List<Object[]> batchArgs = new ArrayList<>();
        Object[] o1 = {"9"};
        Object[] o2 = {"7"};
        batchArgs.add(o1);
        batchArgs.add(o2);
        //调用方法实现批量修改
        bookService.batchDelete(batchArgs);
    }
}
