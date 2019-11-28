package Test;

public class DoublyLinkedList {

	Node head;
	
	 public static class Node
	 {
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
	 
	 public static DoublyLinkedList addAtBeg(DoublyLinkedList list,int data)
	 {
		 Node nn=new Node(data);
		 
		 nn.next=list.head;
		 nn.prev=null;
		 
		 if(list.head!=null)
			 list.head.prev=nn;
		 
		 list.head=nn;
		 
		 return list;
	 }
	 
	 public static DoublyLinkedList addAtEnd(DoublyLinkedList list, int data)
	 {
		 Node nn=new Node(data);
		 
		 Node en=list.head;
		 
		 if(list.head==null)
		 {
			 list.head=nn;
		 }
		 else
		 {
			 while(en.next!=null)
			 {
				 en=en.next;
			 }
			 en.next=nn;
			 
			 nn.prev=en;
		 }
		 
		 
		 
		 return list;
	 }
	 
	 public static void printList(DoublyLinkedList list)
	 {
		 if(list.head==null)
			 System.out.println("nothing to display");
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
	 
	 public static void main(String[] args) {
		
		 DoublyLinkedList list=new DoublyLinkedList();
		 
		/*
		 * list=addAtBeg(list, 10); list=addAtBeg(list, 20); list=addAtBeg(list, 30);
		 */
		 
		 list=addAtEnd(list, 10);
		 list=addAtEnd(list, 20);
		 list=addAtEnd(list, 30);
		 
		 
		 printList(list);
		 
	}
}
