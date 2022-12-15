package com.ajin.spring5.test;

import com.ajin.spring5.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author ajin
 * @create 2022-10-26 19:10
 */

@RunWith(SpringJUnit4ClassRunner.class)  //单元测试框架
@ContextConfiguration("classpath:bean1.xml") //加载配置文件
public class JTest4 {

    @Autowired
    private UserService userService;


    @Test
    public void test1(){
        userService.accountMoney();
    }

}
