package com.ajin.spring5.autowire;

/**
 * @author ajin
 * @create 2022-10-06 0:48
 */
public class Emp {
    private Dept dept;


    public void setDept(Dept dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "dept=" + dept +
                '}';
    }
    public void test(){
        System.out.println(dept);
    }
}
