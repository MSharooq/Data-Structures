import java.util.*;
import java.io.*;  

class i2p
{
		String infix,postfix="";
		Stack<String> stack=new Stack<String>();
		int size;
		String v1,v2;
		
		
		String conversion(String b)
		{
			postfix=b;
			char a;
			size=postfix.length();
				
			for(int i=0;i<size;i++)
				{
					a=postfix.charAt(i);
					if(Character.isLetter(a))
						{
						    String y=""+a;
							stack.push(y);
						}
					else
					{
					    v2=stack.pop();
					    v1=stack.pop();
					    switch(a)
					    {
					        case '+':v1=v1+"+"+v2;
					            stack.push(v1);
					            break;
					        
					        case '-':v1=v1+"-"+v2;
					        stack.push(v1);
					        break;
					        
					        case '/':v1=v1+"/"+v2;
					        stack.push(v1);
					        break;
					        
					        case '*':v1=v1+"*"+v2;
					        stack.push(v1);
					        break;
					    }
					 
					    
					}
				}
			infix=stack.pop();
				
			return infix;
		}
}

public class postfixtoinfix
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the postfixstring");
		String postfixstring=sc.nextLine();
		String infixstring="";
		
		i2p evaluater=new i2p();
		
		infixstring=evaluater.conversion(postfixstring);
		
		System.out.print("\nThe infix string of post string "+ postfixstring + "is " + infixstring );
		
		
	}
}
