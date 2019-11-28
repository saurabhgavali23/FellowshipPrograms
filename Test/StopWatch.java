package Test;

import java.util.Scanner;

public class StopWatch extends Thread {
	
	
	
	public static void main(String[] args) {
		
		
		Scanner s=new Scanner(System.in);
			System.out.println("Press button to Start");
			String str=s.nextLine();
			
			long time1=System.currentTimeMillis();
			
			System.out.println("Press button to Stop");
			String str1=s.nextLine();
			
			
			long time2=System.currentTimeMillis();
			
			
			long milliSec=time2-time1;
			System.out.println(milliSec/1000+" "+"second");
	}
}
