package com.sb101.usecases;

import java.util.Scanner;

import com.sb101.beans.Problem;
import com.sb101.dao.EmployeeDAO;
import com.sb101.dao.EmployeeDAOImpl;
import com.sb101.exceptions.ComplainException;

public class RegisterNewProblem {

	public static void main() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter employee id");
		int empid = sc.nextInt();
		
		System.out.println("Enter problem category");
		String category = sc.next();
		
		System.out.println("Enter problem name");
		String name = sc.next();
		EmployeeDAO dao = new EmployeeDAOImpl();
		
		try {
			String registeredProblemStatus = dao.registerComplain(empid,category,name);
			System.out.println(registeredProblemStatus);
		} catch (ComplainException e) {
			System.out.println(e.getMessage()+" --------30");
		}
	}
}