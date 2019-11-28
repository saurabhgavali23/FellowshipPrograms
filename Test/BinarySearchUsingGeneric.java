package Test;

import java.io.IOException;
import java.util.List;

import com.bridgelabz.utility.Utility;

public class BinarySearchUsingGeneric<T> {
	
	public static void binarySearch() throws IOException
	{
		List arr=Utility.readFile("inputFile");
		System.out.println(arr.size());
		for(int i=0;i<arr.size();i++)
			System.out.print(arr.get(i)+" ");
	}
	
	public static void main(String[] args) throws IOException {
		 
		binarySearch();
	}
}
