package Test;

public class ArrayIntersection {

	public static void main(String[] args) {
		
		int arr[]= {15,6,7,4,8,9};
		int arr1[]= {6,2,5,8,1,3,4};
		int arr3[]=new int[arr.length+arr1.length];
		int p=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr1.length;j++)
			{
				if(arr[i]==arr1[j])
				{
					arr3[p]=arr[i];
					p++;
				}
			}
		}
		  for(int i=0;i<arr3.length;i++) 
		  { 
			  if(arr3[i]!=0) 
				  System.out.print(arr3[i]+" ");
		  }
		 
	}
}
