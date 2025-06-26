package Linked_Lists;

	
	class DubNode
	{
		DubNode pre;
		int data;
		DubNode next;
	}
	
	class DubMethod 
	{
		static DubNode head;
		static DubNode tail;
		
		public static void insertAtBegining(int data)
		{
			DubNode newNode1 = new DubNode();
			
			newNode1.pre = null;
			newNode1.data = data;
			newNode1.next = null;
			
			if(head == null)
			{
				head = newNode1;
				tail = head;
			}
			
			else
			{
				newNode1.next = head;
				head.pre = newNode1;
				head = newNode1;
			}
		}
		
		public static void insertDubAtMiddle(int data,int pos)
		{
			DubNode newNode1 = new DubNode();
			
			newNode1.pre = null;
			newNode1.data = data;
			newNode1.next = null;
			
			if (pos == 0)
			{
				newNode1.next = head;
				head.pre = newNode1;
				head = newNode1;
			}
			
			else
			{
				DubNode temp1 = head;
				DubNode temp2 = null;
				
				for(int i = 0;i < pos;i++)
				{
					temp2 = temp1;
					temp1 = temp1.next;
				}
				
				temp2.next = newNode1;
				newNode1.pre = temp2;
				newNode1.next = temp1;
				temp1.pre = newNode1;
			}
		}
		
		public static void insertDubAtEnd(int data)
		{
			DubNode newNode1 = new DubNode();
			
			newNode1.pre = null;
			newNode1.data = data;
			newNode1.next = null;
			
			if(head == null)
			{
				head = newNode1;
				tail = head;
			}
			
			else
			{
				tail.next = newNode1;
				newNode1.pre = tail;
				tail = newNode1;
			}
			
		}
		
		public static void deleteDubAtBegain()
		{
			if(head == null)
			{
				System.out.println("Empty list");
			}
			else
			{
				head = head.next;
				head.pre = null;
			}
		}
		
		public static void deleteDubAtMiddle(int pos)
		{
			if(pos == 0)
			{
				head = head.next;
				head.pre = null;
			}
			else
			{
			DubNode temp1 = head;
			DubNode temp3 = null;
			DubNode temp2 = null;
			for(int i = 0; i < pos;i++)
			{
				temp1 = temp1.next;
			}
			temp2 = temp1.pre;
			temp3 = temp1.next;
			temp2.next = temp3;
			temp3.pre = temp2;
			temp1 = null;
			}
			
		}
		
		public static void deleteDubAtEnd()
		{
			if(head == null)
			{
				System.out.println("Empty list");
			}
			else
			{
				tail = tail.pre;
				tail.next = null;
			}
		}
		
		public static void traverse()
		{
			DubNode temp1 = head;
			while(temp1 != null)
			{
				System.out.print(temp1.data + " ");
				temp1 = temp1.next;
			}
		}
			
	}

public class Doubly_Liked_list extends DubMethod
{
	public static void main(String[] args)
	{
		insertAtBegining(1);
		insertAtBegining(2);
		insertDubAtEnd(3);
		insertDubAtMiddle(5,1);
		//deleteDubAtBegain();
		//deleteDubAtEnd();
		//deleteDubAtMiddle(1);
		traverse(); 

	}
}
