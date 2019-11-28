package Test;

import java.util.ArrayList;

public class ArrayListUsingFibbo {
	
	public static void fibbo(int n)
	{
		int a=0,b=1;
		for(int i=0;i<n;i++)
		{
			int c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
	}
	public static void main(String[] args) {
	
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		list.add(5);
		
		for(int i=0;i<list.size();i++)
		{
			int n=list.get(i);
			fibbo(n);
		}
		
		
		
		
	}
		
}
