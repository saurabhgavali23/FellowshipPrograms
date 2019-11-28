package Test;

public class StackUsingParanthesis {
	int max=5;
	char arr[]=new char[max];
	
	int top=-1;
	
	
	public void push(char data)
	{
		if(top==max-1)
		{
			System.out.println("Stack Overflow");
		}
		else
		{
			top=top+1;
			arr[top]=data;
		}
	}
	
	 char pop()
	{
		if(top==-1)
		{
			System.out.println("Stack UnderFlow");
		}
		else
		{
			char x=arr[top];
			top=top-1;
			return x;
		}
		return 'l';
	}
	
	public void display()
	{
		if(top==-1)
		{
			System.out.println("Stack Underflow");
		}
		else
		{
			for(int i=top;i>=0;i--)
			{
				System.out.println(arr[i]+" ");
			}
		}
	}
	
	boolean isEmpty()
	{
		return (top==-1)? true:false;
	}
	
	static boolean matchthepair(char ch1 ,char ch2)
	{
		if(ch1=='(' && ch2==')')
			return true;
		else if(ch1=='{' && ch2=='}')
			return true;
		else if(ch1=='[' && ch2==']')
			return true;
		return false;
	}
	
	static boolean parenthesesBalanaced(char arr[])
	{
		StackUsingParanthesis st=new StackUsingParanthesis();
		
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]=='{' || arr[i]=='(' || arr[i]=='[')
				st.push(arr[i]);
			
			if(arr[i]=='}' || arr[i]==')' || arr[i]==']')
			{
				if(st.isEmpty())
					return false;
				
				else if(!matchthepair(st.pop(), arr[i]))
				{
					return false;
				}
			}
		}
		
		if(st.isEmpty())
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		
		char arr[]={'[','(',')','{','}',']'};
		
		if(parenthesesBalanaced(arr))
			System.out.println("Balanced");
		else
			System.out.println("not balanced");
	}

}
