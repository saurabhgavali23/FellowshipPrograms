package com.bridgelabz.funtionalprogram;

import com.bridgelabz.utility.Utility;

public class WindChill {

	public static void main(String[] args) {
		
		System.out.println("Enter the temperature in fehrenheit");
		int t=Utility.inputInterger();
		System.out.println("Enter the temperature wind speed");
		int v=Utility.inputInterger();
		
		if(t<50 && (v>120 || v<3))
		{
			double sum = 35.74 + 0.6215*t + (0.4275*t-35.75) * Math.pow(v,0.16);
			System.out.println("The value is "+sum);
		}
		else
		{
			System.out.println("temperature is less than 50 or wind speed is greter than 120 and less than 3");
		}
	}
}
