import java.lang.*;
import java.util.*;
class P15
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("4 digit no:");
		int n=sc.nextInt();
		//System.out.println(n);
		int s=0;
		for(;n>10;n=n/10)
		{
			s=s+(n%10);
			//System.out.println(n+" "+s);
		}
		s=s+n;
		System.out.print("Sum of the above no:"+s);
	}
}