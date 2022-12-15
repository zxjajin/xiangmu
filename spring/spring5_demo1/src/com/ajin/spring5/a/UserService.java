package com.ajin.spring5.a;

/**
 * @author ajin
 * @create 2022-10-02 23:18
 */
public class UserService {
    public static void main(String[] args) {
        UserService user = new UserService();
        user.execute();
    }

    public void execute(){
//        UserDao userDao = new UserDao();
//        userDao.add();
        UserDao dao = UserFactory.getDao();
        dao.add();
    }
}
