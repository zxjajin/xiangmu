package com.ajin.spring5;

/**
 * @author ajin
 * @create 2022-10-23 11:11
 */
public class UserDaoImpl implements UserDao {
    @Override
    public int add(int a, int b) {
        System.out.println("add方法执行了...");
        return a+b;
    }

    @Override
    public String update(String id) {
        System.out.println("update方法执行了....");
        return id;
    }
}
