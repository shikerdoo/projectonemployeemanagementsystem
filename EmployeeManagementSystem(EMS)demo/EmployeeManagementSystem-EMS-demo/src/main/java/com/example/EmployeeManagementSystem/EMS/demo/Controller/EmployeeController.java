package com.example.EmployeeManagementSystem.EMS.demo.Controller;

import com.example.EmployeeManagementSystem.EMS.demo.Models.Employee;
import com.example.EmployeeManagementSystem.EMS.demo.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/employee")
@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    public EmployeeController(EmployeeService employeeService)
    {
        this.employeeService=employeeService;
    }
    @PostMapping("/create")
    public Employee saveEmployee(@RequestBody Employee employee)
    {
        return employeeService.saveEmployee(employee);
    }
    @GetMapping("/all")
    public List<Employee> getAllEmployee()
    {
        return employeeService.getAllEmployee();
    }
    @GetMapping("/{id}")
    public ResponseEntity<?> getEmployeeById(@PathVariable("id") int id)
    {
        Employee employee= (Employee) SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        if(employee.getId()==id || employee.getRole().getName().equals("ROLE_ADMIN"))
//        return employeeService.getEmployeeById(id);
       return new ResponseEntity<>(employeeService.getEmployeeById(id),HttpStatus.OK);

        else
            return new ResponseEntity<>("not possible",HttpStatus.UNAUTHORIZED);
    }
    @PutMapping("/update/{id}")
    public Employee updateEmployee(@PathVariable("id")int id,@RequestBody Employee employee)
    {

        return (employeeService.updateEmployee(employee,id));
    }
    @DeleteMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable("id")int id)
    {
        employeeService.deleteEmployee(id);
        return "Employee deleted successfully";
    }
}
