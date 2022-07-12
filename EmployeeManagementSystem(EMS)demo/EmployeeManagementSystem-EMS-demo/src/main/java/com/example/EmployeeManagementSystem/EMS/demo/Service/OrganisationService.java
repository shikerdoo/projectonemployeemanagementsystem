package com.example.EmployeeManagementSystem.EMS.demo.Service;

import com.example.EmployeeManagementSystem.EMS.demo.Models.Organisation;
import org.aspectj.weaver.ast.Or;

import java.util.List;

public interface OrganisationService {
    Organisation saveOrganisation(Organisation organisation);
    List<Organisation> getAllOrganisation();


    Organisation getOrganisationById(int id);

    Organisation updateOrganisation(Organisation organisation, int id);
    void deleteOrganisation(int id);

}
