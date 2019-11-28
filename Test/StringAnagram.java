package Test;

import java.util.Arrays;

public class StringAnagram {
	
	public static void main(String[] args) {
		
		String str="keep".toUpperCase();
		String str2="peEk".toUpperCase();

		char a[]=str.toCharArray();
		char b[]=str2.toCharArray();
		
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		Arrays.sort(b);
		System.out.println(Arrays.toString(b));
		boolean status=Arrays.equals(a, b);
		if(status)
			System.out.println("it is anagram");
		else
			System.out.println("it is not anagram");
	}
	

}
