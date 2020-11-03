package com.ssa.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
public class ApiSuccess {
	private Integer succCode;
	private String succMsg;
	private String resp;
	
}
