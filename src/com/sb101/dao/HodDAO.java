package com.sb101.dao;

import java.util.List;

import com.sb101.beans.Engineer;
import com.sb101.beans.Problem;
import com.sb101.beans.Problem_Engineer;
import com.sb101.exceptions.ComplainException;
import com.sb101.exceptions.EngineerException;
import com.sb101.exceptions.HODException;

public interface HodDAO {

	public String loginHOD(String username,String pass) throws HODException;
	
	public String registerNewEngineer(Engineer eng) throws EngineerException;
	
	public List<Engineer> listAllRegisteredEngineers() throws EngineerException;
	
	public String removeEngineer(int engid) throws EngineerException;
	
	public List<Problem_Engineer> viewAllProblems() throws ComplainException;

	public String assignComplainToEngineer(Problem prob, int engid) throws ComplainException, EngineerException;


	
}