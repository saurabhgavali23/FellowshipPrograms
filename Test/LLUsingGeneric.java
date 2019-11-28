package Test;

public class LLUsingGeneric {
	
	static Node head;
	public static int size=0;
	
	static class Node<T>
	{
		T data;
		Node<T> next;
		
		Node(T data)
		{
			this.data=data;
			this.next=null;
		}
	}
	
	public static <T> void addAtBeg(T data)
	{
		Node<T> nn=new Node<T>(data);
		
		if (head == null) {
			head = nn;
			size++;
		} else {
			nn.next = head;
			head = nn;
			size++;
		}
	}
	
	public static<T> void addAtEnd(T data)
	{
		Node<T> nn=new Node<T>(data);
		
		if(head==null)
		{
			head=nn;
			size++;
		}
		else
		{
			Node<T> en=head;
			
			while(en.next!=null)
			{
				en=en.next;
			}
			en.next=nn;
			size++;
		}
	}
	
	public static<T> T search(T str)
	{
		Node<T> en=head;
		if(head==null)
		{
			System.out.println("Nothing to search");
		}
		else
		{
			while(en!=null)
			{
				if(en.data.equals(str)) 
				{
					System.out.println("String found");
					return str;
				}
				en=en.next;
			}
		}
		return null;
	}
	
	public static <T> T delete(T str)
	{
		if(head==null)
			System.out.println("Nothing to delete");
		else
		{
			Node<T> p=head;
			Node<T> q=head.next;
			if(p.data.equals(str))
			{
				head=q;
				size--;
				return str;
			}
			else
			{
				while (q != null) {
					if (q.data.equals(str)) {
						p.next = q.next;
						size--;
						return str;
					}
					p = p.next;
					q = q.next;
				}
			}
		}
		return null;
	}
	
	public static <T> T getNode(int str)
	{
		Node<T> en=head;
		
		int count=0;
		
		while(en!=null)
		{
			if(count==str)
				return en.data;
			count++;
			en=en.next;
		}
		return null;
	}
	
	public static<T> void addByPos(T data , int pos)
	{
		Node<T> nn=new Node<T>(data);
		
		if(head==null)
		{
			head=nn;
			size++;
		}
		if(pos==1)
		{
			nn.next=head;
			head=nn;
			size++;
		}
		else
		{
			try {
				
				Node<T> p=head;
				Node<T> q=head.next;
				
				for(int i=1;i<pos-1;i++)
				{
					p=p.next;
					q=q.next;
				}
				if(p.next==null)
				{
					p.next=nn;
					size++;
				}
				else
				{
					Node<T> store=q;
					p.next=nn;
					nn.next=q;
					size++;
				}
			}catch(NullPointerException e)
			{
				System.out.println("Wrong Position Entered");
			}
		}
		
	}
	
	public static <T> void deleteAtBeg()
	{
		if(head==null)
			System.out.println("Nothing to delete");
		else
		{
			Node<T> p=head;
			Node<T> q=head.next;
			if(p.next==null)
			{
				p=null;
				size--;
			}
			else
				head=q;
				
		}
	}
	
	public static <T> void deleteAtEnd()
	{
		if(head==null)
			System.out.println("Nothing to delete");
		else
		{
			Node<T> p=head;
			Node<T> q=head.next;
			while(q.next!=null)
			{
				p=p.next;
				q=q.next;
			}
			p.next=null;
			size--;
		}
	}
	
	public static <T> void deleteByPos(int pos)
	{
		if(head==null)
		{
			System.out.println("Nothing to delete");
		}
		else
		{
			Node<T> p=head;
			Node<T> q=head.next;
			
			if(pos==1)
			{
				head=q;
				size--;
			}
			else
			{
				for(int i=1;i<pos-1;i++)
				{
					p=p.next;
					q=q.next;
				}
				p.next=q.next;
				q.next=null;
				size--;
			}
			
		}
	}
	
	
	public static <T> void printList()
	{
		if(head==null)
		{
			System.out.println("Nothing to print");
		}
		else
		{
			Node<T> en=head;
			while(en.next!=null)
			{
				System.out.print(en.data+" ");
				en=en.next;
			}
			System.out.print(en.data);
		}
	}
	
	public static void main(String[] args) {
		
		addAtBeg('a');
		addAtBeg(4.2);
		addAtEnd('c');
		addAtEnd(45);
		addAtEnd(12);
		addAtBeg("Saurabh");
		delete('c');
		
		
		printList();
		System.out.println();
		System.out.println(size);
//		System.out.println();
//		System.out.println("======");
//		addByPos('d', 4);
//		printList();
//		System.out.println();
//		System.out.println("++++");
//		deleteAtBeg();
//		printList();
//		System.out.println();
//		System.out.println("++++");
//		deleteAtEnd();
//		printList();
//		System.out.println();
//		System.out.println("++++");
//		deleteByPos(2);
//		printList();
//		System.out.println();
//		System.out.println("((((((((((((((");
		System.out.println();
		search("Saurabh");
		
	}

}
