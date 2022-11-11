package com.sb101.beans;

public class Engineer {
	
	private int engineerid;
	private String engineername;
	private String engineerpass;
	private String category;
	private int complainid;
	
	public int getEngineerid() {
		return engineerid;
	}
	public void setEngineerid(int engineerid) {
		this.engineerid = engineerid;
	}
	public String getEngineername() {
		return engineername;
	}
	public void setEngineername(String engineername) {
		this.engineername = engineername;
	}
	public String getEngineerpass() {
		return engineerpass;
	}
	public void setEngineerpass(String engineerpass) {
		this.engineerpass = engineerpass;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getComplainid() {
		return complainid;
	}
	public void setComplainid(int complainid) {
		this.complainid = complainid;
	}
	public Engineer() {

	}
	public Engineer(int engineerid, String engineername, String engineerpass, String category, int complainid) {

		this.engineerid = engineerid;
		this.engineername = engineername;
		this.engineerpass = engineerpass;
		this.category = category;
		this.complainid = complainid;
	}
	@Override
	public String toString() {
		return "Engineer [engineerid=" + engineerid + ", engineername=" + engineername + ", engineerpass="
				+ engineerpass + ", category=" + category + ", complainid=" + complainid + "]";
	}
	
}
