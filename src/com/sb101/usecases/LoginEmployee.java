package com.sb101.usecases;

import java.util.Scanner;

import com.sb101.beans.Employee;
import com.sb101.dao.EmployeeDAO;
import com.sb101.dao.EmployeeDAOImpl;
import com.sb101.exceptions.EmployeeException;

public class LoginEmployee {

	public static void main() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter employee email: ");
		String email = sc.next();
		
		System.out.print("Enter employee password: ");
		String pass = sc.next();
		
		Employee emp = new Employee(email, pass);
		
		EmployeeDAO dao = new EmployeeDAOImpl();
		
		try {
			String loginStatus = dao.loginEmployee(emp);
			System.out.println(loginStatus);
		} catch (EmployeeException e) {
			System.out.println(e.getMessage());
		}
		
		
	}
}
