package com.seshu.springboot.cruddemo.rest;


import com.seshu.springboot.cruddemo.entity.Employee;

import com.seshu.springboot.cruddemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController{

    //define field for EmployeeDAO
    private EmployeeService employeeService ;
    //Constructor for EmployeeDAO (constructor injection)
    @Autowired
    public EmployeeRestController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    public List<Employee> findAll(){
        List<Employee> employees = employeeService.findAll();
        return employees;
    }
    @GetMapping("/employees/{id}")
    public Employee findById(@PathVariable int id){
        Employee employee = employeeService.findById(id);
        if(employee == null){
            throw new EmployeeNotFoundException("No employee is found with this ID : " + id);
        }
        return employee;

    }
    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee employee){
        employee.setId(0);
        Employee dbEmployee = employeeService.save(employee);
        return dbEmployee;

    }
    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee employee){
        Employee dbEmployee = employeeService.save(employee);
        return dbEmployee;
    }
    @DeleteMapping("/employees/{id}")
    public String deleteEmployee(@PathVariable int id){
        Employee employee = employeeService.findById(id);
        if (employee == null){
            throw new EmployeeNotFoundException("No employee is found with this ID : " + id);
        }
        employeeService.deleteById(id);

        return "Employee deleted with ID : " + id;
    }
}
