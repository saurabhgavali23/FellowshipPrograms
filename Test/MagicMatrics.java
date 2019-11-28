package Test;

public class MagicMatrics {

	public static void main(String[] args) {
		
		int arr[][]=new int[3][3];
		int sum=0,sum1=0,sum2=0,sum3=0,n=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				n++;
				arr[i][j]=n;
			}
		}
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				sum=sum+arr[i][j];
				sum3=sum3+arr[j][i];
			}
		}
		System.out.println("row "+sum);
		System.out.println("Column "+sum3);
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(i==j)
				{
					sum1=sum1+arr[i][j];
				}
			}
		}
		System.out.println("Diagonal1 "+sum1);
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(i+j==2)
				{
					sum2=sum2+arr[i][j];
				}
			}
		}
		System.out.println("diagonal2 "+sum2);
	}
}
