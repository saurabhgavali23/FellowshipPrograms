package com.bridgelabz.junitprograms;

import com.bridgelabz.utility.Utility;

public class BinaryToDecimalUsingNibbles {
	
	public static void main(String[] args) {
	
		String str,str1="",str2="",str3;
		 str=Utility.decToBinary(248);
		 
		 int len=str.length()/2;
		
		 for(int i=0;i<len;i++)
			str1+=str.charAt(i);
		 
		 for(int i=len;i<str.length();i++)
			 str2+=str.charAt(i);
		 
		 str3=str2.concat(str1);
		 int i=0;
		while(i<str3.length())
		{
			 System.out.print(str3.charAt(i)+" ");
			 i++;
		}
		 System.out.println();
		 System.out.println(Integer.parseInt(str3,2));
	}

}
