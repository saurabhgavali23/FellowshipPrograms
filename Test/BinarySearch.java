package Test;

public class BinarySearch {

	public static void main(String[] args) {
		
		int arr[]= {10,20,30,40,50};
		int r=arr.length-1;
		int l=0;
		int n=50;
		//int mid=(l+r)/2;
		while(r>=l)        
		{
			int mid=(l+r)/2;
			System.out.println(mid);
			if(arr[mid]==n)
			{
				System.out.println("found "+n+" locate "+mid);
				break;
			}
			
			if(arr[mid]>n)
				r=mid-1;
			else
				l=mid+1;
		}
		if(l>r)
			System.out.println("not found");
	}
}
