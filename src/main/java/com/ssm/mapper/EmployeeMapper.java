package com.ssm.mapper;

import com.ssm.pojo.Employee;

import java.util.List;

/**
 * @author 小红同学
 * @create 2022-08-13-21:44
 * @description
 */
public interface EmployeeMapper {

    /**
     * 查询所有员工信息
     * @return
     */
    List<Employee> getAllEmployee();

    Integer count();
}
