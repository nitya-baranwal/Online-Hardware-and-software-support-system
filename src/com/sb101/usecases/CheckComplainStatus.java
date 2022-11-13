package com.sb101.usecases;

import java.util.Scanner;

import com.mysql.cj.protocol.Message;
import com.sb101.beans.Problem;
import com.sb101.dao.EmployeeDAO;
import com.sb101.dao.EmployeeDAOImpl;
import com.sb101.exceptions.ComplainException;

public class CheckComplainStatus {

	public static void main() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter problem id");
		int pid = scanner.nextInt();
		
		EmployeeDAO dao = new EmployeeDAOImpl();
		
		try {
			String problemStatus = dao.checkComplainStatus(pid);
			System.out.println(problemStatus);
		} catch (ComplainException e) {
			System.out.println(e.getMessage() + " --28");
		}
		
		
	}
}
