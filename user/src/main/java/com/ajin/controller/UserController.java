package com.ajin.controller;

import com.ajin.pojo.Node;
import com.ajin.pojo.User;
import com.ajin.service.NodeService;
import com.ajin.service.UserService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author ajin
 * @create 2022-11-16 1:04
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private NodeService nodeService;

    //查询所有数据

    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public String getAllUser(Model model,HttpSession session){
        //判读是否登录
        User user = (User) session.getAttribute("user");
        if (user == null){
            model.addAttribute("error","您还没有登录，请先登录！");
            return "forward:/";
        }
        List<User> userList = userService.getAllUser(user.getId());
        model.addAttribute("userlist",userList);
        return "user";
    }

    //登录
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(String name, String password, HttpSession session,Model model,Integer pageNum){
        User user = userService.login(name, password);
        if (user == null){
            model.addAttribute("error","账号或密码不正确！请重新输入");
            //不能使用内部转发，因为在springmvc视图控制器的请求方式是get，使用内部转发此时方法请求是post
            return "login";
        }
        PageInfo<Node> pagingNode = nodeService.getPagingNode(user.getId(), pageNum);
        model.addAttribute("page",pagingNode);
        user.setNodeList(pagingNode.getList());
        session.setAttribute("user",user);
        return "index";
    }
    //注册
    @RequestMapping(value = "/user",method = RequestMethod.POST)
    public String adduser(User user){
        userService.adduser(user);
        return "redirect:/";
    }


}
