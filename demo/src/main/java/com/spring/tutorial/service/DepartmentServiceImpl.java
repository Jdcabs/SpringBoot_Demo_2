package com.spring.tutorial.service;

import java.util.List;

import com.spring.tutorial.entity.Department;
import com.spring.tutorial.repository.DepartmentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository repository;
    
    @Override
    public List<Department> getAll() {
        return repository.findAll();
    }

    @Override
    public Department getDepartmentById(Long departmentId) {
        return repository.findById(departmentId).get();
    }

    @Override
    public Department createDepartment(Department department) {
        return repository.save(department);
    }

    @Override
    public void deleteDepartment(Long departmentId) {
        repository.deleteById(departmentId);
    }
}
