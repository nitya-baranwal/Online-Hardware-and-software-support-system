package com.sb101.beans;

public class Engineer {
	
	private int engid;
	private String engname;
	private String enguser;
	private String engpass;
	private String category;
	
	public int getEngid() {
		return engid;
	}
	public void setEngid(int engid) {
		this.engid = engid;
	}
	public String getEngname() {
		return engname;
	}
	public void setEngname(String engname) {
		this.engname = engname;
	}
	public String getEnguser() {
		return enguser;
	}
	public void setEnguser(String enguser) {
		this.enguser = enguser;
	}
	public String getEngpass() {
		return engpass;
	}
	public void setEngpass(String engpass) {
		this.engpass = engpass;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	
	public Engineer() {

	}
	
	
	public Engineer(String enguser, String engpass) {
		super();
		this.enguser = enguser;
		this.engpass = engpass;
	}
	public Engineer(String engname, String enguser, String engpass, String category) {
		super();
		this.engname = engname;
		this.enguser = enguser;
		this.engpass = engpass;
		this.category = category;
	}
	public Engineer(String enguser, String engpass, String category) {

		this.enguser = enguser;
		this.engpass = engpass;
		this.category = category;
	}
	public Engineer(int engid, String engname, String enguser, String engpass, String category) {

		this.engid = engid;
		this.engname = engname;
		this.enguser = enguser;
		this.engpass = engpass;
		this.category = category;
	}
	@Override
	public String toString() {
		return "\n\nEngineer [engid=" + engid + ", engname=" + engname + ", enguser=" + enguser + ", engpass=" + engpass
				+ ", category=" + category + "]";
	}
	
	
	
	
	
	
}
