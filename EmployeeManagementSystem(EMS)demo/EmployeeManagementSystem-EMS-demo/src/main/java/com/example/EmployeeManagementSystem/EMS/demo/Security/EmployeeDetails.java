package com.example.EmployeeManagementSystem.EMS.demo.Security;

import com.example.EmployeeManagementSystem.EMS.demo.Models.Employee;
import com.example.EmployeeManagementSystem.EMS.demo.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class EmployeeDetails implements UserDetailsService {
    @Autowired
    private EmployeeRepository employeeRepository;
    @Override
    public UserDetails loadUserByUsername(String Username)throws UsernameNotFoundException
    {
        Employee employee=this.employeeRepository.findByEmail(Username).orElseThrow();
        return employee;
    }


}
