package com.ssa.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ssa.entity.UserSSNEnrollment;

public interface UserSSNEnrollmentRepository extends JpaRepository<UserSSNEnrollment, Long> {

	
	//public UserSSNEnrollment findBySsnNumber
	
	
}
