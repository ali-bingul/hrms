package com.alibingul.hrms.business.concretes;

import java.util.List;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibingul.hrms.business.abstracts.CandidateService;
import com.alibingul.hrms.core.utilities.results.DataResult;
import com.alibingul.hrms.core.utilities.results.ErrorResult;
import com.alibingul.hrms.core.utilities.results.Result;
import com.alibingul.hrms.core.utilities.results.SuccessDataResult;
import com.alibingul.hrms.core.utilities.results.SuccessResult;
import com.alibingul.hrms.dataAccess.abstracts.CandidateDao;
import com.alibingul.hrms.entities.concretes.Candidate;
import com.alibingul.hrms.entities.dtos.CandidateDto;

@Service
public class CandidateManager implements CandidateService{
	
	private CandidateDao candidateDao;
	

	@Autowired
	public CandidateManager(CandidateDao candidateDao) {
		super();
		this.candidateDao = candidateDao;
	}

	@Override
	public DataResult<List<Candidate>> getAll() {
		return new SuccessDataResult<List<Candidate>>(this.candidateDao.findAll(), "Adaylar Listelendi");
	}

	@Override
	public DataResult<Candidate> getByEmail(String email) {
		return new SuccessDataResult<Candidate>(this.candidateDao.getByEmail(email));
	}

	@Override
	public DataResult<Candidate> getByIdentityNumber(String identityNumber) {
		return new SuccessDataResult<Candidate>(this.candidateDao.getByIdentityNumber(identityNumber));
	}
	
	private boolean validationForCandidate(Candidate candidate) {
		if(Objects.isNull(candidate.getIdentityNumber()) || Objects.isNull(candidate.getFirstName()) || Objects.isNull(candidate.getLastName())
			|| Objects.isNull(candidate.getEmail()) || Objects.isNull(candidate.getPassword()) || Objects.isNull(candidate.getBirthYear())) {
			return false;
		}
		return true;
	}
	
	private boolean checkIfEmailExists(String email) {
		if(this.candidateDao.getByEmail(email) != null) {
			return false;
		}
		return true;
	}
	
	@Override
	public Result add(Candidate candidate) {
		/*if(checkMernisService.checkIfRealTcNo(candidate)) {
			return new ErrorResult("Not a valid person");
		}
		else if(!validationForCandidate(candidate)) {
			return new ErrorResult("You have entered incomplete information. Please check your information again.");
		}
		if(!this.checkIfEmailExists(candidate.getEmail())) {
			return new ErrorResult("This email address already exists.");
		}
		this.candidateDao.save(candidate);
		return new SuccessResult("Candidate succesfully added.");*/
		if(getByEmail(candidate.getEmail()).getData() != null) {
			return new ErrorResult("This email address already exists.");
		}
		this.candidateDao.save(candidate);
		return new SuccessResult("Candidate successfully added.");
	}

	@Override
	public DataResult<Candidate> getById(int id) {
		return new SuccessDataResult<Candidate>(this.candidateDao.getById(id));
	}

	@Override
	public DataResult<Candidate> getCandidateCv(int candidateId) {
		return null;
	}

	@Override
	public DataResult<List<CandidateDto>> getDto() {
		//return new SuccessDataResult<List<CandidateDto>>(this.candidateDao.getDto());
		return null;
	}
}
