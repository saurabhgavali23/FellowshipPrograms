package Test;

import java.util.Scanner;

public class WallSlipDemo {
	
	public static void main(String[] args) {
		
		int jump=0;
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the wall height in cm");
		int x=s.nextInt();
		
		System.out.println("Enter the jump of frog");
		int y=s.nextInt();
		
		System.out.println("Enter height the slip of frog");
		int z=s.nextInt();
		
		while(x>0)
		{
			x=x-(y-z);
			jump++;
		}
		System.out.println(jump);
	}

}
