package Test;

public class Demo  {

	public static void main(String[] args) {
		
		String str="saurabh";
		int count=0;
		char c,ch,ch1 = 0;
		for(int i=0;i<str.length();i++)
		{
			 c=str.charAt(i);
			
			 for(int j=0;j<str.length();j++)
			 {
				 ch=str.charAt(j);
				 
				 if(i!=j && c==ch)
				 {
					 //System.out.print(c+" ");
					 ch1=c;
					 count++;
				 }
			 }
		}
		System.out.println();
		System.out.println(ch1+" "+count);
	}
}
