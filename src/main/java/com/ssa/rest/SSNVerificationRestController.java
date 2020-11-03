package com.ssa.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssa.entity.UserSSNEnrollment;

import com.ssa.service.IEnrollmentService;



@RestController
@RequestMapping("/ssnVerfication")

public class SSNVerificationRestController {
	@Autowired
	private IEnrollmentService enrollService;
	
	@GetMapping("/getCitizenData/{ssn}")
	
	public ResponseEntity<UserSSNEnrollment>  saveUserForEnrollment(@PathVariable Long ssn) {
	UserSSNEnrollment userEnrollment=enrollService.verifySSNNumber(ssn);
	return new ResponseEntity<UserSSNEnrollment>(userEnrollment,HttpStatus.OK);
		
}}
