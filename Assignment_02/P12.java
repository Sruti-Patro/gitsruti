import java.lang.*;
import java.util.*;
class P12
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("N:");
		int n=sc.nextInt();
		int a[]=new int[n];
		int s=0;
		float m;
		for(int i=0;i<n;i++)
		{
			System.out.printf("Enter a[%d]: ",i);
			a[i]=sc.nextInt();
			s=s+a[i];
        }
		m=s/n;
		System.out.print("Mean:"+m);
	}
}