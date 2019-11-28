package com.bridgelabz.basicprogram;

import com.bridgelabz.utility.Utility;

public class HarmonicSeries {

	public static void main(String[] args) {
		
		System.out.println("Enter the data");
		int n=Utility.inputInterger();
		double sum=0;
		for(int i=1;i<n;i++)
		{
			sum+=1/i;
		}
		System.out.println(sum);
	}
}
