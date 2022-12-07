package com.ajin.service.Impl;

import com.ajin.mapper.NodeMapper;
import com.ajin.pojo.Node;
import com.ajin.pojo.NodeExample;
import com.ajin.pojo.User;
import com.ajin.service.NodeService;
import com.ajin.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

/**
 * @author ajin
 * @create 2022-11-16 1:17
 */
@Service
public class NodeServiceImpl implements NodeService {

    @Autowired
    private NodeMapper nodeMapper;

    @Autowired
    private UserService userService;

    /**
     * 根据uid查询用户留言信息
     * @param uid uid
     * @return 留言信息集合
     */
    @Override
    public List<Node> getAllNode(Integer uid) {
        NodeExample nodeExample = new NodeExample();
        nodeExample.createCriteria().andUidEqualTo(uid);
        List<Node> nodes = nodeMapper.selectByExample(nodeExample);
        return nodes;
    }

    @Override
    public PageInfo<Node> getPagingNode(Integer uid,Integer pageNum) {
        if (pageNum == null){
            pageNum = 1;
        }
        //开启分页功能
        PageHelper.startPage(pageNum,5);
        NodeExample nodeExample = new NodeExample();
        nodeExample.createCriteria().andUidEqualTo(uid);
        List<Node> nodes = nodeMapper.selectByExample(nodeExample);
        //获取分页相关数据
        PageInfo<Node> page = new PageInfo<>(nodes,5);
        return page;
    }

    @Override
    public void addNode(Integer uid,String content) {
        nodeMapper.insert(new Node(null,uid,content,new Date()));
    }

    @Override
    public void delete(Integer id) {
        nodeMapper.deleteByPrimaryKey(id);
    }

    //根据uid查看留言信息
    @Override
    public void getAllNode(Model model, Integer pageNum, User user) {
        PageInfo<Node> pagingNode = getPagingNode(user.getId(), pageNum);
        user = userService.getUser(user.getId());
        model.addAttribute("uid",user.getId());
        model.addAttribute("page",pagingNode);
        model.addAttribute("f",user);
        model.addAttribute("friend",pagingNode.getList());
    }

    @Override
    public void index(HttpSession session, Integer pageNum, Model model) {
        User user = (User) session.getAttribute("user");
        PageInfo<Node> pagingNode = getPagingNode(user.getId(), pageNum);
        model.addAttribute("page",pagingNode);
        user.setNodeList(pagingNode.getList());
        session.setAttribute("user",user);
    }

    @Override
    public void select(Model model, Integer uid, HttpSession session) {
        PageInfo<Node> pagingNode = getPagingNode(uid, null);
        User user = userService.getUser(uid);
        model.addAttribute("uid",uid);
        model.addAttribute("page",pagingNode);
        model.addAttribute("f",user);
        model.addAttribute("friend",pagingNode.getList());
    }

}
