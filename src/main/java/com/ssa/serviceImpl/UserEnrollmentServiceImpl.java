package com.ssa.serviceImpl;



import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssa.entity.UserSSNEnrollment;
import com.ssa.exceptions.RecordNotFoundException;
import com.ssa.repo.UserSSNEnrollmentRepository;
import com.ssa.service.IEnrollmentService;
@Service
public class UserEnrollmentServiceImpl implements IEnrollmentService {
	@Autowired
    private UserSSNEnrollmentRepository enrollRepo;
	@Override
	public Long saveUserForEnrollment(UserSSNEnrollment user) {
		// TODO Auto-generated method stub
		UserSSNEnrollment userEnrollment=enrollRepo.save(user);
		
		return userEnrollment.getSsnNumber();
	}

	@Override
	public UserSSNEnrollment verifySSNNumber(Long ssnNumber) {
		// TODO Auto-generated method stub
		Optional<UserSSNEnrollment> userEnrollment=enrollRepo.findById(ssnNumber);
		if(userEnrollment.isPresent()) {
			return userEnrollment.get();
		}
		else {
			throw new RecordNotFoundException("There is no record with given Id");
		}
	}

	

}
