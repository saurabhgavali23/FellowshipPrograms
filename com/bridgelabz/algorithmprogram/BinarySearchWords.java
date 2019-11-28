package com.bridgelabz.algorithmprogram;

import java.io.IOException;
import java.util.Arrays;

import com.bridgelabz.utility.Utility;

public class BinarySearchWords {
		
		public static void binarySearch() throws IOException 
		{
			String arr[]=Utility.readFile("InputFile.txt");
			System.out.println(Arrays.toString(arr));
			
			System.out.println("Enter the Word");
			String str=Utility.inputString();
			Utility.binrySearch(arr, str);
			
		}
		
		public static void main(String[] args) throws IOException {
			 
			binarySearch();
		}
}
