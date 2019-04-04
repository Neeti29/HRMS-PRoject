package com.niit.hrms.model;

import javax.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {

	private String firstName;
	private String lastName;
	private String password;
	private String confirmPassword;
	private String emailId;
	private String phoneNo;
	private String jobTitle;
	private String gender;
	private String skills;
	private String dob;
	private String projectName;
	
	
}
