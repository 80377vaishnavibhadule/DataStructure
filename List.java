package dsa;

public class List {
 
	public class Node{
		private int data;
		private Node next;
		public Node(int value)
		{
			data =value;
			next =null;
			
		}	
	}
	private Node head;
	public List()
	{
		head=null;
	}
	public boolean isEmpty()
	{
		return head==null;
	}
	
	public void addFirst(int value)
	{
		Node newnode =new Node(value);
		if(isEmpty())
		
			head=newnode;
		
	else
	{
		newnode.next=head;
		head =newnode;
	}
		
}
 public void addLast(int value)
 {
	 
	 Node newnode =new Node(value);
	 if(isEmpty())
		 head=newnode;
 
 else
 {
	 
	 Node trav =head;
	 while(trav.next !=null)
		 trav=trav.next;
	 trav.next=newnode;
		 
 }}

 public void addPosition(int value ,int pos)
 {
	 Node newnode =new Node (value);
	 if(isEmpty())
		 head=newnode;
	 else if (pos<= 1)
		 addFirst(value);
	 else
	 {
		 Node trav =head;
		 for(int i=1;trav.next !=null && i< pos -1 ;i++)
			 trav =trav.next;
		 newnode.next=trav.next;
		 trav.next =newnode;
	 }
 }
 public void deleteFirst()
 {
	 if(isEmpty())
		 return ;
	 else
		 head=head.next;
 }
 
 public void deleteLast()

{
	 if(isEmpty())
		 return ;
	 else if(head.next ==null)
		 head=null;
	 else {
		 Node trav=head;
		 while(trav.next.next!=null) {
		 trav=trav.next;
		 trav.next=null;
		 }
	
}
}	 
	 public void deletePosition(int pos)
	 {
		 if(isEmpty())
		 {
			 return;
		 }
		 else if(pos <= 1)
			 deleteFirst();
		 else
		 {
			 Node trav=head;
			 for(int i=1;trav.next.next!=null && i<pos -1 ;i++)
			 {
				trav =trav.next; 
				trav.next=trav.next.next;
			 }
		 }
		 
		 
	 }
	 public void display()
	 {
		 Node trav =head;
		 System.out.println("List :");
		 while(trav!=null)
		 {
			 System.out.println("    "+trav.data);
			 trav =trav.next;
		 }
		 System.out.print("");
	 } 
	 public void deleteAll()
	 {
		 head =null;
		 
	 }
	} 

