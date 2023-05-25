package com.dal;

public class InterfaceClass {

	public static void main(String[] args) {
		Secondinterface ic = new implementclass();
		ic.firstmethode();
		ic.secondmethode();
	}

}

 interface firstinterface{
	public void firstmethode();
}

 interface Secondinterface extends firstinterface {
	public void secondmethode();
}

 class implementclass implements Secondinterface {
	 public void secondmethode() {
		 System.err.println("I am Second Class methode printing ");
	 }
	 public void firstmethode() {
		 System.err.println("I am First Class methode printing ");
	 }
 }