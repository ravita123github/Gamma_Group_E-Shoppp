package com.miniproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Purchase_History extends Shoppoing_Cart {
	private static void showingRegistrationTable() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gamma_project", "root", "root");
			PreparedStatement ps=con.prepareStatement("select * from registration");
			PreparedStatement ps1=con.prepareStatement("select * from purch_history");
			ResultSet rs = ps.executeQuery();
			ResultSet rs1 =ps1.executeQuery();
			
			while(rs.next()&&rs1.next()) {
				System.out.println("Name: "+rs.getString("userName"));
				System.out.println("E-MailId: "+rs.getString("userMailId"));
				System.out.println("Items Purchased: "+rs1.getInt("items_purchased"));
				System.out.println("Total Bill:Rs."+rs1.getInt("cart_value"));

				System.out.println("  ");
			}	
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
     // public static void main(String [] args) {
       // 	showingRegistrationTable();
      //    }
}
