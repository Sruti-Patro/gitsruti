import java.lang.*;
import java.util.*;
class P5
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("in the format of ax2 + bx + c:");
		System.out.print("Enter a:");
		int a=sc.nextInt();
		System.out.print("Enter b:");
		int b=sc.nextInt();
		System.out.print("Enter c:");
		int c=sc.nextInt();
		float r1,r2;
		int d;
		d=b*b-(4*a*c);
		if(d==0)
		{
			r1=r2=-b/(2*a);
			System.out.print("they have equal roots:"+r1);
		}
		else if(d>0)
		{
			r1=(-b-Math.sqrt(d))/(2*a);
			r2=(-b+Math.sqrt(d))/(2*a);
			System.out.println("root 1:"+r1);
			System.out.print("root 2:"+r2);
		}
		else
			System.out.print("Imaginary Roots");
	}
}