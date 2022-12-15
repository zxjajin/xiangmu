package com.ajin.spring5.dao;

import com.ajin.spring5.pojo.Book;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author ajin
 * @create 2022-10-23 23:00
 */

public interface BookDao {
    //添加的方法
    void add(Book book);

    //删除方法
    void del(String id);

    //修改方法
    void update(Book book);

    //查询表记录数
    int selectCount();

    //查询返回对象
    Book findBookInfo(String id);

    //查询返回集合
    List<Book> findAllBook();

    //批量添加
    void batchAddBook(List<Object[]> bathArgs);

    //批量修改
    void batchUpdateBook(List<Object[]> batchArgs);

    //批量删除
    void batchDeleterBook(List<Object[]> batchArgs);
}
