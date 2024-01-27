//wap to input two int and find their gcd
import java.util.*;
import java.lang.*;
class P16{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no. 1:");
		int a=sc.nextInt();
		System.out.print("Enter no. 2:");
		int b=sc.nextInt();
		int gcd=1,small;
		small=(a<b)?a:b;
		for(int i=1;i<=small;i++)
		{
			if(a%i==0&&b%i==0)
			{
				gcd=i;
			}
		}
		System.out.print("GCD of the inputed no.:"+gcd);
	}
}