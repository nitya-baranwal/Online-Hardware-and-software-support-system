package com.sb101.usecases;

import java.util.Scanner;

import com.sb101.dao.HodDAO;
import com.sb101.dao.HodDAOImpl;
import com.sb101.exceptions.EngineerException;

public class DeleteAnEngineer {

	public static void main() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter engineer id");
		int engid = sc.nextInt();
		
		HodDAO dao = new HodDAOImpl();
		
		try {
			String removeStatus = dao.removeEngineer(engid);
			System.out.println(removeStatus);
		} catch (EngineerException e) {
			System.out.println("No such Engineer found..!");
		}
		
		
	}
}
