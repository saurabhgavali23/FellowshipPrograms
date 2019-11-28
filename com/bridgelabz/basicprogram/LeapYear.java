package com.bridgelabz.basicprogram;

import com.bridgelabz.utility.Utility;

public class LeapYear {

	public static void main(String[] args) {
		
		boolean flag = false;
		System.out.println("Enter the year");
		int date=Utility.inputInterger();
		
		if(date%4==0)
		{
			if(date%400!=0 && date%100==0)
				System.out.println("it is not");
			else
				System.out.println("it is");
		}
		else
			System.out.println("it is not");
	}
}
