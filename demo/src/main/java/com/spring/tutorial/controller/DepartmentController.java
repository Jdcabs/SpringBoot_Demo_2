package com.spring.tutorial.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import com.spring.tutorial.entity.Department;
import com.spring.tutorial.service.DepartmentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {
    
    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/department")
    public List<Department> getAllDepartment(){
        return departmentService.getAll();
    }

    @GetMapping("/department/{id}")
    public Department getDepartmentById(@PathVariable(value = "id") Long departmentId){
        return departmentService.getDepartmentById(departmentId);
    }

    @PostMapping("/department")
    public Department createDepartment(@RequestBody Department department){
        return departmentService.createDepartment(department);
    }

    @DeleteMapping("/department/{id}")
    public String deleteDepartment(@PathVariable("id") Long departmentId){
        departmentService.deleteDepartment(departmentId);
        return "Successfully Deleted Department with an Id of " + departmentId ;
    }
}
