package Test;

public class PrimeNo {
	
	public static void main(String[] args) {
		
		int n=5;
		int m=n/2;
		int flag=0;
		if(n==1||n==0)
		{
			System.out.println("is not prime"+n);
		}
		else
		{
			for(int i=2;i<=m;i++)
			{
				if(n%i==0)
				{
					System.out.println(n+" is not prime");
					flag=1;
					break;
				}
			}
			if(flag==0)
			{
				System.out.println("is prime no");
			}
		}
	}

}
