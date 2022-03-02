package com.spring.tutorial.repository;

import java.util.List;

import com.spring.tutorial.entity.Department;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
    
    // Derived Query Methods.
    List<Department> findByDepartmentName(String name);

    List<Department> findByDepartmentNameIgnoreCase(String departmentName);

}
