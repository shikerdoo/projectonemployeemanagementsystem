package com.example.EmployeeManagementSystem.EMS.demo.Service;

import com.example.EmployeeManagementSystem.EMS.demo.Models.Asset;
import com.example.EmployeeManagementSystem.EMS.demo.Models.Role;
import com.example.EmployeeManagementSystem.EMS.demo.Repository.AssetRepository;
import com.example.EmployeeManagementSystem.EMS.demo.Repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RoleServiceImpl implements RoleService{
    @Autowired
    private RoleRepository roleRepository;
    RoleServiceImpl(RoleRepository roleRepository)
    {
        this.roleRepository=roleRepository;
    }
    @Override
    public Role saveRole(Role role) {
        return roleRepository.save(role);
    }

    @Override
    public List<Role> getAllRole() {
        return roleRepository.findAll();
    }

    @Override
    public Role getRoleById(int id) {
        return roleRepository.findById(id).orElseThrow();
    }

    @Override
    public Role updateRole(Role role, int id) {
        Role existingRole=roleRepository.findById(id).orElseThrow();
        existingRole.setName(role.getName());

        return existingRole;
    }

    @Override
    public void deleteRole(int id) {
        roleRepository.findById(id).orElseThrow();
        roleRepository.deleteById(id);
    }
}
