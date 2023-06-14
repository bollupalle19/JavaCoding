
package com.mypack;

class Employee {

	int empno;
	String ename;

	Salary sal;
	
	public Employee() {
	  System.out.println("From Employee Constructor");
	  sal = new Salary();
	}
	
	public Employee(int x, String ename) {
		  this.empno=x;
		  this.ename=ename;
		  System.out.println("From Employee Constructor");
		  sal = new Salary();
	}

	public void getDetails() {
		System.out.println(empno + " -- " + ename + " --- " + sal);
	}
	
	 public void CalcSal(double basic) {
	        sal.setBasic(basic);
	        sal.setDa(0.2 * basic); 
	        sal.setPf(0.1 * basic); 
	        sal.setGross(basic + sal.getDa() - sal.getPf());
	        sal.setNet(sal.getGross());
	    }

}

class Manager extends Employee {
	String dept;
	String mname;
	int mid;
	
	public Manager() {}
	

	public Manager(int mid,String mname,String dept) {
		super(); 
		this.dept=dept;
		this.mname=mname;
		this.mid=mid;
		 // used to invoke base clas constructor
		System.out.println("From Mgr Constr");
	}



	public void getDetails() {
		System.out.println(mid + " -- " + mname + "--  " + dept);
	}
	
	

}

public class MainClass {

	public static void main(String[] args) {
		Employee emp = new Employee(1990088,"teja");
	     emp.CalcSal(50000); 
		 emp.getDetails();

		Manager mgr = new Manager(19,"Ravee","IT");
		
		mgr.getDetails();

	
	}

}