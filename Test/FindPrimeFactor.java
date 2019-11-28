

package Test;

public class FindPrimeFactor {
	
	public static void main(String[] args) {
	
		int n=8;
		int temp=0;
		for(int i=2;i<=n;i++)
		{
			while(n%i==0)
			{
				if(i!=temp)
				{
					System.out.println(i);
					temp=i;
				}
				n=n/i;
			}
		}
	}

}
