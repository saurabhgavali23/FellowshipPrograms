package Test;

public class DoublyLL {

	static Node head;
	static Node rev;
	
	DoublyLL()
	{
		head=null;
		rev=null;
	}
	
	static class Node{
		
		Node prev;
		int data;
		Node next;
		
		Node(int data)
		{
			this.prev=null;
			this.data=data;
			this.next=null;
		}
	}
	
	public static void addAtBeg(int data)
	{
		Node nn=new Node(data);
		
		nn.next=head;
		
		if(head!=null)
			head.prev=nn;
		
		head=nn;
	}
	
	public static void addAtEnd(int data)
	{
		Node nn=new Node(data);
				
		if(head==null)
		{
			//nn.next=head;
			head=nn;
		}
		else
		{
			Node en=head;
			while(en.next!=null)
			{
				en=en.next;
			}
			en.next=nn;
			nn.prev=en;
		}
	}
	
	public static void addByPos(int data,int pos)
	{
		Node nn=new Node(data);
		
		if(head==null)
		{
			nn.next=head;
			head=nn;
		}
		else
		{
			if(pos==1)
			{
				nn.next=head;
				head.prev=nn;
				head=nn;
			}
			else
			{
				Node p=head;
				Node q=head.next;
				
				for(int i=1;i<pos-1;i++)
				{
					p=p.next;
					q=q.next;
				}
				p.next=nn;
				nn.prev=p;
				nn.next=q;
				q.prev=nn;
			}
		}
	}
	
	public static void deleteFromBeg()
	{
		if(head==null)
		{
			System.out.println("Nothing to delete");
		}
		else
		{
			Node p=head;
			Node q=head.next;
			
			p=null;
			head=q;
		}
	}
	
	public static void deleteByPos(int pos)
	{
		if(head==null)
			System.out.println("Nothing to delete");
		else
		{
			Node p=head;
			Node q=head.next;
			if(pos==1)
			{
				p=null;
				head=q;
			}
			else
			{
				for(int i=1;i<pos-1;i++)
				{
					p=p.next;
					q=q.next;
				}
				if(q.next==null)
				{
					p.next=null;
				}
				else
				{
					p.next=q.next;
					q.next.prev=p.next;
				}
			}
		}
	}
	
	public static void deleteFromEnd()
	{
		if(head==null)
			System.out.println("Nothing to delete");
		else
		{
			Node p=head;
			Node q=head.next;
			while(q.next!=null)
			{
				p=p.next;
				q=q.next;
			}
			p.next=null;
		}
	}
	
	public static void printList()
	{
		if(head==null)
			System.out.println("Nothing to display");
		else
		{
			Node en=head;
			while(en.next!=null)
			{
				System.out.print(en.data+"<-->");
				en=en.next;
			}
			System.out.println(en.data);
			rev=en;
		}
	}
	
	public static void printRevList()
	{
		if(head==null)
			System.out.println("Nothing to display");
		else
		{
			System.out.println("==== Reverse List is ===");
			Node en= rev;
			while(en.prev!=null)
			{
				System.out.print(en.data+"<-->");
				en=en.prev;
			}
			System.out.println(en.data);
		}
	}
	
	public static void main(String[] args) {
		
		
		  addAtBeg(20); 
		  addAtBeg(10); 
		  addAtEnd(30); 
		  addByPos(40, 3); 
		  addByPos(50, 1);
		  addByPos(60, 5);
	//	 deleteFromBeg();
	//	  deleteByPos(5);
	//	 deleteFromEnd();
		printList();
		 printRevList();
	}
	
	
}
