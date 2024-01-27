//wap to search an element from n integer array 
import java.lang.*;
import java.util.*;
class P18
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter array size:");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.printf("Enter a[%d]:",i);
			a[i]=sc.nextInt();
		}
		
		System.out.print("Enter search element:");
		int s=sc.nextInt();
		int c=0;
		for(int i=0;i<n;i++)
		{
			if(a[i]==s){
				System.out.print("Elemnt found at:"+i);
				c=1;
				break;
			}
		}
		if(c==0)
		{
			System.out.print("Element not found");
		}
	}
}