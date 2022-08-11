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


class stackqueue
{
    link first;
    
    public stackqueue()
    {
        first=null;
    }
    
    public boolean isempty()
    {
        return(first==null);
    }
    
    public void push(int d)
    {
        link newlink=new link(d);
        newlink.next=first;
        first=newlink;
    }
    
    public void pop()
    {
        if(!isempty())
        {
        link temp=first;
        first=first.next;
        temp.displaylink();
        }
        else
        System.out.println("stackqueue is empty.");
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
        System.out.println("stackqueue is empty.");
    }
}
public class stkqueue
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int flag=0, ch;
        stackqueue LL= new stackqueue();
        
        while(flag==0)
        {
            System.out.println("1. push\n2. pop\n3. Display stack\n4. To stop");
            ch=sc.nextInt();
            
            switch(ch)
            {
                case 1:
                
                    System.out.println("Enter VALUE");
                    int n=sc.nextInt();
                    LL.push(n);
                    break;
                
                case 2:
                
                    LL.pop();
                    break;
                
                case 3:
                
                    System.out.println("The stackqueue:");
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
