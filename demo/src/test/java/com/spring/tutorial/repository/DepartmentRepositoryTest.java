package com.spring.tutorial.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.spring.tutorial.entity.Department;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class DepartmentRepositoryTest {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Autowired
    private TestEntityManager entityManager;

    @BeforeEach
    void setUp() {
        Department department =
                    Department.builder()
                    .departmentName("Information Technology")
                    .departmentAddress("Marikina City")
                    .departmentCode("IT-05")
                    .build();
                    
        entityManager.persist(department);            
    }

    @Test
    public void TestRepositoryFindById(){
        Department department = departmentRepository.findById(1L).get();
        assertEquals(department.getDepartmentName(), "Information Technology");
    }

    @Test
    public void TestRepositoryFindByDepartmentCode() {
        Department department = departmentRepository.findById(1L).get();
        assertEquals(department.getDepartmentCode(), "IT-05");
    }
}
