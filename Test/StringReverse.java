package Test;

public class StringReverse {

	public static void main(String[] args) {
		
		String str="Saurabh Gavali";
		char arr[]=str.toCharArray();
		int len=str.length();
		String rev="";
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++)
			{     int k=j;
				if(arr[i]==arr[j] && i!=j)
				{    
					while(k<len-1)
					{
						arr[k]=arr[k+1];
						k++;
					}
					len--;
				}
				
			}
		}
		for(int i=0;i<len-1;i++)
		System.out.print(arr[i]);
	}
}
