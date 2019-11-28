package Test;

import com.bridgelabz.utility.Utility;

public class AddElementInArrayByPos {

	public static void main(String[] args) {
		
		System.out.println("Enter the Array Size");
		int n=Utility.inputInterger();
		
		int arr[]=new int[n];
		System.out.println("Enter the Array Elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=Utility.inputInterger();
		}
		
		System.out.println("Enter the Data");
		int data=Utility.inputInterger();
		
		System.out.println("Enter the position");
		int pos=Utility.inputInterger();
		
		Utility.addElementInArrayByPos(arr, pos-1, data);
	}
}
