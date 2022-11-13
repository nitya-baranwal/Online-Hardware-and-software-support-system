package com.sb101.usecases;

import java.util.Scanner;

import com.sb101.dao.EmployeeDAO;
import com.sb101.dao.EmployeeDAOImpl;
import com.sb101.exceptions.EmployeeException;


public class EmployeeUpdatePassword {

public static void main() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter employee username");
		String email= sc.next();
		
		System.out.println("Enter new password");
		String newPass = sc.next();
		
		EmployeeDAO dao = new EmployeeDAOImpl();
		
		try {
			String passwordUpdate = dao.changePassword(email,newPass);
			System.out.println(passwordUpdate);
		} catch (EmployeeException e) {
			System.out.println(e.getMessage()+"---28");
		}
		
		
	}
}
