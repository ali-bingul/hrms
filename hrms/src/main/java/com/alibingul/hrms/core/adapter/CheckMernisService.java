package com.alibingul.hrms.core.adapter;

import com.alibingul.hrms.entities.concretes.Candidate;

public interface CheckMernisService {
	boolean checkIfRealTcNo(Candidate candidate);
}
