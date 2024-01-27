//sort array using bubble sort
import java.lang.*;
import java.util.*;
class P19
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
		int temp = 0;  
        for(int i=0;i<n;i++)
		{  
            for(int j=1;j<(n-i);j++)
			{  
                if(a[j-1] >a[j])
				{ 
                   temp = a[j-1];  
                   a[j-1] = a[j];  
                   a[j] = temp;  
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
	}
}
