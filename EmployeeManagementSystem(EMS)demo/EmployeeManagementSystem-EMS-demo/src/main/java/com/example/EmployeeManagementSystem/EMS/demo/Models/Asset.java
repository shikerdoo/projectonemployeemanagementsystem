package com.example.EmployeeManagementSystem.EMS.demo.Models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.Proxy;

import javax.persistence.*;
@Getter
@Setter
//@Data
@Entity
@Table
public class Asset {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int id;
@Column(nullable = false)
 String name;
@Column(nullable = false)
 String shortname;
@Column(nullable = false)
int salary;
@Column(nullable = false)
 int leaves;
@JsonBackReference
@ManyToOne
    Organisation organisation;
//@OneToOne(fetch = FetchType.EAGER)
//private Role role;

//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getShortname() {
//        return shortname;
//    }
//
//    public void setShortname(String shortname) {
//        this.shortname = shortname;
//    }
//
//    public int getSalary() {
//        return salary;
//    }
//
//    public void setSalary(int salary) {
//        this.salary = salary;
//    }
//
//    public int getLeaves() {
//        return leaves;
//    }
//
//    public void setLeaves(int leaves) {
//        this.leaves = leaves;
//    }
//
//    public Organisation getOrganisation() {
//        return organisation;
//    }
//
//    public void setOrganisation(Organisation organisation) {
//        this.organisation = organisation;
//    }
}
