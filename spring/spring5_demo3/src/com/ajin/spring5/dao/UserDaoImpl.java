package com.ajin.spring5.dao;

import org.springframework.stereotype.Repository;

/**
 * @author ajin
 * @create 2022-10-08 23:13
 */
@Repository("userDaompl1")
public class UserDaoImpl implements UserDao{

    @Override
    public void add() {
        System.out.println("dao add.....");
    }
}
