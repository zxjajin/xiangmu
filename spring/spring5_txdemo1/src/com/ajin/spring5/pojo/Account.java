package com.ajin.spring5.pojo;

/**
 * @author ajin
 * @create 2022-10-25 20:05
 */
public class Account {
    private String id;
    private String userName;
    private String money;

    public Account() {
    }

    public Account(String id, String userName, String money) {
        this.id = id;
        this.userName = userName;
        this.money = money;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", userName='" + userName + '\'' +
                ", money='" + money + '\'' +
                '}';
    }
}
