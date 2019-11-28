package Test;

import java.util.Arrays;

public class UnionDemo {

	public static void main(String ar[])
	{
		int arr[]= {15,6,7,4,8,9};
		int arr1[]= {6,2,5,8,1,3,4};
		int arr3[]=new int[arr.length+arr1.length];
		int arr4[];
		int xx = arr.length+arr1.length;
		int l=0;
		for(int i=0;i<arr.length;i++)
		{
			arr3[l]=arr[i];
			l++;
		}

		arr4=arr1;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr1.length;j++)
			{
				if(arr[i]==arr1[j])
				{
				arr4=removeElement(arr4,arr[i]);
				}
			}
		}
		
		for(int i=0;i<arr4.length;i++)
		{
			if(l<xx)
			{
			arr3[l]=arr4[i];
			l++;
			}
			
		}
		for(int i=0;i<arr3.length;i++)
		{
			if(arr3[i]>0)
			System.out.print(" "+arr3[i]);
		}
	//	System.out.println(Arrays.toString(arr3));
	//	System.out.println(Arrays.toString(arr4));
	}
	
	public static int[] removeElement(int arr[],int x)
	{
		int arr1[]= new int[arr.length-1];
		int l=0;
		for(int i=0;i<arr.length;i++)
		{
			if(x!=arr[i])
			{
				arr1[l]=arr[i];
				l++;
			}
		}
		return arr1;
	}
}

