package com.example.EmployeeManagementSystem.EMS.demo.Models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Proxy;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
//@Data
@Entity
@Table
public class Organisation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    @Column(nullable = false)
    String name;
    @JsonManagedReference
@OneToMany(mappedBy = "organisation")
List<Employee> employeeList;
    @JsonManagedReference
@OneToMany(mappedBy = "organisation")
    List<Asset> assetList;
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public List<Employee> getEmployeeList() {
//        return employeeList;
//    }
//
//    public void setEmployeeList(List<Employee> employeeList) {
//        this.employeeList = employeeList;
//    }
//
//    public List<Asset> getAssetList() {
//        return assetList;
//    }
//
//    public void setAssetList(List<Asset> assetList) {
//        this.assetList = assetList;
//    }
}
