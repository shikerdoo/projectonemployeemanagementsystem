package com.example.EmployeeManagementSystem.EMS.demo.Controller;

import com.example.EmployeeManagementSystem.EMS.demo.Models.Organisation;
import com.example.EmployeeManagementSystem.EMS.demo.Service.OrganisationService;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/organisation")
@RestController
public class OrganisationController {
    @Autowired
    private OrganisationService organisationService;
    public OrganisationController(OrganisationService organisationService)
    {
        this.organisationService=organisationService;
    }
    @PostMapping("/create")
    public Organisation saveOrganisation(@RequestBody Organisation organisation)
    {
        return organisationService.saveOrganisation(organisation);
    }
    @GetMapping("/all")
    public List<Organisation> getAllOrganisation()
    {
        return organisationService.getAllOrganisation();
    }
    @GetMapping("{id}")
    public Organisation getOrganisationById(@PathVariable("id") int id)
    {
        return (organisationService.getOrganisationById(id));
    }
    @PutMapping("/update/{id}")
    public Organisation updateOrganisation(@PathVariable("id")int id,@RequestBody Organisation organisation)
    {
        return organisationService.updateOrganisation(organisation,id);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteOrganisation(@PathVariable("id")int id)
    {
        organisationService.deleteOrganisation(id);
        return "Employee deleted successfully";
    }
}
