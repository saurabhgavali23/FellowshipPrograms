package com.bridgelabz.funtionalprogram;

import com.bridgelabz.utility.Utility;

public class Quadratic {

	public static void main(String[] args) {
		
		double delta,root1,root2;
		
		System.out.println("Enter the a value");
		int a=Utility.inputInterger();
		System.out.println("Enter the b value");
		int b=Utility.inputInterger();
		System.out.println("Enter the c value");
		int c=Utility.inputInterger();
		
		 delta = (b*b) - (4*a*c);
		 System.out.println(delta);
		if(delta>0)
		{
			root1=(-b+Math.sqrt(delta))/(2*a);
			root2=(-b-Math.sqrt(delta))/(2*a);
			System.out.println("Root1 "+root1);
			System.out.println("Root2 "+root2);
		}
		else
			System.out.println("delta should not be less than zero");
		
	}
}
