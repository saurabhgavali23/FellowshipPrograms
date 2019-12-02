package com.bridgelabz.logicalprograms;

import com.bridgelabz.utility.Utility;

public class Gambler {

	public static void main(String[] args) {
		
		int win,beat;
		System.out.println("Enter the Stake");
		int stake=Utility.inputInterger();
		System.out.println("Enter the Goal");
		int goal=Utility.inputInterger();
		System.out.println("Enter the Trails");
		int trails=Utility.inputInterger();
		
		win=0;
		beat=0;
		
		for(int i=0;i<trails;i++)
		{
			int cash=stake;
			while(cash>=0 && cash<goal)
			{
				beat++;
				if(Math.random()<0.5)
					cash++;
				else
					cash--;
			}
			if(cash==goal)
				win++;
		}
		System.out.println(win+" of "+trails);
		System.out.println("Percentage of wins "+ 100.0*win/trails);
		System.out.println("Percentage of beat "+ 1.0*beat/trails);
	}
}
