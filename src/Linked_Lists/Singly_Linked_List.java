package Linked_Lists;

import java.util.Scanner;

class Node
{
	int data;
	Node link;
}

class Methods
{
	static Node head;
	static Node last;
	
	public static void insertAtBegain(int data)
	{
		Node newNode = new Node(); // Node creation
		
		newNode.data = data;
		newNode.link = null; // 1 Null
		
		if (head == null) // if head is NUll --> this is empty
		{
			head = newNode;
			last = newNode;
		}
		
		else
		{
			newNode.link = head;
			head = newNode;
		}
		
		System.out.println(head.data);
		
	}
	
	public static void insertAtMiddle(int data,int pos)
	{
		Node newNode = new Node();
		
		newNode.data = data;
		newNode.link = null;
		
		if(pos == 0)
		{
			newNode.link = head;
			head = newNode;
		}
		
		else
		{
	
		Node temp1 = head;
		Node temp2;
		
		for(int i = 0;i < (pos-1);i++)
		{
			temp1 = temp1.link;
		}
		
		temp2 = temp1.link;
		newNode.link = temp2;
		temp1.link = newNode;
		
		}
	}
	
	public static void insertAtEnd(int data)
	{
		Node newNode = new Node();
		
		newNode.data = data;
		newNode.link = null;
		
		if(head == null)
		{
			head = newNode;
			last = newNode;
		}
		else
		{
			last.link = newNode;
			last = newNode;
		}
	}
	
	public static void deleteAtBegain()
	{
		if (head == null) {
		    System.out.println("List is empty. Cannot delete.");
		}
		else
		{
		head = head.link;
	}
	}
	
	public static void deleteAtMiddle(int pos)
	{
		if (head == null) {
		    System.out.println("List is empty. Cannot delete.");
		}
		else
		{
		
		if(pos == 0)
		{
			head = head.link;
		}
		
		else
		{
			Node temp1 = head;
			Node temp2 = temp1;
		
		for(int i = 0; i< pos;i++)
		{
			temp2 = temp1;
			temp1 = temp1.link;
		}
		
		temp2.link = temp1.link;
		temp1 = null;
		}
		}
		
	}
	
	public static void deleteAtEnd()
	{
		if (head == null) {
		    System.out.println("List is empty. Cannot delete.");
		}
		else {
		Node temp1 = head;
		Node temp2 = temp1;
		while(temp1.link != null)
		{
			temp2 = temp1;
			temp1 = temp1.link;
		}
		
		temp2.link = null;
		temp1 = null;
	}
	}
	
	
	
	public static void traverse()
	{
		Node temp = head;
		
		while(temp != null)
		{
			System.out.print(temp.data + " ");
			temp = temp.link;
		}
	}
}

public class Singly_Linked_List extends Methods{
	public static void main(String[] args)
	{
		//Singly_Linked_List pa = new Singly_Linked_List();
		Scanner sc = new Scanner(System.in);
		int x  = 1;
		while(x == 1)
		{
			
		
		System.out.println("Enter 1 --> deleteAtBegain");
		System.out.println("	  2 --> deleteAtEnd");
		System.out.println("	  3 --> deleteAtMiddle");
		System.out.println(" 	  4 --> insertAtBegain");
		System.out.println(" 	  5 --> insertAtEnd");
		System.out.println(" 	  6 --> insertAtMiddle:");
		
		int n = sc.nextInt();
		
		
		if (n == 4)
			{
				System.out.println("Enter element: ");
				int y = sc.nextInt();
				
				insertAtBegain(y);
			}
		else if (n == 5)
		{
			System.out.println("Enter element: ");
			int y = sc.nextInt();
			
			insertAtEnd(y);
		}
		else if(n == 6)
		{
			System.out.println("Enter element & position: ");
			
			int y = sc.nextInt();
			int z = sc.nextInt();
			
			insertAtMiddle(y,z);
		}
		

		
		System.out.println();
		
		
		if(n == 1) deleteAtBegain();
		else if (n == 2) deleteAtEnd();
		else if (n == 3) 
		{
			System.out.println("Enter position: ");
			int m = sc.nextInt();
			deleteAtMiddle(m);
		}
		
		System.out.print("Result: ");
		traverse();
		
		System.out.println();
		System.out.println("Continue --> 1 or close --> 2");
		x  = sc.nextInt();
		
	}
		System.out.println("Thank you");
		sc.close();
	}

}
