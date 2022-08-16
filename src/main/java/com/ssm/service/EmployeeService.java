package com.ssm.service;

import com.github.pagehelper.PageInfo;
import com.ssm.pojo.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 小红同学
 * @create 2022-08-13-21:27
 * @description
 */
@Service
public interface EmployeeService {

    /**
     * 查询所有员工信息
     * @return
     */
    List<Employee> getAllEmployee();

    /**
     *获取员工分页信息
     * @param pageNum
     * @return
     */
    PageInfo<Employee> getEmployeePage(Integer pageNum);
}
