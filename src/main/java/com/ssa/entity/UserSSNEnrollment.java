package com.ssa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Entity
@Data
@Table(name="user_enrollment")
public class UserSSNEnrollment {
	@Id
	@GeneratedValue(generator = "ssn")
	@GenericGenerator(name="ssn",strategy = "com.ssa.generators.SSNGenerator")
	@Column(name="ssn_number")
	private Long ssnNumber;
	@Column(name="first_name")
	private String firstName;
	@Column(name="last_name")
	private String lastName;
	@Column(name="dob")
	private String DOB;
	@Column(name="gender")
	private String gender;
	@Column(name="state")
	private String stateName;
//	@Lob
//	@Column(name="user_image")
//	private byte[] photo; 
	

}
