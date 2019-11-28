package Test;

import java.util.Scanner;

public class GuessNumber {
	
	public static void main(String[] args) {
		
		int low=0;
		int high=100;
		Scanner s=new Scanner(System.in);
		while(low<high)
		{
			int mid=(low+high)/2;
			
			System.out.println("press '1' if no. beetween "+low+" - "+mid);
			System.out.println("press '2' if no. beetween "+(mid+1)+" - "+high);
			
			int n=s.nextInt();
			
			if(n==1)
				high=mid;
			else
				low=mid+1;
		}
		System.out.println("your Guessing no. is "+low);
	}

}
