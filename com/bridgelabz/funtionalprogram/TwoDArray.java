package com.bridgelabz.funtionalprogram;

import com.bridgelabz.utility.Utility;

public class TwoDArray {

	public static void main(String[] args) {
		
		int arr[][]=new int[4][4];
		
		System.out.println("Ente the data");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				arr[i][j]=Utility.inputInterger();
			}
		}
		System.out.println();
		System.out.println("2D Array");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				arr[i][j]=arr[i][j]*arr[i][j];
			}
		}
		System.out.println();
		System.out.println("Afeter Multiplay by row and colomn");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
