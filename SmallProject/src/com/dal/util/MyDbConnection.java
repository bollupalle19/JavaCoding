package com.dal.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyDbConnection {
	static Connection conn;
	
	public static Connection GetmydbConnctions()
	{
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "Dedalus@190");
			System.out.println(conn);
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		return conn;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GetmydbConnctions();
		
	}

}
