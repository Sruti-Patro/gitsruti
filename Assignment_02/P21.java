//21.input arr and disp ele the are%2
import java.lang.*;
import java.util.*;
class P21
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
		for(int i=0;i<n;i++)
		{
			if(a[i]%2==0){
				System.out.println(a[i]);
			}
		}
	}
}