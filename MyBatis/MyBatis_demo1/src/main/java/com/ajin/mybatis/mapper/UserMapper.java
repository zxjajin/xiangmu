package com.ajin.mybatis.mapper;

import com.ajin.mybatis.pojo.User;
import org.apache.ibatis.annotations.Insert;

import java.util.List;

/**
 * @author ajin
 * @create 2022-11-06 22:09
 */
public interface UserMapper {

    /**
     * MyBatis面向接口编程的两个一致：
     * 1.映射文件的namespace要和mapper接口的全类名保持一致
     * 2.映射文件中SQL语句的id要和mapper接口中的方法名一致
     *
     * 表--实体类--mapper接口--映射文件
     */

    /**
     * 添加用户信息
     */
    int insertUser();

    /**
     * 修改用户信息
     */
    void updateUser();

    /**
     * 删除用户信息
     */
    void deleteUser();

    /**
     * 根据id查询用户信息
     */
    User getUserById();

    /**
     * 查询用户信息
     */
    List<User> selectUser();
}
