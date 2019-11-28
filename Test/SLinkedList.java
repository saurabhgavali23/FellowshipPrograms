package Test;

public class SLinkedList {

	Node head;
	
	static class Node{
		
		int data;
		Node next;
		
		Node(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	
	public static SLinkedList addAtBeg(SLinkedList list, int data)
	{
		Node nn=new Node(data);
		
		if(list.head==null)
		{
			list.head=nn;
		}
		else
		{
			nn.next=list.head;
			list.head=nn;
		}
		
		return list;
	}
	
	public static SLinkedList addAtEnd(SLinkedList list,int data)
	{
		Node nn=new Node(data);
		
		if(list.head==null)
		{
			list.head=nn;
		}
		else
		{
			Node en=list.head;
			
			while(en.next!=null)
			{
				en=en.next;
			}
			en.next=nn;
		}
		
		return list;
	}
	
	public static SLinkedList addByPos(SLinkedList list,int data,int pos)
	{
		Node nn=new Node(data);
		Node p=list.head;
		Node q=list.head.next;
		
		if(pos==1)
		{
			q=list.head;
		}
		else
		{
			for(int i=1;i<pos-1;i++)
			{
				p=p.next;
				q=q.next;
			}
			Node store=q;
			p.next=nn;
			nn.next=q;
		}
		
		return list;
	}
	
	public static void printList(SLinkedList list)
	{
		if(list.head==null)
			System.out.println("Nothing to display");
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
	
	
	public static void main(String[] args) {
		
		SLinkedList list=new SLinkedList();
		
		list=addAtBeg(list, 10);
		list=addAtBeg(list, 20);
		list=addAtBeg(list, 30);
		
		printList(list);
		
		list=addAtEnd(list, 40);
		printList(list);
		
		System.out.println("=====");
		list=addByPos(list, 50, 3);
		printList(list);
		
		System.out.println("------------");

	}

}
