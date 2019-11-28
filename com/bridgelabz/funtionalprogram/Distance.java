package com.bridgelabz.funtionalprogram;

import com.bridgelabz.utility.Utility;

public class Distance {

	public static void main(String[] args) {
		
		System.out.println("Enter the x value");
		double x=Utility.inputInterger();
		System.out.println("Enter the y value");
		double y=Utility.inputInterger();
		
		double distance=Math.sqrt(x*x + y*y);
		
		System.out.println("The Distace is: "+distance);
	}
}
