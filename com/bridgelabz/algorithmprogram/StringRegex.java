package com.bridgelabz.algorithmprogram;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.bridgelabz.utility.Utility;

public class StringRegex {

	public static void main(String[] args) {
		
		String message;
		System.out.println("Enter the Your FullName");
		String str=Utility.inputString();
		System.out.println(str);
		
		if(Utility.stringValidate(str)!=true)
		{
			System.out.println("String Invalid");
			System.out.println("Enter Again");
			str=Utility.inputString();
		}
		
		String str1[]=str.split(" ");
		String str2=str1[0];
		
		System.out.println("Enter the Mobile Number");
		String str3=Utility.inputString();
		
		if(Utility.integerValidate(str3)==false)
		{
			System.out.println("Number Invalid");
			System.out.println("Enter Again");
			str3=Utility.inputString();
		}
		
		SimpleDateFormat df=new SimpleDateFormat("dd/mm/yyyy");
		Date date=new Date();
		String date1=df.format(date);		
		 message="Hello <<name>>, We have your full name as <<full name>> in our system. "
		 		+ "your contact number is 91-xxxxxxxxxx.Please,let us know in case "
		 		+ "of any clarification Thank you BridgeLabz 01/01/2016.";
		
		 message=message.replace("<<name>>", str2);
		 message=message.replace("<<full name>>", str);
		 message=message.replace("xxxxxxxxxx",str3);
		 message=message.replace("01/01/2016", date1);
		System.out.println(message);
	}
}
