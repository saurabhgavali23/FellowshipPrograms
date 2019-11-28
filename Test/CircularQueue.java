package Test;

public class CircularQueue {

	int max=5;
	int arr[]=new int [max];
	
	int front=0;
	int rear=-1;
	
	public void insert(int data)
	{
		if(rear==max-1)
		{
			System.out.println("Queue is full");
		}
		else
		{
			rear=rear+1;
			arr[rear]=data;
		}
	}
	
	public void delete()
	{
		if(rear==-1)
		{
			System.out.println("Queue is empty");
		}
		else
		{
			for(int i=front;i<rear;i++)
				arr[i]=arr[i+1];
		}
		rear=rear-1;
	}
	
	public void display()
	{
		if(rear==-1)
		{
			System.out.println("Queue is empty");
		}
		else
		{
			for(int i=front;i<=rear;i++)
				System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		
		CircularQueue cq=new CircularQueue();
		
		cq.insert(10);
		cq.insert(20);
		cq.insert(30);
		
		cq.display();
		
		cq.delete();
		System.out.println();
		cq.display();
		cq.insert(40);
		System.out.println();
		cq.display();
		cq.insert(50);
		System.out.println();
		cq.display();
		cq.insert(60);
		System.out.println();
		cq.display();
		cq.delete();
		cq.insert(70);
		System.out.println();
		cq.display();
	}
}
