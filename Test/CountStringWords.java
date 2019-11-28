package Test;

public class CountStringWords {

	public static void main(String[] args) {
		
		String str="Saurabh Kishor Gavali";
		int len=str.length();
		int count=0;
		for(int i=0;i<len;i++)
		{
			char c=str.charAt(i);
			
			if(c==' ')
			{
				count++;
			}
		}
		System.out.println(count+1);
	}
}
