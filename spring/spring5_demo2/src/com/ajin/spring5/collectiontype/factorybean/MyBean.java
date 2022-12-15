package com.ajin.spring5.collectiontype.factorybean;

import com.ajin.spring5.collectiontype.Course;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author ajin
 * @create 2022-10-05 14:21
 */
public class MyBean implements FactoryBean<Course> {

    //定义返回bean
    @Override
    public Course getObject() throws Exception {
        Course course = new Course();
        course.setCname("abc");
        return course;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }
    public boolean isSingleton() {
        return false;
    }
}

