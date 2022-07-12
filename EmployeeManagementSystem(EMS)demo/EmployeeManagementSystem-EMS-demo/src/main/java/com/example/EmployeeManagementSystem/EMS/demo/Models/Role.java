package com.example.EmployeeManagementSystem.EMS.demo.Models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(nullable = false)
    String name;

}
