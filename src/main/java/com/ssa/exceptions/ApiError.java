package com.ssa.exceptions;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ApiError {

	
	private Integer errorCode;
	private String errorMsg;
	private Date date;
}
