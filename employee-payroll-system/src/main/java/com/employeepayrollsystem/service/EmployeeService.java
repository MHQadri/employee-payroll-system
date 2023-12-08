package com.employeepayrollsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employeepayrollsystem.dao.EmployeeDao;
import com.employeepayrollsystem.dto.Employee;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;

	// save employee Method
	public void saveEmployee(Employee employee) {

		employeeDao.saveEmployee(employee);
	}

	// getAllEmployee Method
	public List<Employee> getAllEmployee() {

		return employeeDao.getAllEmployee();
	}

	// getEmployeeById method
	public Employee getEmployeeById(int id) {
		return employeeDao.getEmployeeById(id);
	}

	// deleteEmployee method
		public void deleteEmployeeById(int id) {
			employeeDao.deleteEmployeeById(id);
		}
}
