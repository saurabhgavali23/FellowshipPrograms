package Test;

public class PrimePeramid {
	
	public static void main(String[] args) {
		
		int n=5;
		int k=2,m,flag=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-i;j++)
			{
				System.out.print(" ");
			}
				
			m=0;
			while(m<=i)
			{
				flag=0;
				for(int l=2;l<=k/2;l++)
				{
					if(k%l==0)
					{
						flag=1;
						break;
					}
				}
					if(flag==0)
					{
						System.out.print(k+" ");
						m++;
					}
					k++;
			}
			System.out.println();
		}
	}
}
