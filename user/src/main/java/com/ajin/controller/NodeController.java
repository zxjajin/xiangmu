package com.ajin.controller;

import com.ajin.pojo.User;
import com.ajin.service.NodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

/**
 * @author ajin
 * @create 2022-11-16 1:05
 */
@Controller
public class NodeController {

    @Autowired
    private NodeService nodeService;

    /**
     * 根据uid查询分页留言信息
     */
    @RequestMapping(value = "/node/page/{pageNum}",method = RequestMethod.GET)
    public String PageNode(Model model,@PathVariable("pageNum") Integer pageNum,User user){
        if (user.getId() == null){
            return "forward:/index?pageNum="+pageNum;
        }
        nodeService.getAllNode(model,pageNum,user);
        return "frientNode";
    }

    /**
     * 根据uid查询好友留言信息
     */
    @RequestMapping(value = "/node/{uid}",method = RequestMethod.GET)
    public String select(Model model,@PathVariable("uid") Integer uid,HttpSession session){
        nodeService.select(model,uid,session);
        return "frientNode";
    }

    /**
     * 返回自己留言页面
     */
    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String index(HttpSession session, Integer pageNum, Model model){
        nodeService.index(session,pageNum,model);
        return "index";
    }

    /**
     * 根据uid添加留言信息
     */
    @RequestMapping(value = "/node",method = RequestMethod.POST)
    public String addnode(Integer uid,String content){
        nodeService.addNode(uid,content);
        return "redirect:/index";
    }

    /**
     * 根据id删除留言信息
     */
    @RequestMapping(value = "/node/{id}",method = RequestMethod.DELETE)
    public String delete(@PathVariable Integer id){
        nodeService.delete(id);
        return "redirect:/index";
    }
}
