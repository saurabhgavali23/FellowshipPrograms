package Test;

public class Stack1 {
	
	int top=-1,max=5;
	int arr[]=new int[max];
	
	public void push(int data)
	{
		if(top==max-1)
			System.out.println("Stack it Overflow");
		else
		{
			top=top+1;
			arr[top]=data;
		}
	}
	
	public void pop()
	{
		if(top==-1)
			System.out.println("Stack is Underflow");
		else
		{
			int x=arr[top];
			top=top-1;
			System.out.println(x+" poped");
		}
	}
	
	public void peak()
	{
		if(top==-1)
			System.out.println("Stack is Underflow");
		else
		{
			System.out.println("Peak value is "+arr[top]);
		}
	}
	
	public void display()
	{
		if(top==-1)
			System.out.println("Stack is Underflow");
		else
		{
			for(int i=top;i>=0;i--)
				System.out.println(arr[i]);
		}
	}
	public static void main(String args[])
	{
		Stack1 s=new Stack1();
		s.push(10);
		s.push(20);
		s.push(30);
		s.display();
		s.pop();
		s.display();
		s.peak();
		s.display();

	}
	

}
