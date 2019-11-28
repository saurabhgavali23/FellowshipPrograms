package Test;

public class InsertElementInArray {

	public static void main(String[] args) {
		
		int arr[]= {10,20,40,50};
		int pos=2;
		int data=30;
		System.out.println(arr.length);
		for(int i=arr.length-1;i>=pos;i--)
		{
			System.out.println(i);
			arr[i]=arr[i-1];
			
		}
		arr[pos-1]=data;
		
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}
}
