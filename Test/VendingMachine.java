package Test;

public class VendingMachine {


	public static void main(String[] args) {
		
		int arr[]= {2000,1000,500,100,50,5,2,1};
		int i=0,total=0,sum=0;
		int value=2584;
		
		while(0<value)
		{
			total=(value/arr[i]);
			sum=sum+(arr[i]*total);
			if(total!=0)
			System.out.println(arr[i]+"*"+total+"= "+sum);
			value=value%arr[i];
			i++;
		}
		System.out.println("Total Amount= "+sum);
	}
}
