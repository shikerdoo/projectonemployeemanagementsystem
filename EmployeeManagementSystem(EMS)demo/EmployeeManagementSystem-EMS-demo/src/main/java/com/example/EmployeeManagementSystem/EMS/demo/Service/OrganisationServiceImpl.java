package com.example.EmployeeManagementSystem.EMS.demo.Service;

import com.example.EmployeeManagementSystem.EMS.demo.Models.Organisation;
import com.example.EmployeeManagementSystem.EMS.demo.Repository.OrganisationRepository;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrganisationServiceImpl implements OrganisationService{
   @Autowired
    private OrganisationRepository organisationRepository;
    OrganisationServiceImpl(OrganisationRepository organisationRepository)
    {
        this.organisationRepository=organisationRepository;
    }
    @Override
    public Organisation saveOrganisation(Organisation organisation) {
        return organisationRepository.save(organisation);
    }

    @Override
    public List<Organisation> getAllOrganisation() {
        return organisationRepository.findAll();
    }

    @Override
    public Organisation getOrganisationById(int id) {
        return organisationRepository.findById(id).orElseThrow();
    }

    @Override
    public Organisation updateOrganisation(Organisation organisation, int id) {
        Organisation existingOrganisation=organisationRepository.findById(id).orElseThrow();
          existingOrganisation.setName(organisation.getName());
         organisationRepository.save(organisation);
        return existingOrganisation;
    }

    @Override
    public void deleteOrganisation(int id) {
        organisationRepository.findById(id).orElseThrow();
        organisationRepository.deleteById(id);
    }
}
