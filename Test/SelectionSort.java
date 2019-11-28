package Test;

public class SelectionSort {

	public static void main(String[] args) {
		
		int arr[]= {51,8,3,4,88,1};
		
		int len=arr.length;
		int m=0;
		
		for(int i=0;i<arr.length;i++)
		{
			m=arr[i];
			
			for(int j=i+1;j<len;j++)
			{
				if(arr[j]<arr[m])
				m=j;
				
				int temp=arr[m];
				arr[m]=arr[i];
				arr[i]=temp;
			}	
		}
		
		for(int i=0;i<len;i++)
			System.out.println(arr[i]+" ");
	}
}
