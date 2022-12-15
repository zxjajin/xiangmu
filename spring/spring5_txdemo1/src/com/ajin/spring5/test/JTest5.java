package com.ajin.spring5.test;

import com.ajin.spring5.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * @author ajin
 * @create 2022-10-26 19:10
 */

@SpringJUnitConfig(locations = "classpath:bean1.xml")  //单元测试框架
//@ContextConfiguration("classpath:bean1.xml") //加载配置文件
public class JTest5 {

    @Autowired
    private UserService userService;


    @Test
    public void test1(){
        userService.accountMoney();
    }

}
