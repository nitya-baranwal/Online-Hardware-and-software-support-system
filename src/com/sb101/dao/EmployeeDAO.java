package com.sb101.dao;

import com.sb101.beans.Employee;
import com.sb101.exceptions.ComplainException;
import com.sb101.exceptions.EmployeeException;

public interface EmployeeDAO {
	
	public String registerEmployee(Employee emp) throws EmployeeException;

	public String loginEmployee(Employee emp) throws EmployeeException;
	
	public String registerComplain(String complain) throws ComplainException;
	//return complain id after registering a complaint
	
	public String checkComplainStatus(int complainid) throws ComplainException;
	//complain is assigned to which engineer
	
	public String checkComplainHistory(int empid) throws EmployeeException,ComplainException;
	//all complains registered by employee
	
	public String changePassword(int empid) throws EmployeeException;
	
}
