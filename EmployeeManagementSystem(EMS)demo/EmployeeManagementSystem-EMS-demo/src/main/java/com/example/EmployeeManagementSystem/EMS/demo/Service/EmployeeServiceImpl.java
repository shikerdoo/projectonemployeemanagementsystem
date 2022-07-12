package com.example.EmployeeManagementSystem.EMS.demo.Service;

import com.example.EmployeeManagementSystem.EMS.demo.Models.Employee;
import com.example.EmployeeManagementSystem.EMS.demo.Models.Organisation;
import com.example.EmployeeManagementSystem.EMS.demo.Repository.EmployeeRepository;
import com.example.EmployeeManagementSystem.EMS.demo.Repository.OrganisationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService{
   @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
            private OrganisationRepository organisationRepository;
    @Autowired
            private PasswordEncoder passwordEncoder;
    EmployeeServiceImpl(EmployeeRepository employeeRepository)
    {
        this.employeeRepository=employeeRepository;
    }
    @Override
    public Employee saveEmployee(Employee employee) {
        employee.setPassword(passwordEncoder.encode(employee.getPassword()));
        Organisation organisation=organisationRepository.findById(17).orElseThrow();
        employee.setOrganisation(organisation);
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployeeById(int id) {
        return employeeRepository.findById(id).orElseThrow();
    }

    @Override
    public Employee updateEmployee(Employee employee, int id) {
        Employee existingEmployee=employeeRepository.findById(id).orElseThrow();
        existingEmployee.setFirstname(employee.getFirstname());
        existingEmployee.setLastname(employee.getLastname());
        existingEmployee.setEmail(employee.getEmail());
        existingEmployee.setPassword(passwordEncoder.encode(employee.getPassword()));
       existingEmployee.setRole(employee.getRole());
       existingEmployee.setOrganisation(employee.getOrganisation());
       employeeRepository.save(existingEmployee);
        return existingEmployee;
    }

    @Override
    public void deleteEmployee(int id) {
        employeeRepository.findById(id).orElseThrow();
        employeeRepository.deleteById(id);
    }
}
