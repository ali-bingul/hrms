package com.alibingul.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alibingul.hrms.entities.concretes.Candidate;

public interface CandidateDao extends JpaRepository<Candidate, Integer>{
	Candidate findByEmail(String email);
	Candidate findByIdentityNumber(String identityNumber);
}
