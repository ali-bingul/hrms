package com.alibingul.hrms.business.abstracts;

import java.util.List;

import com.alibingul.hrms.entities.concretes.Candidate;

public interface CandidateService {
	List<Candidate> getAll();
}
