package Test;

public class LeapYear {

	public static void main(String[] args) {
		
		int n=2018;
		
		if(n%400==0 && n%4==0 || n%100!=0)
			System.out.println("is leap year");
		else
			System.out.println("is not leap year");
	}
}
