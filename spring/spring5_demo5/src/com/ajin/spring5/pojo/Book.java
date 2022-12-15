package com.ajin.spring5.pojo;

/**
 * @author ajin
 * @create 2022-10-23 23:37
 */
public class Book {
    private String userId;
    private String userName;
    private String ustatus;

    public Book() {
    }

    public Book(String userId, String userName, String ustatus) {
        this.userId = userId;
        this.userName = userName;
        this.ustatus = ustatus;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUstatus() {
        return ustatus;
    }

    public void setUstatus(String ustatus) {
        this.ustatus = ustatus;
    }

    @Override
    public String toString() {
        return "Book{" +
                "userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", ustatus='" + ustatus + '\'' +
                '}';
    }
}
