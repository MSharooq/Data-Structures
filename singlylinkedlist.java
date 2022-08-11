import java.util.*;

class link
{
    int data;
    link next;
    
    public link(int d)
    {
        data=d;
    }
    
    public void displaylink()
    {
        System.out.println(data);
    }

}

class linkedlist
{
    link first;
    
    public linkedlist()
    {
        first=null;
    }
    
    public boolean isempty()
    {
        return(first==null);
    }
    
    public void insertfirst(int d)
    {
        link newlink=new link(d);
        newlink.next=first;
        first=newlink;
    }
    
    public void deletefirst()
    {
        if(!isempty())
        {
        link temp=first;
        first=first.next;
        temp.displaylink();
        }
        else
        System.out.println("linkedlist is empty.");
    }
    
    public void display()
    {
        if(!isempty())
        {
            link current=first;
            while(current!=null)
            {
                current.displaylink();
                current=current.next;
            }
        }
        else
        System.out.println("linkedlist is empty.");
    }
}
public class singlylinkedlist
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int flag=0, ch;
        linkedlist LL= new linkedlist();
        
        while(flag==0)
        {
            System.out.println("1. Insert first\n2. Delete first\n3. Display linkedlist\n4. To stop");
            ch=sc.nextInt();
            
            switch(ch)
            {
                case 1:
                
                    System.out.println("Enter VALUE");
                    int n=sc.nextInt();
                    LL.insertfirst(n);
                    break;
                
                case 2:
                
                    LL.deletefirst();
                    break;
                
                case 3:
                
                    System.out.println("The linkedlist:");
                    LL.display();
                    break;
                
                case 4:
                
                    flag=1;
                    break;
                
                default:
                System.out.println("Seems like you have pressed the wrong button");
            }
        }
    }
}
