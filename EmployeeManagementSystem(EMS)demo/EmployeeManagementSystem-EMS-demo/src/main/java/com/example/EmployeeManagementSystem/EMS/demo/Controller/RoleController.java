package com.example.EmployeeManagementSystem.EMS.demo.Controller;

import com.example.EmployeeManagementSystem.EMS.demo.Models.Employee;
import com.example.EmployeeManagementSystem.EMS.demo.Models.Role;
import com.example.EmployeeManagementSystem.EMS.demo.Service.EmployeeService;
import com.example.EmployeeManagementSystem.EMS.demo.Service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/role")
@RestController
public class RoleController {
    @Autowired
    private RoleService roleService;
    public RoleController(RoleService roleService)
    {
        this.roleService=roleService;
    }
    @PostMapping
    public Role saveRole(@RequestBody Role role)
    {
        return roleService.saveRole(role);
    }
    @GetMapping
    public List<Role> getAllRole()
    {
        return roleService.getAllRole();
    }
    @GetMapping("{id}")
    public Role getRoleById(@PathVariable("id") int id)
    {
        return roleService.getRoleById(id);
    }
    @PutMapping("{id}")
    public Role updateRole(@PathVariable("id")int id,@RequestBody Role role)
    {
        return (roleService.updateRole(role,id));
    }
    @DeleteMapping("{id}")
    public String deleteRole(@PathVariable("id")int id)
    {
        roleService.deleteRole(id);
        return "Employee deleted successfully";
    }
}
