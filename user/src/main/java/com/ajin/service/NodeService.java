package com.ajin.service;

import com.ajin.pojo.Node;
import com.ajin.pojo.User;
import com.github.pagehelper.PageInfo;
import org.springframework.ui.Model;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author ajin
 * @create 2022-11-16 1:16
 */

public interface NodeService {

    /**
     * 根据uid查询所有留言信息
     */
    List<Node> getAllNode(Integer uid);
    //根据userid查询留言进行分页查询
    PageInfo<Node> getPagingNode(Integer uid,Integer pageNum);
    //根据uid添加留言信息
    void addNode(Integer uid,String content);
    //根据id删除留言信息
    void delete(Integer id);


    /**
     * 根据uid查询分页留言信息并保存对应信息到作用域
     */
    void getAllNode(Model model,Integer pageNum, User user);
    /**
     * 返回自己留言页面
     */
    void index(HttpSession session, Integer pageNum, Model model);

    //查询好友留言
    void select(Model model,Integer uid,HttpSession session);
}
