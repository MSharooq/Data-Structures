import java.util.*;

class Node {
    int data;
    Node prev;
    Node next;
    Node(int data) 
    {
        this.data = data;
    }
}

public class dll
{
    public Node front;
    public Node last;

    public void addNode(int data) 
    {

        Node newNode = new Node(data);
        if (front == null) 
        {
            front = newNode;
        } 
        
        else 
        {
            last.next = newNode;
            newNode.prev = last;
        }
        last = newNode;

    }
    
    public void displayfirsttolast() 
    {
        if (front == null) 
        {
            System.out.println("empty");
            return;
        }
        Node temp = front;
        
        while (temp.next != null) 
        {
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println(temp.data);

    }
    
    public void displaylasttofirst() 
    {
        if (front == null) 
        {
            System.out.println("empty");
            return;
        }
        Node temp = last;
        while (temp.prev != null) 
        {
            System.out.println(temp.data);
            temp = temp.prev;
        }
        System.out.println(temp.data);

    }

    public void delete(int data) 
    {
        Node temp = front;
        if (temp.data == data) 
        {
            front = temp.next;
            front.prev = null;
            return;
        }
        
        while (temp.next != null) 
        {

            if (temp.data == data) 
            {
                if (temp.next == last) 
                {
                    last = temp.prev;
                    last.next = null;
                } 
                
                else 
                {
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                }

                return;
            }
            temp = temp.next;

        }
        System.out.println("No matching data found");
    }

    public void insert(int searchData, int data) 
    {
        Node newNode = new Node(data);
        Node temp = front;
        
        if (front.data == searchData) 
        {
            newNode.next = front;
            front.prev = newNode;
            front = newNode;
            return;

        }
       
        while (temp.next != null) 
        {
            if (searchData == temp.data) 
            {
                
                temp=temp.next;
                newNode.next = temp;
                temp.prev.next = newNode;
                temp.prev = newNode;
                return;

            }
            temp = temp.next;
        }
        System.out.println("No matching data found");

    }
    
    public static void main(String[] args) 
    {
        dll obj = new dll();
        Scanner sc = new Scanner(System.in);
        int choice = 0, temp;
        
        while (choice != 6) 
        {
            System.out.println("1 to add\n 2 for delete\n 3 for insert between\n 4 for displaying forward\n 5 for displaying backward\n 6 for exit: ");
            choice = sc.nextInt();
            
            switch (choice) 
            {

                case 1:
                    System.out.println("Enter Value");
                    temp = sc.nextInt();
                    obj.addNode(temp);
                    break;

                case 2:
                    System.out.println("Enter Value to be deleted");
                    temp = sc.nextInt();
                    obj.delete(temp);
                    break;

                case 3:
                    System.out.println("Enter element to insert after");
                    temp = sc.nextInt();
                    System.out.println("Enter Value");
                    int data = sc.nextInt();
                    obj.insert(temp, data);
                    break;

                case 4:
                    System.out.println("Elements in left to right order");
                    obj.displayfirsttolast();
                    break;

                case 5:
                    System.out.println("Elements in reverse order");
                    obj.displaylasttofirst();
            }

        }
    }


}
