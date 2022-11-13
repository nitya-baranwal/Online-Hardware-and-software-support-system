package com.sb101.usecases;

import java.util.List;
import java.util.Scanner;

import com.sb101.beans.Employee;
import com.sb101.beans.Problem;
import com.sb101.beans.Problem_Engineer;
import com.sb101.dao.EmployeeDAO;
import com.sb101.dao.EmployeeDAOImpl;
import com.sb101.exceptions.ComplainException;
import com.sb101.exceptions.EmployeeException;

public class CheckComplainHistory {

	public static void main() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter employee id");
		int empid = sc.nextInt();
		
		Employee emp = new Employee();
		emp.setEmpid(empid);
		
		EmployeeDAO dao = new EmployeeDAOImpl();
		
		try {
			List<Problem_Engineer> problemsRegisteredByEmployee = dao.checkComplainHistory(emp);
			
			problemsRegisteredByEmployee.forEach(p -> System.out.println(p));
			
			
			
		} catch (EmployeeException e) {
			System.out.println(e.getMessage());
		} catch (ComplainException e) {
			System.out.println(e.getMessage());
		}

		
		
	}
}
