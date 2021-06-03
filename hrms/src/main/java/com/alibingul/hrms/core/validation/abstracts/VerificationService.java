package com.alibingul.hrms.core.validation.abstracts;

public interface VerificationService {
	boolean sendVerificationCode(String email);
}
