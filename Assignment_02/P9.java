import java.lang.*;
import java.util.*;
class P9
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a no. to check for palindrome:");
		int a=sc.nextInt();
		int n=a,ra=0,d;
		for(;n!=0;n=n/10)
		{
			d=n%10;
			ra=ra*10+d;
		}
		if(a==ra)
			System.out.print("Palindrome");
		else
			System.out.print("Not Palindrome");
	}
}