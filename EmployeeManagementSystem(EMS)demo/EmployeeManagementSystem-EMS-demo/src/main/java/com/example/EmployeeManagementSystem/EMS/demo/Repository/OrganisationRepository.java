package com.example.EmployeeManagementSystem.EMS.demo.Repository;

import com.example.EmployeeManagementSystem.EMS.demo.Models.Organisation;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.Optional;

public interface OrganisationRepository extends JpaRepository<Organisation, Integer> {

    Optional<Organisation> findById(int id);
}
