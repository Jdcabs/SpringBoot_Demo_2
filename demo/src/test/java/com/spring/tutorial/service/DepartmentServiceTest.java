package com.spring.tutorial.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.spring.tutorial.entity.Department;
import com.spring.tutorial.repository.DepartmentRepository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest
public class DepartmentServiceTest {
    
    @Autowired
    private DepartmentService departmentService;

    @MockBean
    private DepartmentRepository departmentRepository;

    @BeforeEach
    void setup(){
        Department department = Department.builder()
                                .departmentId(1L)
                                .departmentName("IT")
                                .departmentAddress("Concepcion Uno")
                                .departmentCode("IT-01")
                                .build();
        
       Mockito.when(departmentRepository.findByDepartmentNameIgnoreCase("IT")).thenReturn(department);
    }


    @Test
    void testCreateDepartment() {

    }

    @Test
    void testDeleteDepartment() {

    }

    @Test
    void testFindByDepartmentName() {

    }

    @Test
    void testFindByDepartmentNameIgnoreCase() {
       String departmentName = "IT";

       Department department = departmentService.findByDepartmentNameIgnoreCase(departmentName);

       assertEquals(departmentName, department.getDepartmentName());
    }

    @Test
    void testGetAll() {

    }

    @Test
    void testGetDepartmentById() {
     
    }

    @Test
    void testUpdateDepartment() {

    }
}
