package com.globalLogic.model;

import java.util.ArrayList;
import java.util.List;

public class Employee {

	private String Name;
	private int Age;
	private String Designation;
	private String employeeType;
	private ArrayList<Education> educations;
	private  ArrayList<EmploymentHistory> employment;

	
	
    public Employee() {
		super();
	}

	public Employee(String name, int age, String designation, String employeeType, ArrayList<Education> educations,
			ArrayList<EmploymentHistory> employment) {
		super();
		Name = name;
		Age = age;
		Designation = designation;
		this.employeeType = employeeType;
		this.educations = educations;
		this.employment = employment;
	}

	public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getDesignation() {
        return Designation;
    }

    public void setDesignation(String designation) {
        Designation = designation;
    }

    public String getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(String employeeType) {
        this.employeeType = employeeType;
    }





    /*public List<Education> getEducations() {
        return educations;
    }

    public void setEducations(List<Education> educations) {
        this.educations = educations;
    }*/

    public ArrayList<Education> getEducations() {
        return educations;
    }

    public void setEducations(ArrayList<Education> educations) {
        this.educations = educations;
    }

    public ArrayList<EmploymentHistory> getEmployment() {
        return employment;
    }

    public void setEmployment(ArrayList<EmploymentHistory> employment) {
        this.employment = employment;
    }

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [Name=");
		builder.append(Name);
		builder.append(", Age=");
		builder.append(Age);
		builder.append(", Designation=");
		builder.append(Designation);
		builder.append(", employeeType=");
		builder.append(employeeType);
		builder.append(", educations=");
		builder.append(educations);
		builder.append(", employment=");
		builder.append(employment);
		builder.append("]");
		return builder.toString();
	}
    
    
}
