import java.lang.*;
import java.util.*;
class P8
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no.:");
		int a=sc.nextInt();
		int c=0;
		if(a==1 || a==0)
		{
				System.out.print("Neither prime nor composite");
				c=1;
		}
		else{
			for(int i=2;i<a;i++)
			
				if(a%i==0)
				{
					System.out.print("Not Prime");
					c=1;
					break;
				}
			
		}
		if(c==0)
			System.out.print("Prime");
	}
}