package com.globalLogic.Employee;

import java.util.ArrayList;
import java.util.Scanner;

import com.globalLogic.model.Education;
import com.globalLogic.model.Employee;
import com.globalLogic.model.EmploymentHistory;

public class EmployeeHandler {

	public static void main(String[] args) {
		ArrayList<Employee> empList = new ArrayList<Employee>();
		EmployeeHandler empHandler = new EmployeeHandler();
		empHandler.addEmployee(empList);
		empHandler.printDevelopers(empList);
		empHandler.printEmployeeWithSingleOrgs(empList);
		empHandler.printEmployeeWith2OrMoreYrsExp(empList);

	}

	public void addEmployee(ArrayList<Employee> empList) {

		ArrayList<EmploymentHistory> empHistoryList = new ArrayList<>();
		empHistoryList.add(new EmploymentHistory("GL", "2", "ABC"));
		empHistoryList.add(new EmploymentHistory("XYZ Infotech", "1", "XYZ"));

		ArrayList<Education> educationList = new ArrayList<>();
		educationList.add(new Education("BE", "70", "10-05-2007"));
		educationList.add(new Education("ME", "70", "10-07-2009"));

		Employee employee = new Employee("Ram", 27, "Software Engineer", "Developer", educationList, empHistoryList);

		ArrayList<EmploymentHistory> empHistoryList2 = new ArrayList<>();
		empHistoryList2.add(new EmploymentHistory("GL", "6", "ABC"));

		ArrayList<Education> educationList2 = new ArrayList<>();
		educationList2.add(new Education("BE", "70", "10-05-2007"));

		Employee employee2 = new Employee("Sanket", 36, "Software Engineer", "manager", educationList2,
				empHistoryList2);
		
		ArrayList<EmploymentHistory> empHistoryList3 = new ArrayList<>();
		empHistoryList3.add(new EmploymentHistory("TCS", "6", "XYZ"));
		
		ArrayList<Education> educationList3 = new ArrayList<>();
		educationList3.add(new Education("ME", "80", "10-05-2008"));
		
		Employee employee3 = new Employee("Sushil", 36, "Software Engineer", "Tester", educationList3,
				empHistoryList3);
		
		ArrayList<EmploymentHistory> empHistoryList4 = new ArrayList<>();
		empHistoryList4.add(new EmploymentHistory("TechM", "6", "XYZ"));
		
		ArrayList<Education> educationList4 = new ArrayList<>();
		educationList4.add(new Education("ME", "80", "10-05-2008"));
		
		Employee employee4 = new Employee("Shyam", 36, "Software Engineer", "Developer", educationList4,
				empHistoryList4);
		
		empList.add(employee);
		empList.add(employee2);
		empList.add(employee3);
		empList.add(employee4);

	}

	public void printDevelopers(ArrayList<Employee> empList) {
		System.out.println("");
		System.out.println("**********************");
		System.out.println("All Employees who are developers");

		for (Employee emp : empList) {
			if (emp.getEmployeeType().equalsIgnoreCase("Developer")) {
				System.out.print(" Name:" + emp.getName() + ", Age:" + emp.getAge() + ", Designation:"
						+ emp.getDesignation() + ", Employee Type:" + emp.getEmployeeType());

				for (Education edu : emp.getEducations()) {
					System.out.print("\n Degree:" + edu.getDegree() + ", Aggregate:" + edu.getPercent()
							+ ", Completion Date:" + edu.getDate());
				}
				for (EmploymentHistory employementHistory : emp.getEmployment()) {
					System.out.print("\n Organization Name:" + employementHistory.getOrganizationName() + ", Duration:"
							+ employementHistory.getDuration() + ", Project:" + employementHistory.getProject());
					System.out.println("");
				}

			}
		}
		
	}

	public void printEmployeeWithSingleOrgs(ArrayList<Employee> empList) {
		System.out.println("");
		System.out.println("**********************");
		System.out.println("All Employees who have not worked in another organization");

		for (Employee emp : empList) {
			if (emp.getEmployment().size() < 2) {
				  System.out.print(" Name:" + emp.getName() + ", Age:" + emp.getAge() +
				 ", Designation:" + emp.getDesignation() + ", Employee Type:" +
				 emp.getEmployeeType()); System.out.println("");
			}
		}
		System.out.println("");
	}

	public void printEmployeeWith2OrMoreYrsExp(ArrayList<Employee> empList) {
		System.out.println("");
		System.out.println("**********************");
		System.out.println("All Employees having who have experience more than two years and are Developers");
		int experience = 0;
		for (Employee emp : empList) {
			if (emp.getEmployeeType().equals("Developer")) {

				for (EmploymentHistory employementHistory : emp.getEmployment()) {

					if (experience == 0) {
						experience = Integer.parseInt(employementHistory.getDuration());
					} else {
						experience = experience + Integer.parseInt(employementHistory.getDuration());
					}
				}
				if (experience >= 2) {
					System.out.print(" Name:" + emp.getName() + ", Age:" + emp.getAge() + ", Designation:"
							+ emp.getDesignation() + ", Employee Type:" + emp.getEmployeeType());
					System.out.println("");
				}
			}
			
		}
		System.out.println("");
	}

	// Print all employees who are developers
	// Print all employee names who have not worked in other organizations
	// Print all employee names who have experience more than two years and are
	// developers
	// Add data

}
