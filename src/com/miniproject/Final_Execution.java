package com.miniproject;

import java.util.Scanner;
import java.sql.SQLException;
public class Final_Execution extends Purchase_History {

	public static void main(String[] args) {
		Final_Execution test = new Final_Execution();
		Scanner s = new Scanner(System.in);
		int count;
		test.registration();
		test.showListOfItems();
		System.out.print("How many products you want ?:");
		count = s.nextInt();
		for(int i=1;i<=count;i++){
			test.addToCart();
			}
		try {
			test.storePurchaseHistory();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		s.close();

	}

}
