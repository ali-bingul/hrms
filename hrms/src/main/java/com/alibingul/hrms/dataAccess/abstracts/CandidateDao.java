package com.alibingul.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.alibingul.hrms.entities.concretes.Candidate;

public interface CandidateDao extends JpaRepository<Candidate, Integer>{
	
	Candidate getByEmail(String email);
	
	Candidate getByIdentityNumber(String identityNumber);
	
	Candidate getById(int id);
	
	@Query("Select new com.alibingul.hrms.entities.dtos.CandiateDto"
			+ "(c.firstName, c.lastName, c.email, c.phoneNumber, i.url) "
			+ "From Candidate c Inner Join c.images i")
	List<Candidate> getDto();
}
