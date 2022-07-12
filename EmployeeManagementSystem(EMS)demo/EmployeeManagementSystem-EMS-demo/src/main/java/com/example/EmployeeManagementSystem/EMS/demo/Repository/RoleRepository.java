package com.example.EmployeeManagementSystem.EMS.demo.Repository;

import com.example.EmployeeManagementSystem.EMS.demo.Models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role,Integer> {
    Optional<Role> findById(int id);
}
