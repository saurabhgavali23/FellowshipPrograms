package Test;

import java.util.ArrayList;
import java.util.Iterator;

public class DecimalToBinary {

	public static void decToBin(int n)
	{
		int n1=(int)Math.pow(2, 16);
		int arr[]=new int[n1];
		int i=0,r=0;
		
		while(0<n)
		{
			r=n%2;
			arr[i]=r;
			n=n/2;
			i++;
		}
		
		for(int j=i-1;j>=0;j--)
			System.out.print(arr[j]+" ");
			
	}
	public static void main(String[] args) {
		
		ArrayList l=new ArrayList();
		int n=0;
		l.add(1250);
		Iterator it=l.iterator();
		while(it.hasNext())
		{
			n=(int) it.next();
			decToBin(n);
		}
	}
}
