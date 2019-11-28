package Test;

public class BubbleSort {

	
	public static void main(String[] args) {
		
		int arr[]= {4,5,1,2,8,3,7};
		int len=arr.length;
		
		for(int i=0;i<len;i++)
		{
			for(int j=0;j<len-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		for(int i=0;i<len;i++)
			System.out.print(arr[i]+" ");
	}
}
