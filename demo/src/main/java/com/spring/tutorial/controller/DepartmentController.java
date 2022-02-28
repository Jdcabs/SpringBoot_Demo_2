package com.spring.tutorial.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import com.spring.tutorial.entity.Department;
import com.spring.tutorial.service.DepartmentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
    public Department getDepartmentById(@PathParam(value = "id") Long departmentId){
        return departmentService.getDepartmentById(departmentId);
    }
}
