package Test;

public class LinkedList {
	static Node head;
	static class Node
	{
		private int data;
		private Node next;
		
		Node (int data)
		{
			this.data=data;
			this.next=null;
		}
	}

	/*
	 * static Node insertfirst(Node head,int data) {
	 * 
	 * return head; }
	 */
	void print(Node head)
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+"-->");
			temp=temp.next;
		}
		

		System.out.println(temp);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list=new LinkedList();

		Node head=new Node(10);
		Node sec=new Node(20);
		Node third=new Node(30);
		Node fourth=new Node(40);
	
		head.next=sec;
		sec.next=third;
		third.next=fourth;
		
		list.print(head);
	}

}
