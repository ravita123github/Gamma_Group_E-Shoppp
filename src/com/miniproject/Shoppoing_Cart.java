package com.miniproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Shoppoing_Cart extends Shopping_List {
	static int cartValue=0;      //for calculating cart value when cart is filled with products.
	static int noOfProducts=0;
	static int mixerGrinder=30;  // Quantity of products.
	static int laptop=10;
	static int refrigerator=105;
	static int washingMachine=25;
	static int headphones=24;
	static int microwaveOven=34;
	static int digitalCamera=15;
	static int led=50;
	static int smartWatch=25;
	static int hometheatre=46;
	static int cooler = 25;
      void addToCart() {
	//Selected items being added into cart and calculating cart value.
    	    Scanner sc = new Scanner(System.in);
			System.out.println("Insert product Id's of the item you wish to add to your cart:");
			int input = sc.nextInt();
			System.out.println("___________________________________________________________________");
			
			switch(input){
			case 1:System.out.println("Mixer grinder Added into your cart.");
			cartValue=cartValue+8900;          
			noOfProducts++;	          
			mixerGrinder--;
			System.out.println("Cart Value till now:Rs."+cartValue);
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
			System.out.println("  ");
			break;
			
			case 2:System.out.println("Laptop added to your cart.");
			cartValue=cartValue+65000;
			System.out.println("Items in cart="+ ++noOfProducts);
			laptop--;
			System.out.println("Cart Value till now:Rs."+cartValue);
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
			System.out.println("  ");
			break;
			
			case 3:System.out.println("Refrigerator added to your cart.");
			cartValue= cartValue+54440;
			System.out.println("Items in cart="+ ++noOfProducts);
			refrigerator--;
			System.out.println("Cart Value till now:Rs."+cartValue);
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
			System.out.println("  ");
			break;
			
			case 4:System.out.println(" Washing Machine added to your cart.");
			cartValue=cartValue+25000;
			System.out.println("Items in cart="+ ++noOfProducts);
			washingMachine--;
			System.out.println("Cart Value till now:Rs."+cartValue);
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
			System.out.println("  ");
			break;
			
			case 5:System.out.println("HeadPhones added to your cart.");
			cartValue=cartValue+1600;
			System.out.println("Items in cart="+ ++noOfProducts);
			headphones--;
			System.out.println("Cart Value till now:Rs."+cartValue);
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
			System.out.println("  ");
			break;
			
			case 6:System.out.println("Microwave oven added to cart.");
			cartValue=cartValue+18000;
			System.out.println("Items in cart="+ ++noOfProducts);
			microwaveOven--;
			System.out.println("Cart Value till now:Rs."+cartValue);
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
			System.out.println("  ");
			break;
			
			case 7:System.out.println("digital Camera added to your cart.");
			cartValue=cartValue+12000;
			System.out.println("Items in cart="+ ++noOfProducts);
			digitalCamera--;
			System.out.println("Cart Value till now:Rs."+cartValue);
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
			System.out.println("  ");
			break;
			
			case 8:System.out.println("LED added to your cart");
			cartValue=cartValue+55000;
			System.out.println("Items in cart="+ ++noOfProducts);
			led--;
			System.out.println("Cart Value till now:Rs."+cartValue);
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
			System.out.println("  ");
			break;
			
			case 9:System.out.println("Smart Watch added to your cart");
			cartValue=cartValue+1565;
			System.out.println("Items in cart="+ ++noOfProducts);
			smartWatch--;
			System.out.println("Cart Value till now:Rs."+cartValue);
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
			System.out.println("  ");
			break;
			
			case 10:System.out.println("Home Theatre added to your cart");
			cartValue=cartValue+8400;
			System.out.println("Items in cart="+ ++noOfProducts);
			hometheatre--;
			System.out.println("Cart Value till now:Rs."+cartValue);
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
			System.out.println("  ");
			break;
			
			
			case 11:System.out.println("Cooler added to your cart");
			cartValue=cartValue+10000;
			System.out.println("Items in cart="+ ++noOfProducts);
			cooler--;
			System.out.println("Cart Value till now:Rs."+cartValue);
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
			System.out.println("  ");
			break;
			
			
			
			
			default:System.out.println("Please add at least one item in cart to proceed.");
			}
		
      }
	
    // storing purchase history by user in MySQL database.
      
      void storePurchaseHistory() throws SQLException {
    	   int finalCartValue=cartValue;	
    	      int finalCartItems=noOfProducts;

    	      
    	  String sql="insert into purch_history(items_purchased,cart_value)values(?,?)";
    	  try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
  		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gamma_project", "root", "root");
    	  PreparedStatement pstmt =con.prepareStatement(sql);
    	  pstmt.setInt(1, finalCartItems);
    	  pstmt.setInt(2, finalCartValue);
    	  pstmt.executeUpdate();
    	  con.close();
    	  pstmt.close();
      }
      
      
      
      
      
      //admin can check remaining quantity by using this private method by entering productId.
      // for admin only.
      //use for checking remaining items in storage.
      //to use simply create a main method below and run this method.
      //as method is for admin only it is not included in final main method.
      //remove comments to below main method to use this method.
      
      
        private static void quantityCheck(int productId) {
    	  switch(productId) {
    	  case 1:System.out.println("Mixer grinder Quantity:"+mixerGrinder);
    	  break;
    	  case 2:System.out.println("Laptop Quantity:"+laptop);
    	  break;
    	  case 3: System.out.println("Refrigerator Quantity:"+refrigerator);
    	  break;
    	  case 4:System.out.println("Washing Machine Quantity:"+washingMachine);
    	  break;
    	  case 5: System.out.println("Headphones Quantity:"+headphones);
    	  break;
    	  case 6:System.out.println("Microwave Oven Quantity:"+microwaveOven);
    	  break;
    	  case 7:System.out.println("Digital camera quantity:"+digitalCamera);
    	  break;
    	  case 8:System.out.println("LED Quantity:"+led);
    	  break;
    	  case 9: System.out.println("Smart Watch Quantity:"+smartWatch);
    	  break;
    	  case 10: System.out.println("Home Theatre Quantity:"+hometheatre);
    	  break;
    	  case 11: System.out.println("Cooler Quantity:"+cooler);
    	  break;
    	  default:System.out.println("Invalid Input");
    	  }
    	  
         }
        //public static void main(String [] args) {
        //	quantityCheck(5);        //enter the product id you wish to check quantity of...
       // }
}

