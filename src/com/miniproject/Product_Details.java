package com.miniproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Product_Details {
	 void settingData() {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gamma_project", "root", "root");
				PreparedStatement stmt=con.prepareStatement("insert into product_det(product_name,product_description,product_price,product_quantity)values(?,?,?,?)");
	           
				stmt.setString(1, "Mixer Grinder");
	            stmt.setString(2,"AmazonBasics Alpha Mixer Grinder 750W, 3 Jars + 1 Juicer Jar, White");
	            stmt.setInt(3, 8900);
	            stmt.setInt(4,30);
	            stmt.executeUpdate();
	            
	            stmt.setString(1, "Laptop");
	            stmt.setString(2,"HP Pavilion 14 12th Gen Intel Core i5 16GB SDRAM/512GB SSD 14 inch(35.6cm) IPS Micro-Edge FHD Laptop/Intel UHD Graphics/B&O/Win 11/Alexa Built-in/Backlit KB/FPR/MSO 2021/Natural Silver, 14-dv2014TU");
	            stmt.setInt(3, 65000);
	            stmt.setInt(4,10);
	            stmt.executeUpdate();
	            
	            stmt.setString(1, "Refrigerator");
	            stmt.setString(2," Whirlpool 340 L 3 Star Inverter Frost-Free Double Door Refrigerator (INTELLIFRESH INV CNV 355 3S, German Steel, Convertible)");
	            stmt.setInt(3, 54440);
	            stmt.setInt(4,105);
	            stmt.executeUpdate();
	            
	            stmt.setString(1, "Washing Machine");
	            stmt.setString(2,"LG FrontLoading Smart Washing Machine");
	            stmt.setInt(3, 25000);
	            stmt.setInt(4,25);
	            stmt.executeUpdate();
	           
	            stmt.setString(1, "HeadPhones");
	            stmt.setString(2,"boAt Rockerz 550 Over Ear Bluetooth Headphones with Upto 20 Hours Playback, 50MM Drivers, Soft Padded Ear Cushions and Physical Noise Isolation, Without Mic (Black)");
	            stmt.setInt(3, 1600);
	            stmt.setInt(4,24);
	            stmt.executeUpdate();
	           
	            stmt.setString(1, " Microwave oven");
	            stmt.setString(2,"Samsung 28 L Convection Microwave Oven (MC28A5013AK/TL, Black, Curd Anytime)");
	            stmt.setInt(3, 18000);
	            stmt.setInt(4,34);
	            stmt.executeUpdate();
	            
	            stmt.setString(1, "Digital Camera");
	            stmt.setString(2,"Sony Cybershot DSC-W810/B 20.1MP Digital Camera Memory Card 16GB (Black) + Bag");
	            stmt.setInt(3, 12000);
	            stmt.setInt(4,15);
	            stmt.executeUpdate();
	            
	            stmt.setString(1, "LED");
	            stmt.setString(2,"OnePlus 80 cm (32 inches) Y Series HD Ready LED Smart Android TV 32Y1 (Black)");
	            stmt.setInt(3, 55000);
	            stmt.setInt(4,50);
	            stmt.executeUpdate();
	           
	            stmt.setString(1, "Smart Watch");
	            stmt.setString(2,"Noise ColorFit Pulse Grand Smart Watch with 1.69\" HD Display, 60 Sports Modes, 150 Watch Faces, Spo2 Monitoring, Call Notification, Quick Replies to Text & Calls (Rose Pink)");
	            stmt.setInt(3, 1565);
	            stmt.setInt(4,25);
	            stmt.executeUpdate();
	            
	            stmt.setString(1, "Home Theatre");
	            stmt.setString(2,"Infinity (JBL) Sonic B200WL, 160W Soundbar with Wireless Subwoofer, 2.1 Channel Home Theatre with Remote, Bluetooth, Optical Input, USB & AUX Connectivity (Black)\r\n" + 
	            		"");
	            stmt.setInt(3, 8400);
	            stmt.setInt(4,46);
	            stmt.executeUpdate();
	            
	            stmt.setString(1, "Cooler");
	            stmt.setString(2,"Bajaj PMH 25 DLX 24L Personal Air Cooler with Honeycomb Pads, Turbo Fan Technology, Powerful Air Throw and 3-Speed Control, White,PMH25 DLX");
	            stmt.setInt(3, 10000);
	            stmt.setInt(4,25);
	            
	            stmt.executeUpdate();
	           // System.out.println("Record updated"+i);
	            con.close();
	            stmt.close();
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			
		}
	    /* public static void main(String[] args) {
			 Product_Details pd = new Product_Details();
			 pd.settingData();
			 System.out.println("Inserting records");
		}*/
		
}
