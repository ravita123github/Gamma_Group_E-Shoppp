package com.miniproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Shopping_List extends Registration {
	void showListOfItems() {
		//Showing the list of products from database to user for selecting items to buy.
		 
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gamma_project", "root", "root");
			PreparedStatement ps=con.prepareStatement("select * from product_det");
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				System.out.println("Product Id= "+rs.getInt("id"));
				System.out.println("Product Name= "+rs.getString("product_name"));
				System.out.println("Product Description= "+rs.getString("product_description"));
				System.out.println("Product Price= Rs."+rs.getInt("product_price"));
				System.out.println("________________________________________________________");
			}	
		}
		catch(Exception e) {
			e.printStackTrace();
		}
			
		}
}
