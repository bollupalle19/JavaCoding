package com.dal.view;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

import com.dal.Exception.*;
import com.dal.controll.MyControll;
import com.dal.threads.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.*;

	
public class Myclass {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String ch = null;
		MyControll ec =new MyControll();		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter a User name");
		String User = br.readLine();
		System.out.println("Enter a Passwod");
		String Pass = br.readLine();
		
		try {
			if(User.equals("Ravee") && Pass.equals("teja")) {
				do {				
					try {
						System.out.println("Loading...");
						Thread.sleep(1000);
					}
					catch (Exception e) {
						// TODO: handle exception
					}
					System.out.println("Are you add Record ? Mr. "+ User);
					String Choice = sc.next();
					switch (Choice) {
					case "yes":{
						ec.AddEmpDetails();
						break;
					}
					case "No":{
						ec.viewEmployeelist();
						break;
					}
					default:
						System.out.println("what you want ?");
						break;
				}
					System.out.println("are you add once more record ?");
					ch = sc.next();
					if(ch.equals("No") || ch.equals("no"))
					{
						System.out.println("Are you Serial Record ?");
						String serial = sc.next();
						if(serial.equals("Yes"))
						{
							ec.SerialEgMehode();
						}
						System.out.println("Are you DeSerial Record ?");
						String deserial = sc.next();
						if(deserial.equals("Yes"))
						{
							ec.DeSerialEgMehode();
						}
					}
				}while(ch.equals("Yes") || ch.equals("yes"));
				System.out.println("Thanks for using our system.");
				System.exit(0);
			}
			else{
				throw new UserNotFoundException();
			}
		}
		catch (UserNotFoundException unf) {
			unf.printStackTrace();
		}		
}
}