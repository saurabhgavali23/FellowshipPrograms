package com.bridgelabz.algorithmprogram;

import com.bridgelabz.utility.Utility;

public class InsertionSort {

	public static void main(String[] args) {
		
		//Integer arr[]= {4,6,8,2,7,3};
		
		String arr[]= {"saurabh","kishor","gavali"};
		arr=Utility.insertionSort(arr);
		
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}
}
