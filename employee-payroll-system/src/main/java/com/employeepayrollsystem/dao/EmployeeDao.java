package com.employeepayrollsystem.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.employeepayrollsystem.dto.Employee;
import com.employeepayrollsystem.repository.EmployeeRepository;

@Repository
public class EmployeeDao {

	@Autowired
	private EmployeeRepository employeeRepository;

	// save employee Method
	public void saveEmployee(Employee employee) {

		employeeRepository.save(employee);

	}

	// getAllEmployee Method
	public List<Employee> getAllEmployee() {

		return employeeRepository.findAll();
	}

	// getEmployeeById method
	public Employee getEmployeeById(int id) {

		return employeeRepository.findById(id).get();
	}
	
	// deleteEmployee method
	public void deleteEmployeeById(int id) {
		
		employeeRepository.deleteById(id);	
	}

}
