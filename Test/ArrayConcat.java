package Test;

public class ArrayConcat {

	public static void main(String[] args) {
		
		int arr[]={'6','8'};
		
		char arr1[]= {'a','b'};
	
		char arr2[]=new char[arr.length+arr1.length];
		
		int len=arr2.length;
		
		int j=0,i=0;
		
				while(len>j)
				{
						arr2[j]=(char) arr[i];
						arr2[++j]=arr1[i];
						i++;
						j++;
				}
		 
		
		for(int h=0;h<arr2.length;h++)
			System.out.print(arr2[h]+" ");
	}
}
