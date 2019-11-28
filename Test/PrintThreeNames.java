package Test;

import java.util.Scanner;

public class PrintThreeNames {
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the First name");
		String str1=s.next();
		System.out.println("Enter the Second name");
		String str2=s.next();
		System.out.println("Enter the Third name");
		String str3=s.next();
		
		System.out.println("Hi "+str1+" "+str2+" "+str3);
		
	}

}
