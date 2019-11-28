package com.bridgelabz.algorithmprogram;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class GuessNumber {
	
	public static void main(String[] args) {
		
		int low=0;
		int high=100;
		while(low<high)
		{
			int mid=(low+high)/2;
			
			System.out.println("press '1' if no. beetween "+low+" - "+mid);
			System.out.println("press '2' if no. beetween "+(mid+1)+" - "+high);
			
			int n=Utility.inputInterger();
			
			if(n==1)
				high=mid;
			else
				low=mid+1;
		}
		System.out.println("your Guessing no. is "+low);
	}

}
