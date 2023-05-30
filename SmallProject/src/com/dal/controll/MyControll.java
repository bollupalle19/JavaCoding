package com.dal.controll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.dal.model.Employee;

import java.io.*;

public class MyControll {
	Scanner sc = new Scanner(System.in);
	Employee emp;
	List l = new ArrayList<>();

	public void AddEmpDetails() {
		emp = new Employee();
//			emp.setEmpname("Ravikumar.bollupalle");
//			emp.setEmpno(19000955);
		System.out.println("Enter Emp number");
		int No = sc.nextInt();
		emp.setEmpno(No);
		System.out.println("Enter Employee Name Is");
		String name = sc.next();
		emp.setEmpname(name);
		l.add(emp);

	}

	public void viewEmployeelist() {
//			System.out.println("You enter Emp number is "+emp.getEmpno());
//			System.out.println("You Enter Emp number is "+ emp.getEmpname());
		l.forEach(emp-> System.out.println(emp));
		//System.out.println(l);
		
	}

	public void SerialEgMehode() throws IOException {
		try {
			FileOutputStream fos = new FileOutputStream("dedalus.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(l);
			System.out.println("Serilized to file dedalus.txt");
			oos.close();
			fos.close();
		} catch (FileNotFoundException fnf) {
			System.out.println("No file");
		}
	}

	public void DeSerialEgMehode() throws IOException {
		try {

			FileInputStream fis = new FileInputStream("dedalus.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			ArrayList<Employee> emp = (ArrayList<Employee>) ois.readObject();
			System.out.println("DeSerilized from file dedalus.txt");
			System.out.println(emp);
			//System.out.println(emp.getEmpname());
			ois.close();
			fis.close();
		} catch (FileNotFoundException fnf) {
			System.out.println("No file");
		} catch (ClassNotFoundException cnf) {
			System.out.println("No Emp class");
		}
		catch(ClassCastException cce) {
			System.out.println("No Cast class");
		}

	}
	
}
