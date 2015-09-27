package org.javainterviewprep.examples.constructors;

public class ConstructorTest {

	public static void main(String[] args) {
		Employee emp1 = new Employee(123);
		System.out.println("Employee was created with EmpId " + emp1.getEmployeeId());
		
		Intern intern1 = new Intern("JavaInterviewPrep", 456);
		System.out.println("Inter was created with School Name : " + intern1.getSchoolName() + " Employee Id " + intern1.getEmployeeId());
	}
}
