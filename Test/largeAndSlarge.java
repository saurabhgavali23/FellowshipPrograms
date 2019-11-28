package Test;

public class largeAndSlarge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,4,5,7,1,8};
		int large=arr[0];
		int slarge=arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if(large<arr[i])
			{
			slarge=large;
			large=arr[i];
			}
		else if(slarge<arr[i])
		{
			slarge=arr[i];
		}
			
		}
		System.out.println(large);
		System.out.println(slarge);
	}

}
