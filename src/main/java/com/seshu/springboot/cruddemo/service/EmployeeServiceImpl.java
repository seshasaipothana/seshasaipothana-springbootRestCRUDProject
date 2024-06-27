package com.seshu.springboot.cruddemo.service;


import com.seshu.springboot.cruddemo.dao.EmployeeRepository;
import com.seshu.springboot.cruddemo.entity.Employee;
import com.seshu.springboot.cruddemo.rest.EmployeeNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    private EmployeeRepository employeeRepository;
    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee findById(int id) {
        Employee employee = null;
        Optional<Employee> result = employeeRepository.findById(id);
        if (result.isPresent()){
            employee = result.get();
        }
        else{
            throw new EmployeeNotFoundException("Employee is not found with this ID : " + id);
        }
        return employee;
    }

    @Override
    //JPA Repository provides @Transactional.So need to specify explicitly
    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    //JPA Repository provides @Transactional.So need to specify explicitly
    public void deleteById(int id) {
        employeeRepository.deleteById(id);

    }
}
