package com.spring.tutorial.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@AllArgsConstructor
@Data
public class Department {
    
    @Id
    @SequenceGenerator(
        allocationSize = 1,
        name = "department_sequence",
        sequenceName = "department_sequence")
    @GeneratedValue(
        generator = "department_sequence",
        strategy = GenerationType.SEQUENCE)
    private Long departmentId;

    @NotNull
    @Column(name = "department_name")
    private String departmentName;
    
    @NotNull
    @Column(name = "department_address")
    private String departmentAddress;
    
    @NotNull
    @Column(name = "department_code")
    private String departmentCode;
}
