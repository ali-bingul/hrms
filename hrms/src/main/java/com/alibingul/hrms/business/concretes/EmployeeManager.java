package com.alibingul.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibingul.hrms.business.abstracts.EmployeeService;
import com.alibingul.hrms.dataAccess.abstracts.EmployeeDao;
import com.alibingul.hrms.entities.concretes.Candidate;
import com.alibingul.hrms.entities.concretes.Employee;

@Service
public class EmployeeManager implements EmployeeService{

	private EmployeeDao employeeDao;
	
	@Autowired
	public EmployeeManager(EmployeeDao employeeDao) {
		super();
		this.employeeDao = employeeDao;
	}

	@Override
	public List<Employee> getAll() {
		return employeeDao.findAll();
	}
	
}
