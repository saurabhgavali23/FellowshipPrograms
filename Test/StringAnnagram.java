package Test;

import java.util.Arrays;
import java.util.Scanner;

public class StringAnnagram {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the String1");
		String str1=s.next();
		System.out.println("Enter the String 2");
		String str2=s.next();
		char arr1[]=str1.toUpperCase().toCharArray();
		char arr2[]=str2.toUpperCase().toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		boolean status=Arrays.equals(arr1, arr2);
		
		if(status)
			System.out.println("String is anagram");
		else
			System.out.println("String is not anagram");	
	}
}

