package com.bridgelabz.utility;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Utility {
	
	static Scanner s=new Scanner(System.in);
	
	public static Integer inputInterger()
	{
		return s.nextInt();
	}
	
	public static String inputString()
	{
		if(s.hasNextInt()==false)
			return s.next();
		return "Enter String only";
	}
	
	public static String allInputString()
	{
		return s.next();
	}
	
	public static Character inputChar()
	{
		return s.nextLine().charAt(0);
	}
	
	
	public static void addElementInArrayByPos(int arr[],int pos,int n)
	{
		
		//System.out.println(arr.length);
		for(int i=arr.length-1;i>pos;i--)
		{
			arr[i]=arr[i-1];
		}
		arr[pos]=n;
		
		  for( int i=0;i<arr.length;i++) 
		  { 
			  System.out.print(arr[i]+" "); 
		  }
	}
	
	public static void Armstrong(int n)
	{
		int sum=0,r;
		int temp=n;
		int count=0;
		
		while(n!=0)
		{
			count++;
			n=n/10;
		}
		
		n=temp;
		//System.out.println(n);
		while(n!=0)
		{
			//System.out.println(n);
			r=n%10;
			sum=sum+(int)Math.pow(r, count);
			n=n/10;
		}
		
		if(temp==sum)
			System.out.println("Armstrong"+" "+sum);
		else
			System.out.println("not Armstrong");
	}	
	
	
	public static String[] readFile(String path) throws IOException
	{
		String arr[]=null;
		File file=new File(path);
		
		FileReader fr=new FileReader(file);
		
		BufferedReader br=new BufferedReader(fr);
		
		String line;
		
		while((line=br.readLine())!=null)
		{
			arr=line.split(" ");
		}
		br.close();
		return arr;
	}
	

	public static void readWord(String path) throws FileNotFoundException
	{
		
		File file=new File(path);
		Scanner s=new Scanner(file);
		
		while(s.hasNext())
		{
			System.out.print(s.next()+" ");
		}
		s.close();
	}
	
	public static <T extends Comparable<T>> T[] bubbleSort(T arr[])
	{
		
		int len=arr.length;
		T temp;
		for(int i=0;i<len;i++)
		{
			for(int j=0;j<len-1;j++)
			{
				if(arr[j].compareTo(arr[j+1])>=0)
				{
					temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}
}
