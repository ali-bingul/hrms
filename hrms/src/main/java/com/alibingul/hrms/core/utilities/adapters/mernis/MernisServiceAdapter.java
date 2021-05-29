package com.alibingul.hrms.core.utilities.adapters.mernis;

import com.alibingul.hrms.mernis.FakeMernisService;

public class MernisServiceAdapter implements UserCheckService{

	@Override
	public boolean checkIfRealPerson(String identityNumber, String firstName, String lastName, int birthYear) {
		FakeMernisService client = new FakeMernisService();
		
		boolean result = client.verifyIdentityNumber(identityNumber, firstName, lastName, birthYear);
		
		return result;
	}
}
