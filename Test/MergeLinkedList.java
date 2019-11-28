package Test;

public class MergeLinkedList {

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
	
	public static MergeLinkedList addNode(MergeLinkedList list,int data)
	{
		Node nn=new Node(data);
		if(list.head==null)
		{
			list.head=null;
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
	
}
