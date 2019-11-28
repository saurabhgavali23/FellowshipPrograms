package Test;

import java.security.SecureRandom;
import java.util.Random;

public class GenereateCoupan {
	
	public static String createRandomCode(int codeLen)
	{
		char chars[]="abcdefghijklmnopqrstuvwxyz0123456789".toCharArray();
		StringBuilder sb=new StringBuilder();
		Random random= new SecureRandom();
		
		for(int i=0;i<=codeLen;i++)
		{
		char c=chars[random.nextInt(chars.length)];
			sb.append(c);
		}
		String output = sb.toString();
		System.out.println(output);
		return output;
	}
	
	public static void main(String[] ag)
	{
		for(int i=0;i<5;i++)
		{
			createRandomCode(5);
		}
	}

}
