package com.ajin.spring5.collectiontype;

import java.util.List;

/**
 * @author ajin
 * @create 2022-10-05 13:56
 */
public class Book {

    private List<String> list;

    public void setList(List<String> list){
        this.list = list;
    }

    public void test(){
        System.out.println(list);
    }
}
