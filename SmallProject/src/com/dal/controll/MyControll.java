package com.dal.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.dal.model.Employee;
import com.dal.util.MyDbConnection;

public class Employeedao {

		Connection con;
		Statement st;
		PreparedStatement ps;
		ResultSet rs;
		
		public void InsertRecord(Employee emp) {
			con = MyDbConnection.GetmydbConnctions();
			try {
				ps = con.prepareStatement("insert into EMP values(?,?)");
				ps.setInt(1, emp.getEmpno());
				ps.setString(2, emp.getEmpname());
				int count = ps.executeUpdate();
				System.out.println(count  + " got inset into DB sucess");
			}
			catch (Exception e) {
				// TODO: handle exception
			}
			
		}
		
		public void SelectedRecord() {
			con = MyDbConnection.GetmydbConnctions();
			try {
				st = con.createStatement();
				rs = st.executeQuery("Select * from EMP");
				while(rs.next()) {
					System.out.println(rs.getInt(1) + " -- " + rs.getString(2));
				}
			}
			catch (Exception e) {
				// TODO: handle exception
			}
	}
		
		public void DeleteRecord(int id) {
			con = MyDbConnection.GetmydbConnctions();
			try {
				ps = con.prepareStatement("Delete from EMP where EmpNUmber = ?");
				ps.setInt(1, id);
				int i = ps.executeUpdate();
				System.out.println(i  + " got Deleted");
			}
			catch (Exception e) {
				// TODO: handle exception
			}
		}
		public void UpdateRecord(int id, String Name) {
			con = MyDbConnection.GetmydbConnctions();
			try {
				ps = con.prepareStatement("update EMP set ename = ? where empnumber=?");
				ps.setString(1, Name);
				ps.setInt(1,id);
				int i = ps.executeUpdate();
				System.out.println(i  + " got Updated");
			}
			catch (Exception e) {
				// TODO: handle exception
			}
		}
}
