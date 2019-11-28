package com.bridgelabz.junitprograms;

import com.bridgelabz.utility.Utility;

public class VendingMachine {
	
	
	public int vendingMachine(int amount)
	{
		int arr[]= {2000,1000,500,100,50,20,10};
		int sum=0,i=0,total;
		while(0<amount)
		{
			total=(amount/arr[i]);
			sum=sum+(arr[i]*total);
			if(total!=0)
				System.out.println(total+" Notes of "+arr[i]);
			amount=amount%arr[i];
			i++;
		}
		return sum;
	}
	
	
	public static void main(String[] args) {
		
		VendingMachine vm=new VendingMachine();
		System.out.println("Enter the Amount");
		int amount=Utility.inputInterger();
		
		vm.vendingMachine(amount);
	}

}
