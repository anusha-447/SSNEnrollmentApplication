package com.ssa.rest;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssa.config.AppPropertiesConfig;
import com.ssa.constants.SSNAppConstants;
import com.ssa.entity.UserSSNEnrollment;
import com.ssa.exceptions.ApiError;
import com.ssa.exceptions.ApiSuccess;
import com.ssa.service.IEnrollmentService;

@RestController
@RequestMapping("/enrollment")
public class SSNEnrollmentRestController {

	@SuppressWarnings("unused")
	@Autowired
	private IEnrollmentService enrollService;
	@Autowired
	private AppPropertiesConfig appProps;

	@PostMapping("/save")
	public ResponseEntity<?> saveUserForEnrollment(@RequestBody UserSSNEnrollment userSSNEnrollment) {
		ResponseEntity<?> resp=null;
		try {
			Long ssnId=enrollService.saveUserForEnrollment(userSSNEnrollment);
			if(ssnId!=null) {
				//ApiSuccess success=new ApiSuccess(200,appProps.getMessages().get(SSNAppConstants.ENROLL_SUCCESS),ssnId.toString());
				resp=new ResponseEntity<String>(appProps.getMessages().get(SSNAppConstants.ENROLL_SUCCESS),HttpStatus.OK);
			}
			else
			{

			}
		} 
		catch (Exception e) {
			ApiError error=new ApiError(500,appProps.getMessages().get(SSNAppConstants.ENROLL_FAILURE),new Date());
			resp=new ResponseEntity<ApiError>(error,HttpStatus.INTERNAL_SERVER_ERROR);
			e.printStackTrace();
		}
		return resp;



	}








}
