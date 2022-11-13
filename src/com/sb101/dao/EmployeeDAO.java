package com.sb101.dao;

import java.util.List;

import com.sb101.beans.Employee;
import com.sb101.beans.Problem;
import com.sb101.beans.Problem_Engineer;
import com.sb101.exceptions.ComplainException;
import com.sb101.exceptions.EmployeeException;

public interface EmployeeDAO {
	
	public String registerEmployee(Employee emp) throws EmployeeException;

	public String loginEmployee(Employee emp) throws EmployeeException;

	public String changePassword(String email, String password) throws EmployeeException;
	
	public String registerComplain(int empid,String category,String name) throws ComplainException;

	public List<Problem_Engineer> checkComplainHistory(Employee emp) throws EmployeeException, ComplainException;

	public String checkComplainStatus(int problemid) throws ComplainException;
}
