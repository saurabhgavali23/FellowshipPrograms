package Test;

public class StringPermutation {

	public static void stringPermutation(String str,String ans)
	{

		System.out.println(str.length());
		if(str.length()==0)
		{
			System.out.print(ans+" ");
			return;
		}
		
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			
			String ros=str.substring(0,i)+str.substring(i+1);

			stringPermutation(ros, ans+c);
		}
	}
	
	public static void main(String[] args) {
		
		String str="abc";
		stringPermutation(str, " ");
	}
}
