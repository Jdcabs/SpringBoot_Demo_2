package com.spring.tutorial.service;

import java.util.List;
import java.util.Optional;

import com.spring.tutorial.Exception.DepartmentIdNotFound;
import com.spring.tutorial.Exception.DepartmentNotFound;
import com.spring.tutorial.entity.Department;
import com.spring.tutorial.repository.DepartmentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService,CRUD {

    @Autowired
    private DepartmentRepository repository;
    
    @Override
    public List<Department> getAll() throws DepartmentNotFound{
        List<Department> department = repository.findAll();
        
        if(department.isEmpty()) {
            throw new DepartmentNotFound("Can't Find Any Department, You can Add or try to check the http format, Thank you ");
        }
        return department;
    }

    @Override
    public Department getDepartmentById(Long departmentId) throws DepartmentIdNotFound {
        Optional<Department> dOptional = repository.findById(departmentId);

        if(dOptional.isEmpty()){
            throw new DepartmentIdNotFound("Department with an id of " + departmentId + " is not Available!");
        }else {
            return dOptional.get();
        }
    }

    @Override
    public Department createDepartment(Department department) {
        return repository.save(department);
    }

    @Override
    public void deleteDepartment(Long departmentId) {
        repository.deleteById(departmentId);
    }

    @Override
    public Department updateDepartment(Long id, Department department) {
        Optional<Department> depId = repository.findById(id);

        if(depId.isPresent()){
            department.setDepartmentId(id);
            return repository.save(department);
        }else{
            throw new RuntimeException("Id not Exsist!");
        }
    }

    // Using Derived Query Methods
    @Override
    public List<Department> findByDepartmentName(String departmentName) {
        return repository.findByDepartmentName(departmentName);
    }

    @Override
    public Department findByDepartmentNameIgnoreCase(String departmentName) {
        return repository.findByDepartmentNameIgnoreCase(departmentName);
    }

    @Override
    public List<Department> getAllDepartment() {
        return null;
    }
}
