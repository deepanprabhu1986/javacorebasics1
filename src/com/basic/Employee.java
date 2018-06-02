package com.basic;

public class Employee {
	String firstName;
	String lastName;
	Double monthlySalary;
	
	
	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public Double getMonthlySalary() {
		return monthlySalary;
	}


	public void setMonthlySalary(Double monthlySalary) {
		
		this.monthlySalary = monthlySalary;
		if(this.monthlySalary<0) {
			this.monthlySalary=0.0;
		}
		System.out.println("Salary is"+this.monthlySalary);
	}

public void yearlySalary() {
	double z=this.monthlySalary*12;
	System.out.println("The yearly salary is "+z );
	double z1=this.monthlySalary*12*1.1;
	System.out.println("The yearly salary after raise  is "+ z1);
	
	
}


	public static void main(String args[]) {
		Employee e1=new Employee();
		Employee e2=new Employee();
		e1.setMonthlySalary(10000.0);
		e2.setMonthlySalary(12000.0);
		
		e1.yearlySalary();
		e2.yearlySalary();
		
	}

}
