package com.ssa.service;



import com.ssa.entity.UserSSNEnrollment;

public interface IEnrollmentService {
	
	public Long saveUserForEnrollment(UserSSNEnrollment user);
	
	public UserSSNEnrollment verifySSNNumber(Long ssnNumber);
	
	//public Integer generateSSNNumber();
	
	//public boolean uploadImage(File file);

}
