package com.dal;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		HR hr = new HR();
	System.out.println(hr.DisplayResult());	
	}
}

class Employee{
	Scanner sc = new Scanner(System.in);
	int emp;
	String name;
	Employee()
	{
		System.out.println("Enter Employee Id ");
		emp = sc.nextInt();
		System.out.println("Enter Employee Name ");
		name = sc.next();
	}
	
	public String  DisplayResult()
	{
		return("Employee ID is "+emp+" And Employee name is "+ name);
	}
}

class HR extends Employee  {
	Salary sal = new Salary();
	double salary ;
	HR()
	{
		System.out.println("Enter Basic Salary");
		salary = sc.nextDouble();
		Calsalary(salary);
		
	}
	public String  DisplayResult() {
		return(super.DisplayResult()+" Salary Breck up is "+ sal);
	}
	
	public void Calsalary(double salary) {
		sal.setBasic(salary);
		sal.setHr(salary*0.5);
		sal.setDa((42*salary)/100);
		sal.setPf(salary*0.12);
		sal.setTotalsalary(sal.getBasic(), sal.getDa(), sal.getHr(), sal.getPf());
	}
}
