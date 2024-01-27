import java.lang.*;
import java.util.*;
class p8{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Stack size:");
		int n=sc.nextInt();
		Stack obj=new Stack(n);
		System.out.println("0. Exit");
		System.out.println("1. Push");
		System.out.println("2. Pop");
		int c=1;
		while(c!=0)
		{
			System.out.println("Enter your choice");
			c=sc.nextInt();
			if(c==0)
					break;
			else if(c==1)
			{
				if(obj.top+1>=n)
					System.out.println("Stack overflow!");
				else
				{
					System.out.println("Enter element:");
					obj.push(sc.nextInt());
				}
			}
			else if(c==2)
			{
				obj.pop();
			}
			else
				System.out.println("Invalid choice!");
		}
	}
}
class Stack{
	int top=-1;
	int stack[];
	Stack(int a)
	{
		stack=new int[a];
	}
	void push(int a)
	{
		top++;
		stack[top]=a;
		display();
	}
	void pop()
	{
		if(top<0)
			System.out.println("Stack underflow!");
		else
		{
			int a=stack[top];
			System.out.println("Delted element: "+a);
			top--;
			display();
		}
	}
	void display()
	{
		for(int i=0;i<=top;i++)
			System.out.print(stack[i]+"  ");
		System.out.println("");
	}
}