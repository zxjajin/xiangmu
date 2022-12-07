package com.ajin.service.Impl;

import com.ajin.mapper.NodeMapper;
import com.ajin.mapper.UserMapper;
import com.ajin.pojo.User;
import com.ajin.pojo.UserExample;
import com.ajin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ajin
 * @create 2022-11-16 1:17
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private NodeMapper nodeMapper;

    @Override
    public User getUser(Integer uid) {
        User user = userMapper.selectByPrimaryKey(uid);
        return user;
    }

    @Override
    public List<User> getAllUser() {

        List<User> userList = userMapper.selectByExample(null);
        System.out.println(userList);

        return userList;
    }

    @Override
    public List<User> getAllUser(Integer id) {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andIdNotEqualTo(id);
        List<User> userList = userMapper.selectByExample(userExample);
        System.out.println(userList);

        return userList;
    }


    @Override
    public User login(String name, String password) {
        UserExample example = new UserExample();
        example.createCriteria().andNameEqualTo(name).andPasswordEqualTo(password);
        List<User> users = userMapper.selectByExample(example);
        if (users == null || users.size()==0){
            return null;
        }
        return users.get(0);
    }

    @Override
    public void adduser(User user) {

        int insert = userMapper.insert(user);
        System.out.println("insert = " + insert);
    }

}
