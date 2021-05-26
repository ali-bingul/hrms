package com.alibingul.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibingul.hrms.business.abstracts.EmployeeService;
import com.alibingul.hrms.entities.concretes.Employee;

@RestController
@RequestMapping("/api/employees")
public class EmployeesControllers {
	
	private EmployeeService employeeService;

	@Autowired
	public EmployeesControllers(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}
	
	@GetMapping("/getall")
	public List<Employee> getAll(){
		return employeeService.getAll();
	}
}
