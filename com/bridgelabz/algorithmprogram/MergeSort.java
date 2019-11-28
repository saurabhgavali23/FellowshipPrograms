package com.bridgelabz.algorithmprogram;

import com.bridgelabz.utility.Utility;

public class MergeSort {
	
	public static void main(String[] args) {
		
		
		System.out.println("Enter the no of  String element in array");
		int n =Utility.inputInterger();
		
		String  str[] = new String[n];
		
		String s[];
		
		String key;
		
		System.out.println("Enter "+n+" Element in array");
		
		for(int i=0;i<n;i++)
		{
			str[i]=Utility.inputString();
		}
		
		s=Utility.mergeSort(str,0,str.length-1);	
		 
		System.out.println("Unsorted Array");
		for (String b : s) 
		{
			System.out.print(b+" ");
		}
		
			   
	}
}
