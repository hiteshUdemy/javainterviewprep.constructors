package org.javainterviewprep.examples.constructor;

//An Intern should have schoolName at creation time.
//An Intern is a Employee
public class Intern extends Employee {

	public Intern(String schoolName , int empId) {
		super(empId);
		this.schoolName = schoolName;
		System.out.println("Creating Intern");
	}

	private String schoolName;

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
}
