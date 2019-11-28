package Test;

public class SumOfPrimeAndPalindome 
{
	public static void main(String[] args) 
	{
		int s=0,count=0;
		for(int i=2;i<=1000;i++)
		{
			int n=i,sum=0,r=0;
			if(i%2!=0 || i==2)
			{
				if(i%3!=0 || i==3)
				{
					int temp=i;
					while(temp>0)
					{
						r=temp%10;
						sum=(sum*10)+r;
						temp=temp/10;
					}
					
					if(sum==i)
					{
					s=s+i;
					if(count<=20)
					{
					System.out.print(sum+" ");
					count++;
					}
					else
					{
						System.out.println();
						count=0;
					}
					}
				}
			}
		}
		System.out.println();
	 System.out.println("The sum of prime is "+s);
	}
}
