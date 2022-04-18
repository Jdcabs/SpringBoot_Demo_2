package com.spring.tutorial.controller;

import java.util.List;

import javax.validation.Valid;
import javax.websocket.server.PathParam;

import com.spring.tutorial.Exception.DepartmentIdNotFound;
import com.spring.tutorial.Exception.DepartmentNotFound;
import com.spring.tutorial.entity.Department;
import com.spring.tutorial.service.DepartmentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {
    
    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/department")
    public List<Department> getAllDepartment() throws DepartmentNotFound{
        return departmentService.getAll();
    }

    @GetMapping("/department/{id}")
    public Department getDepartmentById(@PathVariable(value = "id") Long departmentId) throws DepartmentIdNotFound{
        return departmentService.getDepartmentById(departmentId);
    }

    @PostMapping("/department")
    public Department createDepartment(@Valid @RequestBody Department department) {
        return departmentService.createDepartment(department);
    }

    @DeleteMapping("/department/{id}")
    public String deleteDepartment(@PathVariable("id") Long departmentId) {
        departmentService.deleteDepartment(departmentId);
        return "Successfully Deleted Department with an Id of " + departmentId ;
    }

    @PutMapping("/department/{id}")
    public Department updateDepartment(@PathVariable("id") Long id, @RequestBody Department department) {
        return departmentService.updateDepartment(id, department);
    }

    // Using Derived Query Methods to fetch data.
    @GetMapping("/department/name/{name}")
    public List<Department> findByDepartmentName(@PathVariable("name") String departmentName){
        return departmentService.findByDepartmentName(departmentName);
    }

    @GetMapping("/department/name/ignorecase/{name}")
    public Department findByDepartmentNameIgnoreCase(@PathVariable("name") String departmentName) {
        return departmentService.findByDepartmentNameIgnoreCase(departmentName);
    }

}
