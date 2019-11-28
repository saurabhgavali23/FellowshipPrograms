package com.bridgelabz.junitprograms;

import com.bridgelabz.utility.Utility;

public class ConversionFtoC {

	public double conversionCtoF(double f,double c)
	{
		f=(c * 9/5)+32;
		return f;
	}
	
	public double conversionFtoC(double f,double c)
	{
		c=((f - 32)*(5/9));
		return c;
	}
	
	public static void main(String[] args) {
	
		ConversionFtoC fc=new ConversionFtoC();

		System.out.println("Enter the Fahrenheit");
		double f=Utility.inputInterger();
		System.out.println("Enter the Celsius");
		double c=Utility.inputInterger();
		 
		 System.out.println("Celsius to Fahrenheit: "+fc.conversionCtoF(f, c));
		 System.out.println("Fahrenheit to Celsius: "+fc.conversionFtoC(f, c));
	}
}
