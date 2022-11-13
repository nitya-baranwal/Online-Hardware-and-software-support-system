package com.sb101.usecases;

import java.util.Scanner;

import com.sb101.dao.EngineerDAO;
import com.sb101.dao.EngineerDAOImpl;
import com.sb101.exceptions.EngineerException;

public class EngineerUpdateProblemStatus {

	public static void main() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter problem id:");
		int pid = scanner.nextInt();
		
		System.out.println("Enter engineer id:");
		int engid = scanner.nextInt();
		
		EngineerDAO dao = new EngineerDAOImpl();
		
		try {
			String updatedProblemStatus = dao.updateComplainStatus(pid, engid);
			System.out.println(updatedProblemStatus);
		} catch (EngineerException e) {
			System.out.println(e.getMessage());
		}
		
		
	}
}
