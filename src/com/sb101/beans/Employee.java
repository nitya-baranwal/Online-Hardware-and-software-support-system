package com.sb101.beans;

public class Employee {
	
	private int empid;
	private String empname;
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
	public String getEmppassword() {
		return emppassword;
	}
	public void setEmppassword(String emppassword) {
		this.emppassword = emppassword;
	}
	
	public Employee() {

	}
	public Employee(int empid, String empname, String emppassword) {

		this.empid = empid;
		this.empname = empname;
		this.emppassword = emppassword;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", emppassword=" + emppassword + "]";
	}
	
}
