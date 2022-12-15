package com.ajin.spring5.a;

/**
 * @author ajin
 * @create 2022-10-02 23:19
 */
public class UserFactory {
    public static UserDao getDao(){
        return new UserDao();
    }
}
