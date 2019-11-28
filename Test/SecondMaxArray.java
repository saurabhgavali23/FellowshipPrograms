package Test;

public class SecondMaxArray {

	public static void secondMax(int arr[])
	{
		int second,first;
		int i,x,y=0;
		second=first=arr[0];
		
		for(i=0;i<arr.length;i++)
		{
			
			if(arr[i]>first)
			{
				second=first;
				first=arr[i];
			}
			
			if(arr[i]>second && arr[i]!=first)
				second=arr[i];
		}
		System.out.println(second);
	}
	public static void main(String[] args) {
		
		int arr[]= {12,1,8,35,36};
		
		secondMax(arr);
	}
}
