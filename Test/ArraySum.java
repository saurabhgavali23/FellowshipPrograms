package Test;

public class ArraySum {

	public static void main(String[] args) {
		
		int arr[]= {2,5,1,6,3,7};
		int sum=8;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]+arr[j]==8)
				{
					System.out.println(arr[i]+" "+arr[j]);
				}
			}
		}
	}
}
