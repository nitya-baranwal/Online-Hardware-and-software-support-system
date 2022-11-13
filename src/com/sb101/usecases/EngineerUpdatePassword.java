package com.sb101.usecases;

import java.util.Scanner;

import com.sb101.dao.EngineerDAO;
import com.sb101.dao.EngineerDAOImpl;
import com.sb101.exceptions.EngineerException;

public class EngineerUpdatePassword {

	public static void main() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter engineer username");
		String email= sc.next();
		
		System.out.println("Enter new password");
		String newPass = sc.next();
		
		
		EngineerDAO dao = new EngineerDAOImpl();
		
		try {
			String passwordUpdate = dao.changePassword(email,newPass);
			System.out.println(passwordUpdate);
		} catch (EngineerException e) {
			System.out.println(e.getMessage()+"---28");
		}
		
		
	}
}
