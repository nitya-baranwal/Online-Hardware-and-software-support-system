package com.sb101.usecases;

import java.util.Scanner;

import com.sb101.beans.Employee;
import com.sb101.dao.EmployeeDAO;
import com.sb101.dao.EmployeeDAOImpl;
import com.sb101.exceptions.EmployeeException;

public class RegisterEmployee {

	public static void main() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter employee name: ");
		String name = sc.next();
		
		System.out.print("Enter employee email: ");
		String email = sc.next();
		
		System.out.print("Enter employee password: ");
		String password = sc.next();
		
		Employee emp = new Employee(name,email,password);
		
		EmployeeDAO dao = new EmployeeDAOImpl();
		
		try {
			String registrationStatus = dao.registerEmployee(emp);
			System.out.println(registrationStatus);
		} catch (EmployeeException e) {
			System.out.println(e.getMessage());
		}
		
	}
}
