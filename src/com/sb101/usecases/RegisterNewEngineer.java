package com.sb101.usecases;

import java.util.Scanner;

import com.sb101.beans.Engineer;
import com.sb101.dao.HodDAO;
import com.sb101.dao.HodDAOImpl;
import com.sb101.exceptions.EngineerException;

public class RegisterNewEngineer {
	
	public static void main() {		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter engineer email: ");
		String email = sc.next();
		
		System.out.print("Enter engineer password: ");
		String password = sc.next();
		
		System.out.print("Enter engineer name: ");
		String name = sc.next();

		System.out.print("Enter engineer category: ");
		String category = sc.next();
		
		Engineer eng = new Engineer(name,email,password,category);
		
		HodDAO dao = new HodDAOImpl();
		
		try {
			String registerEngineerStatus = dao.registerNewEngineer(eng);
			System.out.println(registerEngineerStatus);
		} catch (EngineerException e) {
			System.out.println(e.getMessage());
		}
		
	}
}
