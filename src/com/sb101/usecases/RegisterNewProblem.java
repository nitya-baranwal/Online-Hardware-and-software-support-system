package com.sb101.usecases;

import java.util.Scanner;

import com.sb101.beans.Problem;
import com.sb101.dao.EmployeeDAO;
import com.sb101.dao.EmployeeDAOImpl;
import com.sb101.exceptions.ComplainException;

public class RegisterNewProblem {

	public static void main() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter employee id: ");
		int empid = sc.nextInt();
		
		System.out.print("Enter problem category:\n1.Software\n2.Hardware\n");
		int category_type = sc.nextInt();
		String category;
		if(category_type==1) category="Software";
		else if(category_type==2) category="Hardware";
		else {
			System.out.println("Invalid input, enter correct problem category");
			return;
		}
		
		System.out.print("Enter problem name: ");
		String name = sc.next();
		EmployeeDAO dao = new EmployeeDAOImpl();
		
		try {
			String registeredProblemStatus = dao.registerComplain(empid,category,name);
			System.out.println(registeredProblemStatus);
		} catch (ComplainException e) {
			System.out.println(e.getMessage());
		}
	}
}