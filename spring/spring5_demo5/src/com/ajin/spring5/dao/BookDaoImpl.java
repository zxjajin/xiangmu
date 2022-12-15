package com.ajin.spring5.dao;

import com.ajin.spring5.pojo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

/**
 * @author ajin
 * @create 2022-10-23 23:00
 */
@Repository
public class BookDaoImpl implements BookDao{

    //注入JdbcTemplate
    @Autowired
    @Qualifier("jdbcTemplate")
    private JdbcTemplate jdbcTemplate;


    //添加的方法
    @Override
    public void add(Book book) {
        //1.创建sql语句
        String sql = "insert into t_book value (?,?,?)";
        //2.调用方法实现
//        Object[] args = {book.getUserId(),book.getUserName(),book.getUstatus()};
        int update = jdbcTemplate.update(sql, book.getUserId(), book.getUserName(), book.getUstatus());
        System.out.println(update);
    }

    //删除
    @Override
    public void del(String id) {
        String sql = "delete from t_book where user_id = ?";
        int update = jdbcTemplate.update(sql, id);
        System.out.println(update);
    }

    //修改
    @Override
    public void update(Book book) {
        String sql = "update t_book set username = ?,ustatus = ? where user_id = ?";
        int update = jdbcTemplate.update(sql, book.getUserName(), book.getUstatus(), book.getUserId());
        System.out.println(update);
    }

    //查询表中有多少条数据
    @Override
    public int selectCount() {

        String sql = "select count(*) from t_book";

        Integer count = jdbcTemplate.queryForObject(sql, Integer.class);

        return count;
    }

    //查询单条记录
    @Override
    public Book findBookInfo(String id) {
        String sql = "select * from t_book where user_id = ?";
        //调用方法
        Book book = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Book>(Book.class),id);
        return book;
    }

    //查询多条记录
    @Override
    public List<Book> findAllBook() {
        String sql = "select * from t_book";
        List<Book> list = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Book>(Book.class));
        return list;
    }

    //批量添加
    @Override
    public void batchAddBook(List<Object[]> bathArgs) {
        String sql = "insert into t_book value(?,?,?)";
        int[] ints = jdbcTemplate.batchUpdate(sql, bathArgs);
        System.out.println(Arrays.toString(ints));
    }

    @Override
    public void batchUpdateBook(List<Object[]> batchArgs) {
        String sql = "update t_book set username = ?,ustatus = ? where user_id = ?";
        int[] ints = jdbcTemplate.batchUpdate(sql, batchArgs);
        System.out.println(Arrays.toString(ints));
    }

    @Override
    public void batchDeleterBook(List<Object[]> batchArgs) {
        String sql = "delete from t_book where user_id = ?";
        int[] ints = jdbcTemplate.batchUpdate(sql, batchArgs);
        System.out.println(Arrays.toString(ints));
    }
}
