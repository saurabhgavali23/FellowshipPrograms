package Test;

import com.bridgelabz.utility.Utility;

public class BankTransactionUsingQueue {

	static Node head;
	
	static class Node
	{
		long accNo;
		String name;
		float bal;
		Node next;
		
		Node(long accNo,String name,float bal)
		{
			this.accNo=accNo;
			this.name=name;
			this.bal=bal;
			this.next=null;
		}
	}
	
	public static void addNode(long accNo,String name,float bal)
	{
		Node nn=new Node(accNo,name,bal);
		
		if(head==null)
		{
			head=nn;
			System.out.println(nn.name+" "+"Added Sucessfully");
		}
		else
		{
			Node en=head;
			while(en.next!=null)
			{
				en=en.next;
			}
			en.next=nn;
			System.out.println(nn.name+" "+"Added Sucessfully");
		}
	}
	
	public static void deleteNode()
	{
		if(head==null)
			System.out.println("Queue is empty");
		else
		{
			Node p=head;
			Node q=head.next;
			
			p=null;
			q=head;
		}
	}
	
	public static int search(int accno)
	{
		Node en=head;
		if(en.accNo==accno)
		{
			return transaction(accno,en);
		}
		while(en.next!=null)
		{
			if(en.accNo==accno)
				return transaction(accno,en);
				
			en=en.next;
		}
		if(en.accNo==accno)
			return transaction(accno,en);
		
		return 0;
	}
	
	
	public static int transaction(int accno,Node en)
	{
		if(accno!=0)
		{
			System.out.println("====State Bank Of India====");
			System.out.println("Enter your Choice");
			System.out.println("1.Withdraw\n2.Diposite\n3.Exit");
			int ch=Utility.inputInterger();
			
			switch(ch)
			{
			case 1:
				System.out.println("Enter the Amount");
				int amt=Utility.inputInterger();
				if(amt>0 && amt<=en.bal)
				{
					en.bal=en.bal-amt;
					System.out.println("Transaction Successful");
					System.out.println(en.bal);
				}
				else
					System.out.println("Invalid Amount");
				break;
				
			case 2:
				System.out.println("Enter the Amount");
				int amt1=Utility.inputInterger();
				if(amt1>0)
				{
					en.bal=en.bal+amt1;
					System.out.println("Transaction Successful");
					System.out.println(en.bal);
				}
				else
					System.out.println("Invalid Amount");
				break;
				
			case 3:
				System.exit(0);
				break;
				
				default:
					System.out.println("Invalid Option");
					break;
			}
		}
		else
		{
			System.out.println("Account NO. Not Found");
		}
		
		return 0;
	}
	
	public static void printList()
	{
		int i=1;
		if(head==null)
			System.out.println("Queue is empty");
		else
		{
			Node en=head;
			while(en.next!=null)
			{
				System.out.print(i+++". "+en.accNo+" "+en.name+" "+en.bal+"\n");
				en=en.next;
			}
			System.out.print(i+++". "+en.accNo+" "+en.name+" "+en.bal);
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println("Enter the NO. of Records");
		int n=Utility.inputInterger();
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the Account No.");
			long acc=Utility.inputInterger();
			System.out.println("Enter the Name");
			String name=Utility.inputString();
			System.out.println("Enter the Balance");
			float bal=Utility.inputInterger();
			
			addNode(acc, name, bal);
		}
		System.out.println("+++++++++++++++++++++");
		printList();
		System.out.println();
		System.out.println("====================");
		System.out.println("Enter the Account No.");
		int acc=Utility.inputInterger();
		
		search(acc);
	}
}
