package com.alibingul.hrms.core.adapter;

import java.rmi.RemoteException;
import java.util.Locale;

import com.alibingul.hrms.entities.concretes.Candidate;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CheckMernisService{
 
	@Override
	public boolean checkIfRealTcNo(Candidate candidate) {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		
		boolean serviceResult = false;
		
		try {
			serviceResult = client.TCKimlikNoDogrula(Long.parseLong(candidate.getIdentityNumber()),
					candidate.getFirstName().toUpperCase(new Locale("tr")),
					candidate.getLastName().toUpperCase(new Locale("tr")),
					candidate.getBirthYear());
		}
		catch(RemoteException e) {
			//System.out.println("Not a valid person");
			e.printStackTrace();
		}
		
		return serviceResult;
	}
	
}
