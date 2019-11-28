package Test;

public class BinarySearchUsingLinkedList {

	Node head;
	int size=0;
	public static class Node{
		
		int data;
		Node next;
		
		Node(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	public static BinarySearchUsingLinkedList addNode(BinarySearchUsingLinkedList list,int data)
	{
		Node nn=new Node(data);
		
		if(list.head==null)
		{
			list.head=nn;
			list.size++;
		}
		else
		{
			Node en=list.head;
			while(en.next!=null)
			{
				en=en.next;
			}
			en.next=nn;
			list.size++;
		}
		
		return list;
	}
	
	public static void printList(BinarySearchUsingLinkedList list)
	{
		if(list.head==null)
			System.out.println("Nothing to print");
		else
		{
			Node en=list.head;
			while(en.next!=null)
			{
				System.out.print(en.data+" ");
				en=en.next;
			}
			System.out.print(en.data);
		}
	}
	
	public static void  BinarySearch(BinarySearchUsingLinkedList list,int key)
	{
		Node fn=list.head;
		
		int last=list.size-1;
		int first=0;
		
		int mid=(first+last)/2;
		
		while(first<=mid)
		{
			while(first<=mid)
			{
				fn=fn.next;
				first++;
			}
			if(fn.data==key)
			{
				System.out.println("Element found "+key);
				break;
			}
			else if(fn.data<key)
			{
				first=mid+1;
			}
			else
			{
				last=mid-1;
			}
			mid=(first+last)/2;
			
		}
		if(first>last)
			System.out.println("Not found");
	}
	
	public static void main(String[] args) {
		
		BinarySearchUsingLinkedList list=new BinarySearchUsingLinkedList();
		
		list=addNode(list,10);
		list=addNode(list,20);
		list=addNode(list,30);
		list=addNode(list,40);
		list=addNode(list,50);
		
		printList(list);
		
		BinarySearch(list, 50);
		
		
		
		
	}
}
