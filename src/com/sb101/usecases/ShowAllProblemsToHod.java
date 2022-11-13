package com.sb101.usecases;

import java.util.List;

import com.sb101.beans.Problem;
import com.sb101.beans.Problem_Engineer;
import com.sb101.dao.HodDAO;
import com.sb101.dao.HodDAOImpl;
import com.sb101.exceptions.ComplainException;

public class ShowAllProblemsToHod {

	public static void main() {
		
		
		HodDAO dao = new HodDAOImpl();
		
		
		try {
			List<Problem_Engineer> pList = dao.viewAllProblems();
			
			pList.forEach(p -> System.out.println(p));
			
		} catch (ComplainException e) {
			System.out.println(e.getMessage());
		}
		
		
		
	}
}
