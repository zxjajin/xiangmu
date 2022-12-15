//package com.ajin.spring5.config;
//
//import com.alibaba.druid.pool.DruidDataSource;
//import com.alibaba.druid.pool.DruidDataSourceFactory;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.datasource.DataSourceTransactionManager;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//
//import javax.sql.DataSource;
//import java.io.IOException;
//import java.io.InputStream;
//import java.util.Properties;
//
///**
// * @author ajin
// * @create 2022-10-25 23:46
// */
//@Configuration
//@ComponentScan(basePackages = "com.ajin")
//@EnableTransactionManagement //开启事务
//public class TxConfig {
//
//    //创建数据库连接池
//    @Bean
//    public DruidDataSource getDruiDataSource() throws Exception {
//        DruidDataSource dataSource = new DruidDataSource();
//        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
//        dataSource.setUrl("jdbc:mysql://localhost:3306/user_db?useUnicode=true&characterEncoding=utf8");
//        dataSource.setUsername("root");
//        dataSource.setPassword("123456");
//        return dataSource;
//    }
//    //创建JdbcTemplate对象
//    @Bean
//    public JdbcTemplate getJdbcTemplate(DataSource dataSource){
//        //到ioc容器中根据类型找到dataSource
//        JdbcTemplate jdbcTemplate = new JdbcTemplate();
//        //注入dataSource
//        jdbcTemplate.setDataSource(dataSource);
//
//        return jdbcTemplate;
//    }
//
//    //创建事务管理器
//    @Bean
//    public DataSourceTransactionManager getDataSourceTransactionManager(DataSource dataSource){
//        DataSourceTransactionManager transactionManager = new DataSourceTransactionManager();
//        transactionManager.setDataSource(dataSource);
//        return transactionManager;
//    }
//}
