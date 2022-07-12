package com.example.EmployeeManagementSystem.EMS.demo.Repository;

import com.example.EmployeeManagementSystem.EMS.demo.Models.Asset;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AssetRepository extends JpaRepository<Asset,Integer> {
    Optional<Asset> findByName(String name);
}
