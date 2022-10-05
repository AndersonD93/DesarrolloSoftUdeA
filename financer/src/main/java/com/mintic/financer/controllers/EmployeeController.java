package com.mintic.financer.controllers;

import com.mintic.financer.entities.Employee;
import com.mintic.financer.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService service;


    @GetMapping("/employee")
    public List<Employee> employeeList(Model model){
        var employees=service.employeeList();
        model.addAttribute("employees",employees);
        return employees;
    }

    @PostMapping("/createEmployee")
    public String createEmployee (@RequestBody Employee employee){
        service.createEmployee(employee);
       return "Empleado creado";
    }
}
