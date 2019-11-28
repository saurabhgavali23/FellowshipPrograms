package Test;

public class PrintAlpha {

	public static void main(String[] args) {
		
	
		for(char i='F';i>='A';i--)
		{
			for(char j='A';j<=i;j++)
			{
				System.out.print(j+" ");
				
			}
			for(char k='A';k<'F'-1;k++)
			{
				for(char j='F';j>i;j--)
				{
					System.out.print(" ");
				}
			}
			for(char j=i;j>='A';j--)
			{
				System.out.print(j+" ");
				
			}
			
			System.out.println();
		}
         int len=12;
 		for(char i='A';i<'F';i++)
		{
			for(char j='A'+1;j<i;j++)
			{
				System.out.print(j+" ");
				
			}
		
				for(char k='A';k<='z';k--)
				{
					System.out.print(" ");
					
				}
			}
 			/*for(char j=;j>='A';j--)
			{
				System.out.print(j+" ");
				
			}
			System.out.println();*/
		
		}
		
} 

