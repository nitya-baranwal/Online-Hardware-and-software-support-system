package com.sb101.usecases;

import java.util.Scanner;

import com.sb101.beans.Problem;
import com.sb101.dao.HodDAO;
import com.sb101.dao.HodDAOImpl;
import com.sb101.exceptions.ComplainException;
import com.sb101.exceptions.EngineerException;

public class AssignProblemToEngineer {

	public static void main() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter problem id");
		int pid = scanner.nextInt();
		
		System.out.println("Enter engineer id");
		int eid = scanner.nextInt();
		
		Problem problem = new Problem(pid);
		
		HodDAO dao = new HodDAOImpl();
		
		try {
			String assignStatus = dao.assignComplainToEngineer(problem, eid);
			System.out.println(assignStatus);
		} catch (EngineerException | ComplainException e) {
			System.out.println(e.getMessage());
		} 
		
		
		
	}
}
