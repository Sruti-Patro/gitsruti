import java.lang.*;
import java.util.*;
class P7
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no.:");
		int a=sc.nextInt();
		long f=1;
		for(int i=1;i<=a;i++)
			f=f*i;
		System.out.print("Factorial:"+f);
	}
}