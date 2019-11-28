package com.bridgelabz.junitprograms;

import com.bridgelabz.utility.Utility;

public class DayOfWeek {

	public String dayOfWeek(int dd,int mm,int yy)
	{
		String day=Utility.dayOfWeek(dd, mm, yy);
		return day;
	}
	public static void main(String[] args) {
		
		System.out.println("Enter the Day");
		int dd=Utility.inputInterger();
		System.out.println("Enter the Month");
		int mm=Utility.inputInterger();
		System.out.println("Enter the Year");
		int yy=Utility.inputInterger();
		
		String day=Utility.dayOfWeek(dd, mm, yy);
		
		System.out.println("The Day of "+dd+"/"+mm+"/"+yy+" is "+day);
		
		
	}
}
