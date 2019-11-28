package com.bridgelabz.junitprograms;

import com.bridgelabz.utility.Utility;

public class MonthlyPayment {

	public double monthlypay(int R,int P,int Y)
	{
		int n = 12 * Y;
		int r = R / (12*100);
		double payment = P*r/(1 - Math.pow((1+r), -n));
		
		return payment;
	}
	
	public static void main(String[] args) {
		
		MonthlyPayment mp=new MonthlyPayment();
		
		System.out.println("Enter the Principal Loan Amount");
		int p=Utility.inputInterger();
		System.out.println("Enter the Percent Interest Compounded Monthly");
		int r=Utility.inputInterger();
		System.out.println("Enter the Year of Pay");
		int y=Utility.inputInterger();
		
		double payment=mp.monthlypay(r, p, y);
		
		System.out.println("The Payment is: "+payment);
	}
}
