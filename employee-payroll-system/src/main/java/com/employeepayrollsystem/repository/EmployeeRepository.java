package com.employeepayrollsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employeepayrollsystem.dto.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
