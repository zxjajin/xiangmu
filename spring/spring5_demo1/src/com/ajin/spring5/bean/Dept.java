package com.ajin.spring5.bean;

/** 部门类
 * @author ajin
 * @create 2022-10-04 19:43
 */
public class Dept {

    private String dname;

    public void setDname(String dname) {
        this.dname = dname;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "dname='" + dname + '\'' +
                '}';
    }
}
