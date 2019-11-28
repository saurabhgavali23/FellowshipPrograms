package Test;

import java.util.ArrayList;

public class StringPalindrome {

	public static boolean stringPalindrome(ArrayList <String> str)
	{
		int i=0;
		int j=str.size()-1;
		
		while(j>i)
		{
			if(!str.get(i).equals(j))
				return false;
			i++;
			j--;
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<String>();
		String str="mom";
		
		list.add(str);
		
		if(stringPalindrome(list))
			System.out.println("is Palindrome");
		else
			System.out.println("is not Palindrome");
	}
}
