package com.mintic.financer.services;

import com.mintic.financer.entities.Employee;

import java.util.List;

public interface IEmployeeService {
    public List<Employee> employeeList();
    public void createEmployee(Employee employee);
}
