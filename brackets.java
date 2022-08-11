import java.util.*;
import java.io.*;


class stack{

	private int top;
	private int max;
	private char arr[];
	
	
	public stack(int n){
		max=n;
		top=-1;
		arr=new char[max];
	}
	public void push(char c){
		top++;
		arr[top]=c;
	}
	public char pop(){
		return arr[top--];
	}
	public char peek(){
		return arr[top];
	}
	public boolean isFull(){
		if(top==max-1){
			return true;
		}
		else{
			return false;
		}
	}
	
	public boolean isEmpty(){
		if(top==-1){
			return true;
		}else{
			return false;
		}
	
	}

}

class brackets
{
	public static void main(String args[]){
		String text;
		int n;
		int flag=0;
		int count=0;
		char current;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter expression: ");
		text=sc.nextLine();
		
		n=text.length();
		
		sc.close();
		stack stk=new stack(n);
		
		for(int i=0;i<n;i++){
			if(!stk.isFull()){
				flag=0;
				current=text.charAt(i);
				
				if(current=='{' || current=='('|| current=='['){
					stk.push(current);
				}
				
				if(current=='}'||current==')' || current==']'){
					
					if(stk.isEmpty()){
						flag=0;
						break;		
					}
					char open=stk.pop();
					if((open=='{' && current=='}') || (open=='(' && current==')') || (open=='[' && current==']')){
						flag=1;
						count++;
						
					}
					else{
					flag=0;

					}
				
				}
			}
		}

if(stk.isEmpty())
{

	if(flag==1)
	{		
		System.out.println("Expression is a valid one:\nNo. of valid brackets: "+count);
	}
	else
	{
		System.out.println("Expression is not valid:\nMaximum no. of valid brackets: "+count);
	}
	
}

else
{
	System.out.println("Expression is not valid:\nMaximum no. of valid brackets: "+count);
}
		
		
	
	

}
}

