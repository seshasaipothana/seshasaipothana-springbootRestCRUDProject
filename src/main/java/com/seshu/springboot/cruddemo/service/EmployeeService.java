package com.seshu.springboot.cruddemo.service;

import com.seshu.springboot.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();

    //Read
    Employee findById(int id);
    //Create/Update
    Employee save(Employee employee);
    //Delete
    void deleteById(int id);
}
