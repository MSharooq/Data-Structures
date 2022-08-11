import java.util.*;


class link
{
	link left;
	link right;
	int data;
	
	link(int d)
	{
		left=null;
		right=null;
		data=d;
	}
	
}


public class binarytree
{
	link root;
	
	binarytree(link rt)
	{
		root=rt;
	}
	
	
	public void insert(int key)
	{
	 link nl=new link(key);
	 link current=root;
	 link current1=current;
	 
	 while(current!=null)
	 {
		 if(key>=current.data)
		 {	
	        current1=current;
		 	current=current.right;	 	
		 }
	 
		 else
		 {
		 	current1=current;
		 	current=current.left;
		 }
	 }
	 
	 if(key>=current1.data)
	 current1.right=nl;
	 
	 else
	 current1.left=nl;
	 
	 }
	 
	 
	 public void insertarray(int[] arr)
	 {
	 	int size= arr.length;
	 	for(int i=0;i<size;i++)
	 	{
	 		insert(arr[i]);
	 	}
	 }
	 
	 void inOrder(link node) 
	 {
		if (node == null)
		 return;

		inOrder(node.left);
		System.out.print(node.data + "->");
		inOrder(node.right);
  	}
  	
  	void preorder(link node)
    	{
		if (node == null)
		    return;
	  
		System.out.print(node.data + "->");
		preorder(node.left);
		preorder(node.right);
    	}
    	
    	void postorder(link node)
    	{
		if (node == null)
		    return;

		postorder(node.left);
		postorder(node.right);
		System.out.print(node.data + "->");
   	 }
    
  	boolean isempty()
  	{
  		if(root==null)
 		return true;
 		else
 		return false;
 		
  	}
  	
  	public static void main(String args[])
	{
	System.out.println("enter key element");
	Scanner sc1= new Scanner(System.in);
	int temp=sc1.nextInt();
	link x=new link(temp);
	binarytree bt=new binarytree(x);
	do
	{
		System.out.println("PRESS 1  TO ADD AN ELEMENT");
		System.out.println("PRESS 2  TO SEE INORDER TRAVERSAL");
		System.out.println("PRESS 3  TO INSERT AS AN ARRAY");
		System.out.println("PRESS 4  FOR PREORDER");
		System.out.println("PRESS 5 FOR POSTORDER");
		
		int choice;
		Scanner sc= new Scanner(System.in);
		choice=sc.nextInt();
		
		switch (choice)
			{
				case 1:System.out.println("Enter Data");
						int temp1=sc.nextInt();
						bt.insert(temp1);
							
						break;
				
				case 2:bt.inOrder(bt.root);
						break;
						
				case 3: System.out.println("Enter no of elements");
						int size=sc.nextInt();
						System.out.println("Enter elements");
						for(int i=0;i<size;i++)
						{
							int y=sc.nextInt();
							bt.insert(y);
						}
						break;
				case 4: 
				bt.preorder(bt.root);
				break;

				case 5: 
					bt.postorder(bt.root);
					break;
				
				
			}
		
		}while(true);
	
	}
	 
	 
}
