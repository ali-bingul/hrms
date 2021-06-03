package com.alibingul.hrms.core.validation.concretes;

import java.util.UUID;

import com.alibingul.hrms.core.validation.abstracts.VerificationService;

public class VerificationManager implements VerificationService{

	@Override
	public boolean sendVerificationCode(String email) {
		UUID uuid = UUID.randomUUID();
		String code = uuid.toString();
		System.out.println(email + " Verification code sent to address, Verification code : " + code);
		return true;
	}
}
