package com.sb101.beans;

public class Employee {
	
	private int empid;
	private String empname;
	private String empusername;
	private String emppassword;
	
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmpusername() {
		return empusername;
	}
	public void setEmpusername(String empusername) {
		this.empusername = empusername;
	}
	public String getEmppassword() {
		return emppassword;
	}
	public void setEmppassword(String emppassword) {
		this.emppassword = emppassword;
	}

	public Employee() {

	}
	public Employee(String empusername, String emppassword) {

		this.empusername = empusername;
		this.emppassword = emppassword;
	}
	public Employee(String empname, String empusername, String emppassword) {

		this.empname = empname;
		this.empusername = empusername;
		this.emppassword = emppassword;
	}
	public Employee(int empid, String empname, String empusername, String emppassword, String empcategory) {

		this.empid = empid;
		this.empname = empname;
		this.empusername = empusername;
		this.emppassword = emppassword;
	}

	
	@Override
	public String toString() {
		
		return "Employee [empid=" + empid + ", empname=" + empname + ", empusername=" + empusername + ", emppassword="
				+ emppassword + "]";
	}
	
	
	
	
	
}
