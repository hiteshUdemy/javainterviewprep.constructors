package org.javainterviewprep.examples.constructor;

public class ContractorTest {

	public static void main(String[] args) {
		
		Employee emp =  new Employee(123);
		System.out.println("I am Employee with id " + emp.getEmployeeId());
		
		Intern newIntern = new Intern("JavaSchool", 456);
		System.out.println("Intern with School : " + newIntern.getSchoolName() + " and with Emp Id : " + newIntern.getEmployeeId());
	}
}
