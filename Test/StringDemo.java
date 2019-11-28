package Test;

public class StringDemo {

	public static void main(String[] args) {
	int c=0,c1=0,c2=0,c3=0,c4=0,c5=0,c6=0,c7=0;
	
		String str="a man is the going to the jungle at a 9 o'clock";
		//System.out.println(str.replace(a,j));
		String arr[]=null;
		String str1 = null;
		for(int i=0;i<str.length();i++)
		{
			arr=str.split(" ");
		}
		
		for(int i=0;i<arr.length;i++)
		{
			
			if(arr[i].equals("a"))
			{
				c++;
				arr[i]="";
			}
			else if(arr[i].equals("an"))
			{
				c1++;
				arr[i]="";
			}
			else if(arr[i].equals("the"))
			{
				c2++;
				arr[i]="";
			}
			else if(arr[i].equals("is"))
			{
				c3++;
				arr[i]="";
			}
			else if(arr[i].equals("are"))
			{
				c4++;
				arr[i]="";
			}
			else if(arr[i]=="were")
			{
				c5++;
				arr[i]="";
			}
			else if(arr[i].equals("was"))
			{
				c6++;
				arr[i]="";
			}
			else if(arr[i].equals("be"))
			{
				c7++;
				arr[i]="";
			}
		}
		System.out.println("a= "+" "+c);
		System.out.println("an= "+" "+c1);
		System.out.println("the= "+" "+c2);
		System.out.println("is= "+" "+c3);
		System.out.println("are= "+" "+c4);
		System.out.println("were= "+" "+c5);
		System.out.println("was= "+" "+c6);
		System.out.println("be= "+" "+c7);	
		System.out.println();
		System.out.println("===================");
		
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		 
		str1=String.join(" ",arr);
		System.out.println();
		System.out.println(str1);
	}
	


}
