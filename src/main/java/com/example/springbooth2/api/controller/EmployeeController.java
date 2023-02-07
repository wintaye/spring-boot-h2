package com.example.springbooth2.api.controller;

import com.example.springbooth2.api.dao.EmployeeRepository;
import com.example.springbooth2.api.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository repository;

    @PostMapping("/saveEmployee")
    public String saveEmployee(@RequestBody Employee employee){
            repository.save(employee);
            return "Employee saved..";
    }

    @GetMapping("/getAllEmployees")
    public List<Employee> getAll(){
        return repository.findAll();
    }

    @GetMapping("/getEmployee/{dept}")
    public List<Employee> getEmployeeByDept(@PathVariable String dept){
        return repository.findByDept(dept);
    }
}
