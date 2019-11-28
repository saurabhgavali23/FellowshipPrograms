package com.bridgelabz.basicprogram;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class StringReplace {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the UserName");
		String str=Utility.inputString();
		String str1="<<"+str+">>";
		
			if(str.length()>=3)
				System.out.println(str1);
			else
				System.out.println("String at least 3 char");
	}
}
