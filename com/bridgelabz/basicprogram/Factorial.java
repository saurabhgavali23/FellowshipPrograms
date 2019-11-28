package com.bridgelabz.basicprogram;

import com.bridgelabz.utility.Utility;

public class Factorial {

	public static void main(String[] args) {
		
		System.out.println("Enter the data");
		int n=Utility.inputInterger();
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}
}
