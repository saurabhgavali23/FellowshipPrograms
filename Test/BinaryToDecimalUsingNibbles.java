package Test;

public class BinaryToDecimalUsingNibbles {
	
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
		for(int j=i;j>=0;j--)
		{
			System.out.print(sum[j]+" ");
			str+=String.valueOf(sum[j]);
		}
		System.out.println();
		return str;
	}
	
	public static void main(String[] args) {
	
		String str,str1="",str2="",str3;
		 str=decToBinary(100);
		 
		 int len=str.length()/2;
		
		 for(int i=0;i<len;i++)
			str1+=str.charAt(i);
		 
		 for(int i=len;i<str.length();i++)
			 str2+=str.charAt(i);
		 
		 str3=str2.concat(str1);
		 int i=0;
		while(i<str3.length())
		{
			 System.out.print(str3.charAt(i)+" ");
			 i++;
		}
		 System.out.println();
		 System.out.println(Integer.parseInt(str3,2));
	}

}
