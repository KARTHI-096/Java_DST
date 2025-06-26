package Linked_Lists;

// singly insertion at beginning o(1)
// insertion at end o(1)
// middle o(n);

class Node1
{
	Node1 pre;
	int data;
	Node1 next;
}

class method1
{
	static int n = 0;
	
	static Node1 head,tail;
	
	public static void insertatbegin(int data)
	{
		Node1 newNode = new Node1();
		
		newNode.next = null;
		newNode.pre = null;
		newNode.data = data;
		
		if (head == null)
		{
			head = tail =  newNode;
			head.pre = head;
			head.next = head;
		}
		
		else
		{
			newNode.next = head;
			newNode.pre = tail;
			
			tail.next = newNode;
			head.pre = newNode;
			
			head = newNode;
		}
		
	}
	
	public static void insertatmiddle(int data,int pos)
	{
		Node1 newNode = new Node1();
		
		
		newNode.next = null;
		newNode.pre = null;
		newNode.data = data;
		
		if (pos == 0)
		{
			newNode.next = head;
			newNode.pre = tail;
			
			tail.next = newNode;
			head.pre = newNode;
			
			head = newNode;
		}
		else
		{
		Node1 temp1 = head;
		do
		{
			temp1 = temp1.next;
		}
		while(temp1 != head);
		}
		
		
	}
	
	public static void insertatend(int data)
	{
		
		Node1 newNode = new Node1();
		
		newNode.next = null;
		newNode.pre = null;
		newNode.data = data;
		
		if (head == null)
		{
			head = tail =  newNode;
			head.pre = head;
			head.next = head;
		}
		
		else
		{
			newNode.next = head;
			head.pre = newNode;
			tail.next = newNode;
			newNode.pre = tail;
			
			tail = newNode;
			
		}
		 
	}
	
	
	public static void traverse()
	{
		Node1 temp1 = head;
		 do
		 {
			 System.out.print(temp1.data + " ");
			 temp1 = temp1.next;
		 } while(temp1 != head);
	}
	
}
public class Cicular_Linked_list extends method1{
	public static void main(String[] args)
	{
		insertatbegin(1);
		insertatbegin(2);
		insertatend(3);
		traverse();
		
	}

}
