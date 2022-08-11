import java.util.*;
import java.io.*;  



public class cqueue
{
	int SIZE = 7;
  	int front, rear;
  	int items[] = new int[SIZE];
  	
  	
  	cqueue() 
  	{
	    front = -1;
	    rear = -1;
  	}
  	
  	
  	boolean isFull() 
  	{
    
		if (front == 0 && rear == SIZE - 1) 
		{
		return true;
		}

		if (front == rear + 1) 
		{
		return true;
		}

		return false;
  	}
  	
  	
  	boolean isEmpty() 
  	{
    
		if (front == -1)
		return true;

		else
		return false;
  	}
  	
  	
  	void insert(int element) 
  	{
		if (isFull()) 
		{
			System.out.println("Queue is full");
		} 

		else 
		{
			if (front == -1)
				front = 0;
			
			rear = (rear + 1) % SIZE;
			items[rear] = element;
			
		}
  	}
  	
  	
  	int delete() 
  	{
		int element;
		if (isEmpty()) 
		{
			System.out.println("Queue is empty");
			return (-1);
		} 

		else 
		{
			element = items[front];
			if (front == rear) 
			{
				front = -1;
				rear = -1;
			} 

			else 
			{
				front = (front + 1) % SIZE;
			}
		System.out.println("item removed is "+element);
		return (element);
		}
  	}
  	
  	
  	void display() 
  	{
		int i;

		if (isEmpty()) 
		{
			System.out.println("Empty Queue");
		} 

		else 
		{
			System.out.println("\nCurrent Front " + front);
			System.out.println("Items are ");
		
		for (i = front; i != rear; i = (i + 1) % SIZE)
		System.out.println("["+ items[i] +"] ");
		
		
		System.out.println("["+items[i]+"]");
		System.out.println("Current rear is " + rear);
		}
  	}


	public static void main(String args[])
	{
	cqueue q= new cqueue();
	do
	{
		System.out.println("PRESS 1  TO ADD AN ELEMENT");
		System.out.println("PRESS 2  TO REMOVE AN ELEMENT");
		
		int choice;
		Scanner sc= new Scanner(System.in);
		choice=sc.nextInt();
		
		switch (choice)
			{
				case 1:System.out.println("Enter Data");
					int temp1=sc.nextInt();
					q.insert(temp1);
					q.display();
							
							
				break;
				
				case 2:	
					q.delete();
					q.display();
							
				break;
				
			}
		
		}while(true);
	
	}
}
