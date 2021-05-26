package com.alibingul.hrms.business.abstracts;

import java.util.List;

import com.alibingul.hrms.entities.concretes.Employee;

public interface EmployeeService {
	List<Employee> getAll();
}
