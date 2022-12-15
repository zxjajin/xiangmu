package com.ajin.spring5.service;

import com.ajin.spring5.dao.BookDao;
import com.ajin.spring5.pojo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ajin
 * @create 2022-10-23 23:00
 */
@Service
public class BookService {

    //注入dao
    @Autowired
    private BookDao bookDao;

    //添加方法
    public void addBook(Book book){
        bookDao.add(book);
    }

    //删除方法
    public void del(String id){
        bookDao.del(id);
    }

    //修改方法
    public void update(Book book){
        bookDao.update(book);
    }

    //查询表记录数
    public int findCount(){
       return bookDao.selectCount();
    }

    //查询返回对象
    public Book findOne(String id){
        return bookDao.findBookInfo(id);
    }

    //查询返回集合
    public List<Book> findAll(){
        return bookDao.findAllBook();
    }

    //批量添加
    public void batchAdd(List<Object[]> bathArgs){
         bookDao.batchAddBook(bathArgs);
    }

    //批量修改
    public void batchUpdate(List<Object[]> batchArgs){
        bookDao.batchUpdateBook(batchArgs);
    }

    //批量删除
    public void batchDelete(List<Object[]> batchArgs){
        bookDao.batchDeleterBook(batchArgs);
    }
}
