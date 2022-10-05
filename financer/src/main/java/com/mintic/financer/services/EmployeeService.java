package com.mintic.financer.services;

import com.mintic.financer.entities.Employee;
import com.mintic.financer.repository.IEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeService implements IEmployeeService {

    @Autowired
    IEmployeeRepository repository;

    @Override
    @Transactional(readOnly = true)
    public List<Employee> employeeList() {
        return (List<Employee>) this.repository.findAll();
    }

    @Override
    @Transactional
    public void createEmployee(Employee employee) {
        repository.save(employee);
    }
}
