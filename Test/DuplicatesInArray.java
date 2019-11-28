package Test;

public class DuplicatesInArray {

	public static void main(String[] args) {
		
		int arr[]= {7,6,8,8,2,3,7,7,7,7,7,};
		int len=arr.length-1;
		//int index=4;
		
		for(int i=0;i<len;i++)
		{
			for(int j=0;j<len;j++)
			{
				if(i!=j && arr[i]==arr[j])
				{
					while(j<len)
					{
						arr[j]=arr[j+1];
						j++;
					}
					len--;
				}
			}
		}

		for(int i=0;i<len;i++)
			System.out.print(arr[i]+" ");
	}
}
