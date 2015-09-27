package org.javainterviewprep.examples.constructors;

//An Intern should have schoolName at creation time.
//An Intern is an Employee
public class Intern extends Employee{
	
	private String schoolName;
	
	public Intern(String schoolName, int empId)
	{
		super(empId);
		this.schoolName = schoolName;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
}
