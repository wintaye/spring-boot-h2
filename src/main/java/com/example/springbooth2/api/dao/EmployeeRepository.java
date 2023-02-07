package com.example.springbooth2.api.dao;

import com.example.springbooth2.api.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    List<Employee> findByDept(String dept);
}
