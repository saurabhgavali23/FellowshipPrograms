package com.bridgelabz.algorithmprogram;

import com.bridgelabz.utility.Utility;

public class NumberPalindromeAndAnnagram {

	public static void main(String[] args) {
		
		int a=121;
		int b=123;
		
		int arr[]=Utility.converIntoArrayInt(a);
		int arr1[]=Utility.converIntoArrayInt(b);
		
		if(Utility.checkAnnagramNo(arr, arr1))
			System.out.println(a+" "+b+" Number is Annagram");
		else
			System.out.println(a+" "+b+" Number is not Annagram");
		
		if(Utility.checkPalindrome(a))
			System.out.println(a+" Number is Palindrome");
		else
			System.out.println(a+" Number Not is Palindrome");
		
		if(Utility.checkPalindrome(b))
			System.out.println(b+" Number is Palindrome");
		else
			System.out.println(b+" Number Not is Palindrome");
			
	}
}
