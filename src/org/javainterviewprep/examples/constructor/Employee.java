package org.javainterviewprep.examples.constructor;

/* Q1: What is Constructor ?
 * Constructor for a class is a piece of code which resemble characteristic of a method, 
 * but its only purpose is to create object of the class.
 * Methods are for executing java code or business logic.
 * 
 * Q2:  What are characteristic of Constructors ?
 * - constructors is defined with name of the class.
 * - constructors can be specified with access modifiers.
 * - constructors can have arguments like a method.
 * - Sub-Class constructors uses Super( ) to call parent class constructor.
 * 
 */
//An Employee should have an EmployeeId at creation time
public class Employee {

	private int employeeId;
	
	private Employee()
	{
		//Restricting Employee creation without EmployeeId
	}
	
	public Employee(int empId)
	{
		this();//not required, but a good practice.
		System.out.println("Creating Employee with Id : " + empId);
		this.employeeId = empId;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
}
