package com.mintic.financer.repository;

import com.mintic.financer.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface IEmployeeRepository extends JpaRepository<Employee, Long> {
}
