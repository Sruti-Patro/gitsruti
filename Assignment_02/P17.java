//wap to input an int arr of n ele and disp their largest and smallest in array
import java.lang.*;
import java.util.*;
class P17
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
		int s,l;
		s=l=a[0];
		for(int i=1;i<n;i++)
		{
			if(a[i]>l)
				l=a[i];
			else if(a[i]<s)
				s=a[i];
		}
		System.out.println("Smallest:"+s);
		System.out.print("Largest:"+l);
	}
}