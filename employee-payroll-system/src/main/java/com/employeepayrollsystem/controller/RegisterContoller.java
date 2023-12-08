package com.employeepayrollsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.employeepayrollsystem.dto.Employee;
import com.employeepayrollsystem.service.EmployeeService;

@Controller
public class RegisterContoller {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/")
	public String index() {

		return "index";
	}
	
	@GetMapping("/reg_form")
	public String register() {
		
		return "register";
	}

	@GetMapping("/employees")
	public String employees() {

		return "employees";
	}
	
	@GetMapping("/salary-calculator")
	public String salaryCalculator() {
		
		return "salary-calculator";
	}
	@GetMapping("/employees_list")
	public ModelAndView getAllEmployee() {

		List<Employee> list = employeeService.getAllEmployee();
		ModelAndView view = new ModelAndView();
		view.setViewName("employees");
		view.addObject("employees", list);
		return view;
	}

	@PostMapping("/register")
	public String saveEmployee(@ModelAttribute Employee employee) {

		employeeService.saveEmployee(employee);
		return "redirect:/employees_list";
	}


	@RequestMapping("/editEmployee/{id}")
	public String updateEmployee(@PathVariable("id") int id, Model model) {

		Employee employee = employeeService.getEmployeeById(id);
		model.addAttribute("emp", employee);
		return "editEmployee";

	}
	
	@RequestMapping("/deleteEmployee/{id}")
	public String deleletEmployeeById(@PathVariable("id") int id) {
		
		 employeeService.deleteEmployeeById(id);
		 return "redirect:/employees_list";
	}
}
