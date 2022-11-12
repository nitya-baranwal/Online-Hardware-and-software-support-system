package com.sb101.dao;

import com.sb101.beans.Engineer;
import com.sb101.exceptions.ComplainException;
import com.sb101.exceptions.EngineerException;
import com.sb101.exceptions.HODException;

public interface HodDAO {

	public String loginHOD(String username,String pass) throws HODException;
	
	public String registerNewEngineer(Engineer eng) throws EngineerException;
	
	public String listAllRegisteredEngineers() throws EngineerException;
	
	public String removeEngineer(int engid) throws EngineerException;
	
	public String viewAllProblems() throws ComplainException;
	
	public String assignComplainToEngineer(int complainid) throws ComplainException;


	
}