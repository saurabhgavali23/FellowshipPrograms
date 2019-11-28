package com.bridgelabz.basicprogram;

public class FlipCoin {

	public static void main(String[] args) {
		
		int head=0;
		int tail=0;
		
		for(int i=0;i<5;i++)
		{
			if(Math.random()>0.5)
				head++;
			else
				tail++;
		}
		
		System.out.println("Head Percentage = "+(double)head*100/5);
		System.out.println("Tail Percentage = "+(double)tail*100/5);
	}
}
