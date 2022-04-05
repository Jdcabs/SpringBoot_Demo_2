package com.spring.tutorial.service;

import java.util.List;

import com.spring.tutorial.Exception.DepartmentIdNotFound;
import com.spring.tutorial.Exception.DepartmentNotFound;
import com.spring.tutorial.entity.Department;

public interface DepartmentService {
    
    public List<Department> getAll() throws DepartmentNotFound;

    public Department getDepartmentById(Long departmentId) throws DepartmentIdNotFound;

    public Department createDepartment(Department department);

    public void deleteDepartment(Long departmentId);

    public Department updateDepartment(Long id, Department department);

    public List<Department> findByDepartmentName(String departmentName);
    
    public Department findByDepartmentNameIgnoreCase(String departmentName);
}
