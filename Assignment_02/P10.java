import java.lang.*;
import java.util.*;
class P10
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a decimal no. to find its binary equivalent:");
		int n=sc.nextInt();
		/*long n=a,ra=0,d;
		for(;n!=0;n=n/2)
		{
			d=n%2;
			ra=ra*10+d;
		}
		long r=0;
		for(;ra!=0;ra=ra/10)
		{
			d=ra%2;
			r=r*10+d;
		}*/
		long bn = 0;
		int r, i = 1;
		while (n!=0) {
			r=n%2;
			n=n/2;
			bn=bn+r*i;
			i=i*10;
		}
		System.out.print("It's binary equivalent:"+bn);
	}
}