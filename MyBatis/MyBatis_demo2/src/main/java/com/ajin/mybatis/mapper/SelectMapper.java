package com.ajin.mybatis.mapper;

import com.ajin.mybatis.pojo.User;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @author ajin
 * @create 2022-11-08 23:34
 */
public interface SelectMapper {

    /**
     * 根据id查询
     */
    User getUser(@Param("id") Integer id);

    /**
     * 查询所有的用户信息
     */
    List<User> getAllUser();

    /**
     * 查询用户的总记录数
     */
    Integer getCount();

    /**
     * 根据id查询用户信息为一个map集合
     */
    Map<String,Object> getUserByIdToMap(@Param("id") Integer id);

    /**
     * 查询所有用户信息为map集合
     */
//    List<Map<String,Object>> getAllUserTOMap();
    @MapKey("id")
    Map<String,Object> getAllUserTOMap();
}
