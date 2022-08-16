package com.ssm.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ssm.mapper.EmployeeMapper;
import com.ssm.pojo.Employee;
import com.ssm.service.EmployeeService;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author 小红同学
 * @create 2022-08-13-21:29
 * @description
 */
@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public List<Employee> getAllEmployee() {
        return employeeMapper.getAllEmployee();
    }

    @Override
    public PageInfo<Employee> getEmployeePage(Integer pageNum) {
        //开启分页功能
        PageHelper.startPage(pageNum,4);
        List<Employee> list = employeeMapper.getAllEmployee();
        PageInfo<Employee> pageInfo = new PageInfo<>(list, 5);
        return pageInfo;
    }
}
