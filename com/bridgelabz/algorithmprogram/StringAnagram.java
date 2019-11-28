package com.bridgelabz.algorithmprogram;

import com.bridgelabz.utility.Utility;

public class StringAnagram {

	public static void main(String[] args) {
		
		System.out.println("Enter the 1 String");
		String str1=Utility.inputString();
		System.out.println("Enter the 2 String");
		String str2=Utility.inputString();
		
		if(Utility.stringAnnagram(str1, str2))
		{
			System.out.println("String is Annagram");
		}
		else
		{
			System.out.println("String is not Annagram");
		}
	}
}
