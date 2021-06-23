package com.alibingul.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibingul.hrms.business.abstracts.CandidateService;
import com.alibingul.hrms.core.utilities.results.DataResult;
import com.alibingul.hrms.entities.concretes.Candidate;

@CrossOrigin
@RestController
@RequestMapping("/api/candidates")
public class CandidatesController {
	
	private CandidateService candidateService;
	

	@Autowired
	public CandidatesController(CandidateService candidateService) {
		super();
		this.candidateService = candidateService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<Candidate>> getAll(){
		return candidateService.getAll();
	}
}
