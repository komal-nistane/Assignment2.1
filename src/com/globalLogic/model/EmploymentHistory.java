package com.globalLogic.model;

public class EmploymentHistory {
	private String organizationName;
	private String duration;
	private String project;

	
	
	public EmploymentHistory() {
		super();
	}

	public EmploymentHistory(String organizationName, String duration, String project) {
		super();
		this.organizationName = organizationName;
		this.duration = duration;
		this.project = project;
	}

	public String getOrganizationName() {
		return organizationName;
	}

	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}
}
