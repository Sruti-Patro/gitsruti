import java.lang.*;
import java.util.*;
class P1
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no.:");
		int n=sc.nextInt();
		if(n>0)
			System.out.print("Positive");
		else if(n<0)
			System.out.print("Negative");
		else
			System.out.print("neither Positive nor Negative");
	}
}