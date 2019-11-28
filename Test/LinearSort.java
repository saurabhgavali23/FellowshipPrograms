package Test;

import java.util.Scanner;

public class LinearSort {
	
	public static void main(String[] args) {
		
		int arr[]= {12,52,81,66,11,32};
		System.out.print("enter the number to be searched:");
		Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==n)
			{
				System.out.println("found "+n+" locate "+i);
			}
		}
	}

}
