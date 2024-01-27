//22.find fatorial of 1-n
import java.lang.*;
import java.util.*;
class P22
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter n of factorial:");
		int n=sc.nextInt();
		int f;
		for(int i=1;i<=n;i++)
		{
			f=1;
			for(int j=1;j<=i;j++)
				f=f*j;
			System.out.printf("%nFactorial of %d: %d",i,f);
		}
		
	}
}