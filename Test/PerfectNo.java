package Test;

public class PerfectNo {

	public static void main(String[] args) {
		
		int n=6;
		int sum=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
				System.out.println(i);
			}
		}
		if(sum==n)
			System.out.println("it is perfect no");
		else
			System.out.println(" it is not perfect no");
	}
}
