package com.bridgelabz.basicprogram;

import com.bridgelabz.utility.Utility;

public class PowerOfTwos {

	public static void main(String[] args) {
		
		System.out.println("Enter the Number");
		int n=Utility.inputInterger();
		
		for(int i=0;i<=n;i++)
		{
			System.out.println((int)Math.pow(2,i));
		}
	}
}
