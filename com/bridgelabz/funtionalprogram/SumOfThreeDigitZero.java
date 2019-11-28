package com.bridgelabz.funtionalprogram;

public class SumOfThreeDigitZero {

	public static void ThreeDigit(int arr[])
	{
		int n=arr.length;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-1;j++)
			{
				for(int k=0;k<n-2;k++)
				{
					if(arr[i]+arr[j]+arr[k]==0)
					{
						System.out.print(arr[i]+" ");
						System.out.print(arr[j]+" ");
						System.out.print(arr[k]+" ");
						System.out.println();
					}
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		int arr[]= {1,0,-1,3,2};
		ThreeDigit(arr);
		
	}
}
