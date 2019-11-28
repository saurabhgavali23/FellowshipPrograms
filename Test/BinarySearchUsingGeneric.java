package Test;

import java.io.IOException;
import java.util.Arrays;

import com.bridgelabz.utility.Utility;

public class BinarySearchUsingGeneric {
	
	public static void binarySearch() throws IOException
	{
		String arr[]=Utility.readFile("InputFile.txt");
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr);
		
		
		Utility.binrySearch(arr, "shubham");
		
	}
	
	public static void main(String[] args) throws IOException {
		 
		binarySearch();
	}
}
