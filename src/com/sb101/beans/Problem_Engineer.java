package com.sb101.beans;

public class Problem_Engineer {

	private int problemid;
	private int engid;
	private int empid;
	private String name;
	private String category;
	private String status;
	
	public int getProblemid() {
		return problemid;
	}
	public void setProblemid(int problemid) {
		this.problemid = problemid;
	}
	public int getEngid() {
		return engid;
	}
	public void setEngid(int engid) {
		this.engid = engid;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Problem_Engineer() {
		super();
	}
	
	
	public Problem_Engineer(int problemid, int empid, String name, String category) {
		super();
		this.problemid = problemid;
		this.empid = empid;
		this.name = name;
		this.category = category;
	}
	
	public Problem_Engineer(int problemid, int engid, int empid, String name, String category, String status) {
		super();
		this.problemid = problemid;
		this.engid = engid;
		this.empid = empid;
		this.name = name;
		this.category = category;
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "Problem_Engineer [problemid=" + problemid + ", engid=" + engid + ", empid=" + empid + ", name=" + name
				+ ", category=" + category + ", status=" + status + "]";
	}
	
	
	
	
}
