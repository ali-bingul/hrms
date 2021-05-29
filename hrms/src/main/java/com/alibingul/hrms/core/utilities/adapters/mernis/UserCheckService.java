package com.alibingul.hrms.core.utilities.adapters.mernis;

public interface UserCheckService {
	boolean checkIfRealPerson(String identityNumber, 
							  String firstName,
							  String lastName,
							  int birthYear);
							
}
