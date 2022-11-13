package com.sb101.dao;

import java.util.List;

import com.sb101.beans.Engineer;
import com.sb101.beans.Problem;
import com.sb101.beans.Problem_Engineer;
import com.sb101.exceptions.EngineerException;

public interface EngineerDAO {
	
	public String login(Engineer e) throws EngineerException;
	
	public List<Problem_Engineer> viewProblemsAssigned(int engid) throws EngineerException;
	
	public String updateComplainStatus(int pid,int engid) throws EngineerException;
	
	public String changePassword(String email,String password) throws EngineerException;
	
}
