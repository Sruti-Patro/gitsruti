import java.lang.*;
import java.util.*;
class P14
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
		int s,l,x;
		s=l=a[0];
		for(int i=1;i<n;i++)
		{
			if(a[i]>l)
				l=i;
			else if(a[i]<s)
				s=i;
		}
		x=a[l];
		a[l]=a[s];
		a[s]=x;
		for(int i=0;i<n;i++)
			System.out.println(a[i]);
	}
}