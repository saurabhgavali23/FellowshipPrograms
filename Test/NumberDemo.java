package Test;

import java.util.Arrays;

public class NumberDemo {
	
	public static void main(String[] args) {
		
		int arr[]= {10,10,20,10,20,30,25,20,30,30};
		Arrays.sort(arr);
		int arr1[]=new int[arr.length];
		int arr2[]=new int[arr.length];
		int count=0,a=0,l=0,k=0;
		for(int i=0;i<arr.length;i++)
		{
			if(a!=arr[i])
			{
				count=0;
				for(int j=0;j<arr.length;j++)
				{
					if(arr[i]==arr[j])
					{
						count++;
						a=arr[i];
					}
				}
				arr1[l]=a;
				arr2[k]=count;
				System.out.println(arr1[l]+" "+arr2[k]);
				l++;
				k++;
			}
		}
	}
}
