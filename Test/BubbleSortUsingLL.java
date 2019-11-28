package Test;

public class BubbleSortUsingLL {

	Node head;
	static int size=0;
	static class Node{
		
		int data;
		Node next;
		
		Node(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	
	public static BubbleSortUsingLL addNode(BubbleSortUsingLL list, int data)
	{
		Node nn=new Node(data);
		if(list.head==null)
		{
			list.head=nn;
			size++;
		}
		else
		{
			Node en=list.head;
			while(en.next!=null)
			{
				en=en.next;
				size++;
				//System.out.println(size);
			}
			en.next=nn;
			
		}
		return list;
	}
	
	public static void printList(BubbleSortUsingLL list)
	{
		if(list.head==null)
		{
			System.out.println("nothing to display");
		}
		else
		{
			Node en=list.head;
			while(en.next!=null)
			{
				System.out.print(en.data+" ");
				en=en.next;
			}
			System.out.println(en.data);
		}
	}
	
	public static void bubbleSort(BubbleSortUsingLL list)
	{
		Node p=list.head;
		Node q=list.head.next;
		int i=0;
		for(int j=0;j<size-1;j++)
		{
			i=0;
			while(i<size-1)
			{
				if(p.data>q.data)
				{
					int temp=p.data;
					p.data=q.data;
					q.data=temp;
				}
				p=p.next;
				q=q.next;
				i++;
			}
			p=list.head;
			q=list.head.next;
		}
	}
	
	
	public static void main(String[] args) {
		
		BubbleSortUsingLL list =new BubbleSortUsingLL();
		
		list=addNode(list, 10);
		list=addNode(list, 5);
		list=addNode(list, 9);
	//	list=addNode(list, 2);
		list=addNode(list, 1);
		
		printList(list);
		
		bubbleSort(list);
		System.out.println("+++++");
		printList(list);
	}
}
