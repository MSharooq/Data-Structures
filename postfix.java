import java.util.*;
import java.io.*;  

class infixtopostfix
{
		String infix,postfix="";
		Stack<Character> stack=new Stack<Character>();
		int size;
		
		infixtopostfix()
		{
		    infix="";                 
		    postfix="";
		}
		
		int prec(char op) 
		{
            switch (op) 
            {
                    case '(':
                        return -1;
                    case '+':
                    case '-':
                        return 0;
                        
                    case '*':
                    case '/':
                    return 1;
                    
                    case '^':
                    return 2;
                    
                    default:
                    System.out.print("\nunknown operator");
                    return 0;
                    
            
            }
        }
 
		
		String conversion(String b)
		{
			infix=b;
			char a;
			size=infix.length();
				
			for(int i=0;i<size;i++)
				{
					a=infix.charAt(i);
					if(Character.isLetter(a))
						{
							postfix=postfix+a;
						}
					else if(a=='(')
						{
							stack.push('(');
						}
						
					else if(a==')')
					{
						while(stack.peek()!='(')
						{
							a=stack.pop();
							postfix=postfix+a;
						}
						stack.pop();
					}
					
					else
					{
						while(!stack.isEmpty() && prec(stack.peek())>=prec(a))
						{
						    System.out.print("\nlooprunning" );
						    if(prec(stack.peek())>=prec(a) && a!='(')
						    {
							    postfix=postfix+(stack.pop());
						    }
						}
						stack.push(a);
						
					}
				}
				
			while(!stack.isEmpty())
				{
					a=stack.pop();
					postfix=postfix+a;
				}
				
			return postfix;
		}
}

public class postfix
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the string");
		String infixstring=sc.nextLine();
		String postfixstring="";
		
		infixtopostfix converter=new infixtopostfix();
		
		postfixstring=converter.conversion(infixstring);
		
		System.out.print("\nThe postfix string of infix string "+ infixstring + "is " + postfixstring );
		
		
	}
}
