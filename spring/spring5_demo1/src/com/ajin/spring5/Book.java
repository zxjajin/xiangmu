package com.ajin.spring5;

/**
 * 演示使用set方法进行注入属性
 * @author ajin
 * @create 2022-10-03 15:13
 */
public class Book {
    //创建属性
    private String bname;
    private String bauthor;
    private String address;
    //创建属性对应的set方法
    public void setBname(String bname) {
        this.bname = bname;
    }

    public void setBauthor(String bauthor) {
        this.bauthor = bauthor;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void test(){
        System.out.println(bname+"::"+bauthor+"::"+address);
    }
}
