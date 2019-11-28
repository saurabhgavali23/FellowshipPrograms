package com.bridgelabz.algorithmprogram;

import java.io.IOException;
import java.util.Arrays;

import com.bridgelabz.utility.Utility;

public class BubbleSort {

	
	public static void main(String[] args) throws IOException {
		
		String arr[]= Utility.readFile("WordFile.txt");
		
		System.out.println("Enter the array");
		
		arr=Utility.bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
