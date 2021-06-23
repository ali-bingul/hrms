package com.alibingul.hrms.business.abstracts;

import java.util.List;

import com.alibingul.hrms.core.utilities.results.DataResult;
import com.alibingul.hrms.core.utilities.results.Result;
import com.alibingul.hrms.entities.concretes.Candidate;
import com.alibingul.hrms.entities.dtos.CandidateDto;

public interface CandidateService {
	
	DataResult<List<Candidate>> getAll();
	
	Result add(Candidate candidate);
	
	DataResult<Candidate> getByEmail(String email);
	
	DataResult<Candidate> getByIdentityNumber(String identityNumber);
	
	DataResult<Candidate> getById(int id);
	
	DataResult<Candidate> getCandidateCv(int candidateId);
	
	DataResult<List<CandidateDto>> getDto();
}
