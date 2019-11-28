package Test;

public class TripleZero {
	
	public static void main(String[] args) {
		
		int arr[]= {-1,0,3,-2,-3,1};
		int n=arr.length;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				for(int k=j+1;k<n;k++)
				{
					if(arr[i]+arr[j]+arr[k]==0)
					{
						System.out.print(arr[i]+" ");
						System.out.print(" ");
						System.out.print(arr[j]+" ");
						System.out.print(" ");
						System.out.print(arr[k]+" ");
						System.out.println();
					}
				}
			}
		}
	}

}
