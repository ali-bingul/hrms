package com.alibingul.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibingul.hrms.business.abstracts.CandidateService;
import com.alibingul.hrms.dataAccess.abstracts.CandidateDao;
import com.alibingul.hrms.entities.concretes.Candidate;

@Service
public class CandidateManager implements CandidateService{
	
	private CandidateDao candidateDao;

	@Autowired
	public CandidateManager(CandidateDao candidateDao) {
		super();
		this.candidateDao = candidateDao;
	}

	@Override
	public List<Candidate> getAll() {
		return candidateDao.findAll();
	}
	
	
}
