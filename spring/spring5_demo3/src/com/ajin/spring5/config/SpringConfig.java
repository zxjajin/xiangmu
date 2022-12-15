package com.ajin.spring5.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author ajin
 * @create 2022-10-09 0:09
 */
@Configuration  //作为配置类，替代xml配置文件
@ComponentScan(basePackages = {"com.ajin"})
public class SpringConfig {
}
