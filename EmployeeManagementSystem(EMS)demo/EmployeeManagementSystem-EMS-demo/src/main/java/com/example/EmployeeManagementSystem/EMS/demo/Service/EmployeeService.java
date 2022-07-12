package com.example.EmployeeManagementSystem.EMS.demo.Service;

import com.example.EmployeeManagementSystem.EMS.demo.Models.Employee;

import java.util.List;

public interface EmployeeService {
    Employee saveEmployee(Employee employee);
    List<Employee> getAllEmployee();


    Employee getEmployeeById(int id);

    Employee updateEmployee(Employee employee, int id);
    void deleteEmployee(int id);

}
