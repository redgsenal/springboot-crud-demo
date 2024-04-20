package com.springboot.demo.springbootcruddemo.service;

import com.springboot.demo.springbootcruddemo.model.Employee;
import com.springboot.demo.springbootcruddemo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }
}
