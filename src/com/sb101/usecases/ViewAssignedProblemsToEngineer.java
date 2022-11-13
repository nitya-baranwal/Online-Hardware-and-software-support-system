package com.sb101.usecases;

import java.util.List;
import java.util.Scanner;

import com.sb101.beans.Engineer;
import com.sb101.beans.Problem;
import com.sb101.beans.Problem_Engineer;
import com.sb101.dao.EngineerDAO;
import com.sb101.dao.EngineerDAOImpl;
import com.sb101.exceptions.EngineerException;

public class ViewAssignedProblemsToEngineer {

	public static void main() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter engineer id");
		int engid = scanner.nextInt();
		
		EngineerDAO dao = new EngineerDAOImpl();
		
		try {
			List<Problem_Engineer> list = dao.viewProblemsAssigned(engid);
			
			
			list.forEach(p -> System.out.println(p));
			
			
		} catch (EngineerException e) {
			System.out.println(e.getMessage());
		}
	}
}
