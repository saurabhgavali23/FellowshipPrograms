package Test;

public class Stack {

	final int Max=10;
	int a[]=new int[Max];
	int top;
	
	Stack()
	{
		top=-1;
	}
	
	public void push(int data)
	{
		if(top>=(Max-1))
		{
			System.out.println("Stack overflow");
		}
		else
		{
			a[++top]=data;
			System.out.println(data+" Element pushed");
		}
	}
	
	public void pop()
	{
		if(top<0)
		{
			System.out.println("Stack is underflow");
		}
		else
		{
			int x=a[top--];
			System.out.println(x+" element is poped");
		}
	}
	
	public void peek()
	{
		if(top<0)
		{
			System.out.println("stack is underflow");
		}
		else
		{
			int x=a[top];
			System.out.println("Top is: "+x);
		}
	}
	
	public static void main(String[] args) {
		
		Stack s=new Stack();
		
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.pop();
		
		s.peek();
		
	}
}
