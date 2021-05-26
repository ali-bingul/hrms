package com.alibingul.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibingul.hrms.business.abstracts.EmployerService;
import com.alibingul.hrms.dataAccess.abstracts.EmployerDao;
import com.alibingul.hrms.entities.concretes.Candidate;
import com.alibingul.hrms.entities.concretes.Employer;

@Service
public class EmployerManager implements EmployerService{

	private EmployerDao employerDao;
	
	
	@Autowired
	public EmployerManager(EmployerDao employerDao) {
		super();
		this.employerDao = employerDao;
	}

	@Override
	public List<Employer> getAll() {
		return employerDao.findAll();
	}

}
