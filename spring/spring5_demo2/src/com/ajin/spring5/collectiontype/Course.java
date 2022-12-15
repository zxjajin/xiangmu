package com.ajin.spring5.collectiontype;

/**课程类
 * @author ajin
 * @create 2022-10-05 13:45
 */
public class Course {
    private String cname;//课程名称
    public void setCname(String cname){
        this.cname = cname;
    }

    @Override
    public String toString() {
        return "Course{" +
                "cname='" + cname + '\'' +
                '}';
    }
}
