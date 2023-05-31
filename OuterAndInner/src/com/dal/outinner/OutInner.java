package com.dal.outinner;

import com.dal.outinner.Outer.MyInner;

public class OutInner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer1 o1 = new Outer1();
		o1.Tested();
		Outer o = new Outer();
		o.OuterMethod();
	}

}

class Outer{
	int x =7;
	static abstract  class MyInner
		{
		int a = 10; // Inner class scope variable access local .
			public void InnerMethod()
			{
				int b = 10; // Local variable not access scpoe.
				System.out.println("x == " + b + a);
			}
			
			public abstract void Tested();
		}
		public void OuterMethod()
		{
			System.out.println("From outer method = " + x);
			//MyInner inn = new Outer();
			//inn.InnerMethod();
		}
}

class Outer1 extends Outer.MyInner{
	
	public void  Tested() {
		System.out.println("Outer1 extends");
	}
}
