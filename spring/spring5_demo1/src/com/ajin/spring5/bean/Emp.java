package com.ajin.spring5.bean;

/** 员工类
 * @author ajin
 * @create 2022-10-04 19:44
 */
public class Emp {
    private String ename;
    private String gender;
    //员工属于某一个部门，使用对象形式表示
    private Dept dept;
    //生成dept的get方法
    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public void test(){
        System.out.println(ename+"::"+gender+"::"+dept);
    }
}
