package com.bridgelabz.logicalprograms;

import com.bridgelabz.utility.Utility;

public class StopWatch extends Thread {
	
	public static void main(String[] args) {
		
			System.out.println("Press button to Start");
			@SuppressWarnings("unused")
			String str=Utility.inputString();
			
			long time1=System.currentTimeMillis();
			
			System.out.println("Press button to Stop");
			@SuppressWarnings("unused")
			String str1=Utility.inputString();
			
			
			long time2=System.currentTimeMillis();
			
			
			long milliSec=time2-time1;
			System.out.println(milliSec/1000+" "+"second");
	}
}
