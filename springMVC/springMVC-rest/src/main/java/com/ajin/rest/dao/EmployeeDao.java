package com.ajin.rest.dao;

import com.ajin.rest.bean.Employee;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @author ajin
 * @create 2022-11-03 15:09
 */
@Repository
public class EmployeeDao {

    private static Map<Integer, Employee> employees = null;

    static{
        employees = new HashMap<Integer, Employee>();

        employees.put(1001, new Employee(1001, "E-AA", "aa@163.com", 1));
        employees.put(1002, new Employee(1002, "E-BB", "bb@163.com", 1));
        employees.put(1003, new Employee(1003, "E-CC", "cc@163.com", 0));
        employees.put(1004, new Employee(1004, "E-DD", "dd@163.com", 0));
        employees.put(1005, new Employee(1005, "E-EE", "ee@163.com", 1));
    }

    private static Integer initId = 1006;

    /**
     * 增加或修改
     * @param employee 实体对象
     */
    public void save(Employee employee){
        if(employee.getId() == null){
            employee.setId(initId++);
        }
        employees.put(employee.getId(), employee);
    }

    /**
     * 查询所有数据
     * @return
     */
    public Collection<Employee> getAll(){
        return employees.values();
    }

    /**
     * 根据id查询
     * @param id
     * @return
     */
    public Employee get(Integer id){
        return employees.get(id);
    }

    /**
     * 根据id删除
     * @param id
     */
    public void delete(Integer id){
        employees.remove(id);
    }
}