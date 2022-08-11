import java.util.Scanner;

class Node 
{
    int data;
    Node next;
    
    Node(int data) 
    {
        this.data = data;
    }

}

public class queue 
{
    public Node front, back;
    
    public void display() 
    {
        Node temp = front;

        while (temp != null) 
        {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    
    public boolean isEmpty() 
    {
        return front == null;
    }
    
    public void deletefromqueue() 
    {
        front = front.next;
        if (front == null) 
        back= null;
    }
    
    public void addtoqueue(int data) 
    {
        Node newNode = new Node(data);
        if (front == null) 
        {
            front = newNode;
            back = newNode;

            return;
        } 
        else 
        {
            back.next = newNode;
            back = newNode;
        }



    }
    public static void main(String[] args) 
    {
        queue sc = new queue();
        Scanner input = new Scanner(System.in);
        int temp;
        int choice = 0;
        while (choice != 4) 
        {
            System.out.println("\nEnter \n1 for addtoqueue, \n2 for deletefromqueue, \n3 for displaying  \n4 for exit: ");
            choice = input.nextInt();
            switch (choice) 
            {

                case 1:
                    System.out.println("Enter number to add");
                    temp = input.nextInt();
                    sc.addtoqueue(temp);
                    break;
                
                case 2:
                    if (!sc.isEmpty()) 
                    sc.deletefromqueue();
                    
                    else 
                    System.out.println("Queue is empty");
                    
                    break;

                case 3:
                    if (!sc.isEmpty()) 
                    {
                    System.out.println("\nThe Queue Is");
                    sc.display();
                    }
                    
                    else System.out.println("Queue is empty");
                    break;

            }

        }
    }

}
