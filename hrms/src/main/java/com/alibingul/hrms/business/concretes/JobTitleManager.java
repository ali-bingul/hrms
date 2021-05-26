package com.alibingul.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibingul.hrms.business.abstracts.JobTitleService;
import com.alibingul.hrms.dataAccess.abstracts.JobTitleDao;
import com.alibingul.hrms.entities.concretes.JobTitle;

@Service
public class JobTitleManager implements JobTitleService{

	private JobTitleDao jobTitleDao;
	
	@Autowired
	public JobTitleManager(JobTitleDao jobTitleDao) {
		super();
		this.jobTitleDao = jobTitleDao;
	}

	@Override
	public List<JobTitle> getAll() {
		return jobTitleDao.findAll();
	}
	
}
