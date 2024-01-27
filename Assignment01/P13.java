import java.lang.*;
import java.util.*;
class P13
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("no 1:");
		int a=sc.nextInt();
		System.out.println("no 2:");
		int b=sc.nextInt();
		int c=(a>b)?a:b;
		System.out.print("largest no:"+c);
	}
}