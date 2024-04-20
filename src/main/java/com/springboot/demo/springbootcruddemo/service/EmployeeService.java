package com.springboot.demo.springbootcruddemo.service;

import com.springboot.demo.springbootcruddemo.model.Employee;
import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
}
