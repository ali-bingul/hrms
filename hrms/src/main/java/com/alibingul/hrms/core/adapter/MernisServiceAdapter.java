package com.alibingul.hrms.core.adapter;

import com.alibingul.hrms.entities.concretes.Candidate;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CheckMernisService{

	@Override
	public boolean checkIfRealTcNo(Candidate candidate) {
		KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();
		
		boolean serviceResult = false;
		
		try {
			serviceResult = kpsPublicSoapProxy.TCKimlikNoDogrula(Long.parseLong(candidate.getIdentityNumber()),
					candidate.getFirstName().toUpperCase(),
					candidate.getLastName().toUpperCase(),
					candidate.getBirthYear());
		}
		catch(Exception e) {
			System.out.println("Not a valid person");
		}
		
		return serviceResult;
	}
	
}
