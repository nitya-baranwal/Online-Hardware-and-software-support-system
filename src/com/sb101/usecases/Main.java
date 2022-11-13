package com.sb101.usecases;

import java.util.Scanner;

import com.sb101.dao.HodDAO;
import com.sb101.dao.HodDAOImpl;

public class Main {
	
	public static void m() {

		System.out.println("________________________________________\n"
						+ "|                                       |\n"
						+ "|    ---Welcome to OHS System---        |\n"
						+ "|  Select a user to proceed:            |\n"
						+ "|  1. HOD                               |\n"
						+ "|  2. Engineer                          |\n"
						+ "|  3. Employee                          |\n"
						+ "|  4. Exit                              |\n"
						+ "|_______________________________________|");
		
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			m();
			int n = sc.nextInt();
			
				// 1. HOD
				if(n==1) {
					System.out.println("Please login to continue...");
					
					LoginHOD.main();
					while(true) {
						
						System.out.println("________________________________________\n"
										+ "|                                       |\n"
										+ "|  1. Register a new Engineer           |\n"
										+ "|  2. Show List of Engineers            |\n"
										+ "|  3. Remove an Engineer                |\n"
										+ "|  4. Show All Problems                 |\n"
										+ "|  5. Assign a Problem to An Engineer   |\n"
										+ "|  6. Exit                              |\n"
										+ "|_______________________________________|");
						
						
						int nhod = sc.nextInt(); 
						if(nhod==1) {	
							RegisterNewEngineer.main();
						}else if(nhod==2) {
							ShowListOfAllEngineers.main();
						}else if(nhod==3) {
							DeleteAnEngineer.main();
						}else if(nhod==4) {
							ShowAllProblemsToHod.main();
						}else if(nhod==5) {
							AssignProblemToEngineer.main();
						}else if(nhod==6) {
							break;
						}else {
							System.out.println("Invalid input..!");
						}
						
					}
				}
				
				// 2. Engineer
				else if(n==2){
					
					System.out.println("Please login to continue...");
					
					LoginEngineer.main();
					while(true) {
						
						System.out.println("________________________________________\n"
										+ "|                                       |\n"
										+ "|  1. View assigned problems by HOD     |\n"
										+ "|  2. Update the status of a problem    |\n"
										+ "|  3. Change password                   |\n"
										+ "|  4. Exit                              |\n"
										+ "|_______________________________________|");
						
						int nhod = sc.nextInt(); 
						if(nhod==1) {	
							ViewAssignedProblemsToEngineer.main();
						}else if(nhod==2) {
							
						}else if(nhod==3) {
							EngineerUpdatePassword.main();
						}else if(nhod==4) {
							break;
						}else {
							System.out.println("Invalid input..!");
						}
						
					}
				}
				
				// 3. Employee
				else if(n==3){
					while(true) {
						System.out.println("________________________________________\n"
										+ "|                                       |\n"
										+ "|  1. Register a new Employee           |\n"
										+ "|  2. Login a new Employee              |\n"
										+ "|  3. Exit                              |\n"
										+ "|_______________________________________|");
						int nhod = sc.nextInt();
						if(nhod==1) {	
							RegisterEmployee.main();
						}else if(nhod==2) {
							LoginEmployee.main();
							while(true) {
								sc.nextLine();
								System.out.println("________________________________________\n"
										+ "|                                       |\n"
										+ "|  1. Register a new complain           |\n"
										+ "|  2. Status of a problem               |\n"
										+ "|  3. View all complain history         |\n"
										+ "|  4. Change password                   |\n"
										+ "|  5. Exit                              |\n"
										+ "|_______________________________________|");
								
								int nemp = sc.nextInt();
								if(nemp==1) {
									RegisterNewProblem.main();
								}else if(nemp==2) {
									CheckComplainStatus.main();
								}else if(nemp==3) {
									CheckComplainHistory.main();
								}else if(nemp==4) {
									EmployeeUpdatePassword.main();
								}else if(nemp==5) {
									break;
								}else {
									System.out.println("Invalid Input..!");
								}
							}
							
							
						}else if(nhod==3){
							break;
						}else {
							System.out.println("Invalid Input..!");;
						}
						
						
					}
				}
				
				else if(n==4){
					
					System.out.println("Thank you..!");
					break;
				}
				else {
					System.out.println("Invalid Input..!");
				}
				
			}
			
		}
		
		
	
}
