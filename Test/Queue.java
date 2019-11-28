package Test;

public class Queue {
	
	int size=5;
	int arr[]=new int[size];
	
	int front=0,rear=-1;
	
	public void insert(int data)
	{
		if(rear==size-1)
			System.out.println("Queue is full");
		else
		{
			rear=rear+1;
			arr[rear]=data;
		}
	}
	
	public void delete()
	{
		if(rear==-1)
			System.out.println("Queue is empty");
		else
		{
			int x=arr[front];
			front=front+1;
			System.out.println(x+" deleted");
		}
	}
	
	public void display()
	{
		if(rear==-1)
			System.out.println("Nothing to display");
		else
		{
			for(int i=front;i<=rear;i++)
			{
				System.out.println(arr[i]);
			}
		}
	}
	
	public static void main(String[] args) {
		
		Queue q=new Queue();
		q.insert(10);
		q.insert(20);
		q.insert(30);
		q.display();
		
		q.delete();
		q.display();
	}

}
