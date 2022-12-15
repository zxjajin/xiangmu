package com.ajin.rest.controller;

import com.ajin.rest.bean.Employee;
import com.ajin.rest.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Collection;

/**
 * @author ajin
 * @create 2022-11-03 14:57
 */
@Controller
public class EmployeeController {

    @Autowired
    private EmployeeDao employeeDao;

    //查询所有用户
    @RequestMapping(value = "/employee",method = RequestMethod.GET)
    public ModelAndView getAllEmployee(){
        ModelAndView modelAndView = new ModelAndView();
        Collection<Employee> employeesList = employeeDao.getAll();
        modelAndView.addObject("employeesList",employeesList);
        modelAndView.setViewName("employee_list");

        return modelAndView;
    }

    //根据id删除
    @RequestMapping(value = "/employee/{id}",method = RequestMethod.DELETE)
    public String deleteEmployee(@PathVariable("id") Integer id){
            employeeDao.delete(id);
            return "redirect:/employee";
    }

    //添加
    @RequestMapping(value = "/employee",method = RequestMethod.POST)
    public String addEmployee(Employee employee){
        employeeDao.save(employee);

        return "redirect:/employee";

    }

    //根据id查询
    @RequestMapping(value = "/employee/{id}",method = RequestMethod.GET)
    public ModelAndView getAllEmployee(@PathVariable Integer id){
        ModelAndView modelAndView = new ModelAndView();
        Employee employee = employeeDao.get(id);
        modelAndView.addObject("employee",employee);
        modelAndView.setViewName("employee_update");
        return modelAndView;
    }

    //修改
    @RequestMapping(value = "/employee",method = RequestMethod.PUT)
    public String update(Employee employee){
        employeeDao.save(employee);
        return "redirect:/employee";
    }

}
