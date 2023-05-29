package com.dal.model;

import java.io.Serializable;

public class Employee implements Serializable{
	
	public Employee() {
		super();
		
	}

	public Employee(int eno, String ename) {
		super();
		this.empno = eno;
		this.empname = ename;
	}
	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", empname=" + empname + "]";
	}
	private int empno;
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	private String empname;
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	
}
