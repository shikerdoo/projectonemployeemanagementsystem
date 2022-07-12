package com.example.EmployeeManagementSystem.EMS.demo.Service;

import com.example.EmployeeManagementSystem.EMS.demo.Models.Asset;
import com.example.EmployeeManagementSystem.EMS.demo.Models.Role;
import org.springframework.stereotype.Service;

import java.util.List;

public interface RoleService {
    Role saveRole(Role role);
    List<Role> getAllRole();


    Role getRoleById(int id);

    Role updateRole(Role role, int id);
    void deleteRole(int id);
}
