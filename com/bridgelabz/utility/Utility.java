package com.bridgelabz.utility;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utility {
	
	static Scanner s=new Scanner(System.in);
	
	public static Integer inputInterger()
	{
		return s.nextInt();
	}
	
	public static String inputString()
	{
			return s.nextLine();
	}
	
	public static boolean stringValidate(String str)
	{
		return ((!str.equals("")) 
				 && (str != null)
	            && (str.matches("^[a-zA-Z]*$")) || !str.equals(" ")); 
	}
	
	public static boolean integerValidate(String num)
	{
		 String regex = "[+-]?[0-9][0-9]*"; 
		 
		 Pattern p = Pattern.compile(regex); 
         
	        Matcher m = p.matcher(num); 
	          
	        if(m.find() && m.group().equals(num))
	        	return true;
	    return false;
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
		
		while(n!=0)
		{
			
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
		String line;
		File file=new File(path);
//		
//		FileReader fr=new FileReader(file);
//		
//		BufferedReader br=new BufferedReader(fr);
//		
//		String line;
//		
//		while((line=br.readLine())!=null)
//		{
//			arr=line.split(" ");
//		}
//		br.close();
		
		Scanner s=new Scanner(file);
		
		while(s.hasNext())
		{
			line=s.nextLine();
			arr=line.split(" ");
		}
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
				if((arr[j]).compareTo(arr[j+1])>=0)
				{
					temp= arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}
	
	public static<T extends Comparable<T>> T[] insertionSort(T arr[])
	{
		T key;
		for(int i=1;i<arr.length;i++)
		{
			 key=arr[i];
			int j=i-1;
			
			while(j>=0 && arr[j].compareTo(key)>0)
			{
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=key;
		}
		return arr;
	}
	
	public static void binrySearch(String arr[],String key)
	{
		int first=0;
		int last=arr.length-1;
		int flag=0;
		while(first<=last)
		{
			int mid=(first+last)/2;
			//int ss=arr[mid].compareTo(str);
			//System.out.println(ss+" "+mid);
			if(arr[mid].equals(key))
			{
				System.out.println("String found");
				flag=1;
				break;
			}
			if(key.compareTo(arr[mid]) > 0) 
				first = mid + 1;
			else
				last = mid - 1;
		}
		
		if(flag==0)
			System.out.println("String not found");
	}
	
	public static String[] mergeSort(String s[],int first,int last)
	{   
		if(first<last)
		{
		int mid=(first+last-1)	/2;
		s=mergeSort(s,first,mid-1);
		s=mergeSort(s,mid+1,last);
	     s=merge(s,first,mid,last);
		}
	    return s;
	    
	}
	
	
	public static String[]  merge(String arr[], int first, int mid, int last) 
    { 
        int n1 = (mid - first) + 1; 
        int n2 = last - mid; 
  
        
        String left[] = new String [n1]; 
        String right[] = new String [n2]; 
        
      
        for (int i=0; i<n1; ++i) 
            left[i] = arr[first + i]; 
        for (int j=0; j<n2; ++j) 
            right[j] = arr[(mid + 1)+ j]; 
  
  
        int i = 0, j = 0; 
  
              int k = first; 
             
          	

        while (i < n1 && j < n2) 
        { 
        	//compare left array string of index i with  right array index  j
            if (left[i].compareToIgnoreCase(right[j])<=0 ) 
            { 
                arr[k] = left[i]; 
                i++; 
            } 
            else
            { 
                arr[k] = right[j]; 
                j++; 
            } 
            k++; 
        } 
  
      //fetch remaining data of array
        while (i < n1) 
        { 
            arr[k] = left[i]; 
            i++; 
            k++; 
        } 
  
      
        while (j < n2) 
        { 
            arr[k] = right[j]; 
            j++; 
            k++; 
        }
        return arr;
    } 
	
	public static boolean stringAnnagram(String str1,String str2)
	{
		char c1[]=str1.toUpperCase().toCharArray();
		char c2[]=str2.toUpperCase().toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		if(c1.length!=c2.length)
		{
			return false;
		}
		
		boolean status=Arrays.equals(c1, c2);
		
		if(status)
			return true;
		
		return false;
	}
	
	public static boolean checkPrimeNo(int n)
	{
		int m=n/2;
		int flag=0;
		for(int i=2;i<m;i++)
		{
			if(n%i==0)
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
			return false;

		return true;
	}
	
	public static int[] converIntoArrayInt(int n)
	{
		int arr[] = new int[10];
		int r=0,i=0;
		while(0<n)
		{
			r=n%10;
			arr[i]=r;
			i++;
			n=n/10;
		}
		return arr;
	}
	
	public static boolean checkAnnagramNo(int arr[],int arr1[])
	{	
		Arrays.sort(arr);
		Arrays.sort(arr1);
		
		boolean status=Arrays.equals(arr, arr1);
			
		if(status==true)
			return true;
		
		return false;
		
	}
	
	public static String decToBinary(int n)
	{
		int sum[]=new int[16];
		String str ="";
		int r,i=0;
		while(0<n)
		{
			r=n%2;
			sum[i]=r;
			n=n/2;
			i++;
		}
		for(int j=i-1;j>=0;j--)
		{
			//System.out.print(sum[j]+" ");
			str+=String.valueOf(sum[j]);
		}
		System.out.println();
		return str;
	}
	
	public static boolean checkPalindrome(int n)
	{
		int sum=0,r=0;
		int temp=n;
		while(0<n)
		{
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(sum==temp)
			return true;
		
		return false;
	}
	
	public static String dayOfWeek(int dd,int mm,int yy)
	{
		int y0=yy-(14-mm)/12;
	    int	x = y0 + y0/4-y0/100 + y0/400;
		int	m0 = mm + 12 * ((14-mm) / 12) -2;
		int d0 = (dd + x + (31*m0)/12)%7;
		
		switch(d0)
		{
		case 1:
			System.out.println("Monday");
			return "Monday";
		case 2:
			System.out.println("Tuesday");
			return "Tuesday";
		case 3:
			System.out.println("Wednesday");
			return "Wednesday";
		case 4:
			System.out.println("Thursday");
			return "Thursday";
		case 5:
			System.out.println("Friday");
			return "Friday";
		case 6:
			System.out.println("Saturday");
			return "Saturday";
		case 7:
			System.out.println("Sunday");
			return "Sunday";
			
		default:
			System.out.println("Day not found");
		}
		
		return null;
	}
}
