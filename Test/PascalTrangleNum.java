package Test;

public class PascalTrangleNum {

	public static void main(String[] args) {
		
		int n=5,count=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=n-i;j>=1;j--)
			{
				System.out.print(" ");
			}
			for(int j=0;j<i;j++)
			{
				if(j==0)
				{
					count=1;
				}
				else
				{
					count=count*(i-j)/j;
				}
				System.out.print(count+" ");
			}
			System.out.println();
		}
		
	}
}
