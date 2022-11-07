package com.miniproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

        public class Registration {
        Scanner sc = new Scanner(System.in);
	
	    public void registration() {
		System.out.println("[][][][]Welcome to Gamma E-Store[][][][]");
		System.out.println(" ");
		System.out.println("****Please Register yourself before shopping****");
		System.out.println(" ");
		System.out.println("Enter your name:");
		String name=sc.nextLine();
		System.out.println("Enter your E-mail Id:");
		String emailId= sc.nextLine();
		System.out.println("Create Password:");
		String password = sc.next();
		
		// Storing the registration details in mySQL table.
		
		try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gamma_project", "root", "root");
		PreparedStatement ps=con.prepareStatement("insert into registration(userName,userMailId,userPassword)values(?,?,?)");
		ps.setString(1, name);
		ps.setString(2, emailId);
		ps.setString(3,password);
		ps.executeUpdate();
		System.out.println("Registration Successfull.");
		System.out.println(" ");
		System.out.println("Welcome to Gamma E-store "+name+"!!");
		System.out.println(" ");
		System.out.println("~~~~~~Choose product from below list ~~~~~~");
		System.out.println(" ");
        con.close();
        ps.close();
		}
		catch(Exception e) {
			e.printStackTrace();;
		}
		}
	
}
